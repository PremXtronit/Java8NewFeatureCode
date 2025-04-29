package searching;

//Java examples to check if an Array (String or Primitive type) contains a certain values, updated with Java 8 stream APIs.

//Example to check if a String Array contains multiple values :

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StringPrimitiveArrayJava8 {

    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "B", "C"};
        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        if (list.contains("A")) {
            System.out.println("A Found");
        }
        // Convert to stream and test it
        boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (result) {
            System.out.println("A Found");
        }
        String[] strings = new String[]{"A", "C"};

        // Convert String Array to List
        List<String> stringList = Arrays.asList(strings);

        // A or B
        if (stringList.contains("A") || stringList.contains("B")) {
            System.out.println("A or B Found");
        }

        // A and B
        if (stringList.containsAll(Arrays.asList("A", "B"))) {
            System.out.println("A and B Found");
        }

        // A and C
        if (stringList.containsAll(Arrays.asList("A", "C"))) {
            System.out.println("A and C Found");
        }

        // Convert to stream and test it
        Predicate<String> p1 = e -> e.equals("A");// && e.equals("C");
        boolean result1 = Arrays.stream(strings).allMatch(p1);
        if (result1) {
            System.out.println("A Found");
        }
        //1. For primitive array like int[], you need to loop it and test the condition manually :
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (contains(intArray, 2)) {
            System.out.println("2 Found in Given intArray");
        }

        //2. With Java 8, coding is much simpler
        boolean intResult = IntStream.of(intArray).anyMatch(x -> x == 4);

        if (intResult) {
            System.out.println("4 Found");
        } else {
            System.out.println("Where is number 4?");
        }

        long[] longs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result2 = LongStream.of(longs).anyMatch(x -> x == 10);

        if (result2) {
            System.out.println("10 Found");
        } else {
            System.out.println("Where is number 10?");
        }

        IntStream.of(intArray);
        LongStream.of(longs);
        DoubleStream.of();
    }

    public static boolean contains(final int[] array, final int item) {

        boolean result = false;

        for (int i : array) {
            if (i == item) {
                result = true;
                break;
            }
        }
        return result;
    }
}
