import java.util.List;
import java.util.stream.Collectors;

public class FilterProcessor {

    @DataProcessor
    public List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());
    }
}
