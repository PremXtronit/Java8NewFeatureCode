package collection;


import java.util.HashMap;
import java.util.Map;

public class HashMapIterateUsingJava8 {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);

        items.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

        items.forEach((k, v) ->
                {
                    System.out.println("key : " + k + " value : " + v);
                    if ("E".equals(k)) {
                        System.out.println("Hello E");
                    }
                }
        );
    }
}
