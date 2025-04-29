package InterviewQOnString35;


import java.util.LinkedHashMap;

public class LongestSubsWithoutRepChar {


    static void longestSubstring(String inputString) {

        char[] charArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
            else {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength

            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();

                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void main(String[] args) {

        longestSubstring("javaconceptoftheday");

    }
}
