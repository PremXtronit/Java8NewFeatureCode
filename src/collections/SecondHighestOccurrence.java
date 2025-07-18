package collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestOccurrence {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 3, 4, 1, 3, 2, 2, 5);
        // Step 1: Count frequency
        Map<Integer, Long> fMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 2: Extract frequencies, sort descending, get second highest
        List<Long> sortedFrequencies = fMap.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedFrequencies);

        //get second position element
        Long secondHighestFreq = sortedFrequencies.get(1);

        // Step 3: Filter entries with second-highest frequency
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Long> entry : fMap.entrySet()) {
            if (entry.getValue().equals(secondHighestFreq)) {
                Integer key = entry.getKey();
                result.add(key);
            }
        }

        System.out.println(result);

        // Step 3: Filter entries with second-highest frequency
        List<Integer> result2 = fMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(secondHighestFreq))
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result2);

    }

}
