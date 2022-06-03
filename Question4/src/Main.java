import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Integer max = Stream.of(6, 8, 3, 5, 1, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer min = Stream.of(6, 8, 3, 5, 1, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(max);
        System.out.println(min);
    }
}
