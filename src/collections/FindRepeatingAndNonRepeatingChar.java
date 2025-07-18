package collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatingAndNonRepeatingChar {

    public static void main(String[] args) {
        String str = "javaprogrammingtoday";
        char[] chars = str.toCharArray();
        String[] stringArray = str.split("");

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : chars) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        List<Character> repeating = new ArrayList<>();
        List<Character> nonRepeating = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeating.add(entry.getKey());
            } else {
                nonRepeating.add(entry.getKey());
            }
        }

        System.out.println("Repeating characters: " + repeating);
        System.out.println("Non-repeating characters: " + nonRepeating);
    }
}
