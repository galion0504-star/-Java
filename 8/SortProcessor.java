import java.util.List;
import java.util.stream.Collectors;

public class SortProcessor {

    @DataProcessor
    public List<Integer> sort(List<Integer> data) {
        return data.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
