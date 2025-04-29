package InterviewQOnString35;


import java.util.Arrays;
import java.util.HashMap;

public class AnagramProgram {


    //1) Anagram Program In Java Using sort() and equals() Methods
    static void isAnagram1(String s1, String s2) {

        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            status = false;
        } else {
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array, s2Array);
        }

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //2) Anagram Program In Java Using Iterative Method
    static void isAnagram2(String s1, String s2) {
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            status = false;
        } else {
            char[] s1ToArray = copyOfs1.toCharArray();
            for (char c : s1ToArray) {
                int index = copyOfs2.indexOf(c);
                if (index != -1) {
                    copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index + 1, copyOfs2.length());
                } else {
                    status = false;
                    break;
                }
            }
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //3) Anagram Program In Java Using StringBuilder
    static void isAnagram3(String s1, String s2) {

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            status = false;
        } else {
            char[] s1Array = copyOfs1.toCharArray();
            StringBuilder sb = new StringBuilder(copyOfs2);
            for (char c : s1Array) {
                int index = sb.indexOf("" + c);
                if (index != -1) {
                    sb = sb.deleteCharAt(index);
                } else {
                    status = false;
                    break;
                }
            }
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //4) Anagram Program In Java Using HashMap
    static void isAnagram4(String s1, String s2) {

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            status = false;
        } else {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < copyOfs1.length(); i++) {
                char charAsKey = copyOfs1.charAt(i);
                int charCountAsValue = 0;
                if (map.containsKey(charAsKey)) {
                    charCountAsValue = map.get(charAsKey);
                }
                map.put(charAsKey, ++charCountAsValue);

                charAsKey = copyOfs2.charAt(i);
                charCountAsValue = 0;
                if (map.containsKey(charAsKey)) {
                    charCountAsValue = map.get(charAsKey);
                }
                map.put(charAsKey, --charCountAsValue);
                System.out.println(map);
            }
           /* for (int value : map.values()) {
                if (value != 0) {
                    status = false;
                }
            }*/
            map.keySet();

            status = map.values().stream().anyMatch(value -> value != 0);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram1("keEp", "peeK");

        isAnagram2("keEp", "peeK");

        isAnagram3("keEp", "peeK");

        isAnagram4("keEp", "peeK");
    }
}
