package collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class aaaTo3a {

    public static void main(String[] args) {

        String str = "aaabbcccc";
        String[] strings = str.split("");
        List<String> stringsList = Arrays.asList(strings);

        stringsList = Arrays.asList("a", "a", "a", "b", "b", "c", "c", "c", "c");

        Set<String> uniqueSet = new HashSet<String>(stringsList);

        for (String element : uniqueSet) {
            System.out.print(Collections.frequency(stringsList, element) + element);
        }

        withJava8(stringsList);
        withHashMap(stringsList);
    }

    private static void withJava8(List<String> stringList) {
        Map<String, Long> map = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
    }

    private static void withHashMap(List<String> stringList) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        printMapInFormat(map);
    }

    public static void printMapInFormat(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + entry.getKey());
        }

        map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

        Set<String> strings = map.keySet();
        strings.forEach(key -> System.out.println(key));
        strings.forEach(System.out::println);
    }
}
