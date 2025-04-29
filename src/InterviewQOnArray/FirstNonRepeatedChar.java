package InterviewQOnArray;


import java.util.*;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        String string = "1233445566";
        getFirstNonRepeatedChar(string);
    }

    public static void getFirstNonRepeatedChar(String str) {

        Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(str.length());

        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        System.out.println(counts);

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "    " + entry.getValue());
            }
        }

    }

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<Character>();
        List<Character> nonRepeating = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }

    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        return 'z';
    }

}
