package CollectionMyHashMap;


import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class SortHMapBasedOnKeysAndValue {

    public static void main(String args[]) throws ParseException {

        HashMap<String, String> unsortedMap = new HashMap<>();
        unsortedMap.put("KeyA", "ValueD");
        unsortedMap.put("KeyB", "ValueC");
        unsortedMap.put("KeyC", "ValueB");
        unsortedMap.put("KeyD", "ValueA");

        System.out.println("HashMap before sorting, random order " + unsortedMap);
        Set<Map.Entry<String, String>> entries = unsortedMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        TreeMap<String, String> sorted = new TreeMap<>(unsortedMap);
        Set<Map.Entry<String, String>> mappings = sorted.entrySet();
        System.out.println("HashMap after sorting by keys in ascending order ");
        for (Map.Entry<String, String> mapping : mappings) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }


        System.out.println("HashMap after sorting entries by values ");
        Comparator<Map.Entry<String, String>> valueComparator =
                new Comparator<Map.Entry<String, String>>() {
                    @Override
                    public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
                        String v1 = e1.getValue();
                        String v2 = e2.getValue();
                        return v1.compareTo(v2);
                    }
                };

        List<Map.Entry<String, String>> listOfEntries = new ArrayList<>(entries);
        Collections.sort(listOfEntries, valueComparator);
        for (Map.Entry<String, String> entry : listOfEntries) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        sortMapByJava8(unsortedMap);

    }

    //Java 8
    private static void sortMapByJava8(HashMap<String, String> unsortedMap) {
        Map result = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        result.forEach((k, v) -> System.out.println(k + " ==> " + v));

        List<Map.Entry<String, String>> list = new LinkedList<>(unsortedMap.entrySet());
        list.sort((Map.Entry<String, String> o1, Map.Entry<String, String> o2) -> o1.getValue().compareTo(o2.getValue()));
        //now list sorted based on value, convert it into map
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        list.forEach(kvEntry -> {
            sortedMap.put(kvEntry.getKey(), kvEntry.getValue());
        });
        sortedMap.forEach((k, v) -> System.out.println(k + " ==> " + v));
    }
}


