package InterviewQOnString35;


import java.util.HashMap;

public class EachCharCountInString {

    static void characterCount(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        String strWithoutSpace = inputString.replaceAll("\\s", "");
        char[] strArray = strWithoutSpace.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
    }

    public static void main(String[] args) {

        characterCount("Java J2EE Java JSP J2EE");
        characterCount("All Is Well");

    }

}
