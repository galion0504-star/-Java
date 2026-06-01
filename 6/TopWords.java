import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "topword.txt";
        File file = new File(filePath);
        Scanner scanner;

        try {
            scanner = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }

        Map<String, Integer> wordCount = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next()
                    .toLowerCase()
                    .replaceAll("[^a-zа-я0-9]", "");

            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        System.out.println("Топ-10 слов:");
        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
        }
    }
}
