import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Integer> input = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        //Set<Integer> result = findDuplicateBySetAdd(list);
        Set<Integer> items = new HashSet<>();
        Set<Integer> finalItems = items;
        items =  input.stream()
                .filter(n -> !finalItems.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());


        items.forEach(System.out::println);
    }
}
