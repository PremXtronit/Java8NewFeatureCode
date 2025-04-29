package InterviewQOnString35;


import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

    static void duplicateWords(String inputString) {

        String[] words = inputString.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String word : words) {

            if (map.containsKey(word.toLowerCase())) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            } else {
                map.put(word.toLowerCase(), 1);
            }
        }

        Set<String> wordsInString = map.keySet();

        for (String word : wordsInString) {
            if (map.get(word) > 1) {
                System.out.println(word + " : " + map.get(word));
            }
        }
    }

    public static void main(String[] args) {

        duplicateWords("Bread butter and bread");

    }
}
