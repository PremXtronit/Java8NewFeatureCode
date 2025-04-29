package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharactersOrWord {

    public static void main(String[] args) {

        String inStr = "abracadabra";
        String[] strings = inStr.split("");
        withHasMap(strings);
        withJava8(strings);
    }

    private static void withHasMap(String[] strings) {

        Map<String, Integer> map = new HashMap();

        for (String ch : strings) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map.get("a"));
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet() ){
            System.out.println("Key - " + entry.getKey() + "Value - " +entry.getValue());
        }
    }

    private static void withJava8(String[] strings) {

        Stream<String> stream = Arrays.stream(strings);

        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

    }


}
