package java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapMethods {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "b", "c", "d");

        /* Java 8 */
        List<String> collect = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        /* Extra, streams apply to any data type. */
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]

        List<Integer> evenMultiple = num.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
        System.out.println(evenMultiple); //[2, 4, 6, 8, 10]


    }
}
