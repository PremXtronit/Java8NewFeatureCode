package collections;


import java.util.*;

public class CollectionsCountDuplicatedList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "b", "c", "a", "a", "a");


        System.out.println("a : " + Collections.frequency(list, "a"));


        Set<String> uniqueSet = new HashSet<String>(list);
        for (String temp : uniqueSet) {
            System.out.println(temp + ": " + Collections.frequency(list, temp));
        }


        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        printMap(map);


        Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        printMap(treeMap);

        List<String> strings = Collections.unmodifiableList(list);
        strings.forEach(System.out::println);

    }

    public static void printMap(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

    }
}
