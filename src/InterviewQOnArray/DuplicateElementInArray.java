package InterviewQOnArray;


import java.util.*;

public class DuplicateElementInArray {

    public static void main(String args[]) {

        Integer[] ints = {1, 1, 2, 2, 2, 3, 3, 3};
        List<Integer> intsList = Arrays.asList(ints);

        String[] names = {"a", "a", "b", "b", "b", "c", "c", "c"};
        List<String> stringsList = Arrays.asList(names);

        //First solution :Finding duplicate elements in array using brute force method
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j]) && (i != j)) {
                    System.out.println(names[i]);
                }
            }
        }

        // Second solution : use HashSet data structure to find duplicates
        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (!store.add(name)) {
                System.out.println("HashSet : " + name);
            }
        }

        // Third solution : using Hash table data structure to find duplicates
        Map<String, Integer> nameAndCount = new HashMap<>();
        for (String name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "==>" + entry.getValue());
            }
        }
    }
}