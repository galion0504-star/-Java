import java.util.List;
import java.util.stream.Collectors;

public class TransformProcessor {

    @DataProcessor
    public List<Integer> transform(List<Integer> data) {
        return data.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
