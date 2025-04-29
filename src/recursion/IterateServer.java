package recursion;


import java.util.Arrays;
import java.util.List;

public class IterateServer {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        recursiveCall(integers);
    }

    private static void recursiveCall(List<Integer> integers) {
        if (integers.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println(integers);
            System.out.println(integers.get(0));
            recursiveCall(integers.subList(1, integers.size()));
        }
    }
}
