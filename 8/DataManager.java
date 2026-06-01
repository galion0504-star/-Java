import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class DataManager {

    private List<Integer> data = new ArrayList<>();
    private final List<Object> processors = new ArrayList<>();

    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    public void loadData(String source) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(source));

        for (String line : lines) {

            String[] numbers = line.split("\\s+");

            for (String num : numbers) {
                data.add(Integer.parseInt(num));
            }
        }
    }

    public void processData() throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(processors.size());

        List<Integer> currentData = new ArrayList<>(data);

        for (Object processor : processors) {

            for (Method method : processor.getClass().getDeclaredMethods()) {

                if (method.isAnnotationPresent(DataProcessor.class)) {

                    List<Integer> finalData = currentData;

                    Future<List<Integer>> future =
                            executor.submit(() ->
                                    (List<Integer>) method.invoke(processor, finalData));

                    currentData = future.get();
                }
            }
        }

        data = currentData;

        executor.shutdown();
    }

    public void saveData(String destination) throws IOException {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter(destination));

        for (Integer number : data) {
            writer.write(number + " ");
        }

        writer.close();
    }

    public List<Integer> getData() {
        return data;
    }
}
