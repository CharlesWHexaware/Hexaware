import java.util.*;

public class Main {
    public static void main(String[] args){
//List = {4,5,7,8,99,100,101,33,32,4,4}
        List<Integer> input = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        //4,4,4,5,7,8,32,33,99,100,101
        Collections.sort(input);
        List<Integer> removed = new ArrayList<>();
        for(int i = 0; i < input.size() - 1; i++){
            if(input.get(i) != input.get(i + 1)){
                removed.add(input.get(i));
            }
        }
        for(int i = 0; i < removed.size(); i++){
            System.out.println(removed.get(i));
        }
    }
}
