package InterviewQOnString35;


import java.util.*;

public class CountCharacterOccurrences {


    public static void main(String[] args) {
        String s = "Java is java again java again";

        char c = 'a';

        int count = s.length() - s.replace("a", "").length();

        System.out.println("Number of occurrences of 'a' in " + s + " = " + count);

        s = s.replace(" ", "");
        String[] str = s.split("");
        List<String> list = Arrays.asList(str);

        Set<String> set = new HashSet<String>(list);
        for (String s1 : set) {
            System.out.print(Collections.frequency(list, s1) + s1);
        }

    }
}
