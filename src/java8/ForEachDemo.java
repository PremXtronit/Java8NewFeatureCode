package java8;

import java8.lambda_comparator.Developer;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        map.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

        Set<String> items = map.keySet();

        items.forEach(item -> System.out.println(item));

        //Output : C
        items.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });

        //method reference
        items.forEach(System.out::println);

        //Output : B
        items.stream().filter(s -> s.contains("B")).forEach(System.out::println);

        Collection<Integer> values = map.values();

        List<Integer> integers = values.stream().map(val -> val * 2).collect(Collectors.toList());

        System.out.println(integers);

        List<Developer> list= new ArrayList<>();
        list.add(new Developer(1,"name",33));
        list.forEach(x->x.setSalary(40));
        System.out.println(list);

    }

}
