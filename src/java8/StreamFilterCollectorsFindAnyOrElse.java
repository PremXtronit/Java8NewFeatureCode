package java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollectorsFindAnyOrElse {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100, 12001, 2001, 2003, 120, 20, 3, 4);
        // converting Stream to List in Java '

        List<Integer> listOf100s = numbers.stream().filter(num -> num > 100).collect(Collectors.toList());
        System.out.println("list of numbers greater than 100: " + listOf100s);

        // Converting Stream to ArrayList in Java
        List<Integer> listOf200s = numbers.stream().filter(num -> num > 200).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("list of numbers greater than 200: " + listOf200s);

        // Converting Stream to LinkedList in Java
        List<Integer> listOf200sLL = numbers.stream().filter(num -> num > 200).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("list of numbers greater than 200: " + listOf200sLL);

        //Collectors.toList();
        //Collectors.toSet();
        //Collectors.groupingBy();

        Collectors.joining();
        Collectors.counting();

        Long count = numbers.stream().filter(num -> num > 100).collect(Collectors.counting());
        System.out.println(count);

        Integer findNumber = numbers.stream().filter(x -> x == 100).findAny().orElse(0);

    }
}
