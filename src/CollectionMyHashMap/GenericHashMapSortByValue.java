package CollectionMyHashMap;


import java.util.*;

public class GenericHashMapSortByValue {


    public static void main(String[] args) {

        HashMap<String, String> unsortedMap = new HashMap<>();
        unsortedMap.put("KeyA", "ValueD");
        unsortedMap.put("KeyB", "ValueC");
        unsortedMap.put("KeyC", "ValueB");
        unsortedMap.put("KeyD", "ValueA");

        Map sortedMap = sortByValue(unsortedMap);
        printMap(sortedMap);

        //java8
        sortByValueJava8(unsortedMap);
    }


    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortedMap) {

        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        //now list sorted based on value, convert it into map
        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        System.out.println("Generic Way of HashMap  sorting entries by values ");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }

    private static <K, V extends Comparable<? super V>> void sortByValueJava8(HashMap<K, V> unsortedMap) {

        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortedMap.entrySet());
        list.sort((Map.Entry<K, V> o1, Map.Entry<K, V> o2) -> o1.getValue().compareTo(o2.getValue()));
        //now list sorted based on value, convert it into map
        Map<K, V> result = new LinkedHashMap<K, V>();
        list.forEach(kvEntry -> {
            result.put(kvEntry.getKey(), kvEntry.getValue());
        });
        result.forEach((k, v) -> System.out.println(k + " ==> " + v));
    }

}


class User {

    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id && name.equals(user.name);

    }

    @Override
    public int hashCode() {

        return 31 * id + (name != null ? name.hashCode() : 0);
    }
}