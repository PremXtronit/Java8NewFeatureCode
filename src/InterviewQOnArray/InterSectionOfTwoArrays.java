package InterviewQOnArray;


import java.util.Arrays;
import java.util.HashSet;

public class InterSectionOfTwoArrays {


    public static void main(String[] args) {

        String[] s1 = {"1", "2", "3", "4", "5", "4"};
        String[] s2 = {"3", "4", "5", "6", "7", "4"};


        //1) Using Iterative Method
        findCommonElement(s1, s2);

        //2) Using retainAll() Method :
        findCommonElementUsingRetainAll(s1, s2);

        //3) Using HashSet or HashMap  :
        findCommonElementUsingMap(s1, s2);
    }


    public static void findCommonElement(String[] s1, String[] s2) {

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }

        System.out.println(set);
    }

    public static void findCommonElementUsingRetainAll(String[] s1, String[] s2) {

        HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
        set1.retainAll(set2);
        System.out.println(set1);

    }

    private static void findCommonElementUsingMap(String[] s1, String[] s2) {

        HashSet<String> set = new HashSet<String>();
        HashSet<String> commonSet = new HashSet<String>();

        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }

        for (int i = 0; i < s2.length; i++) {
            if (!set.add(s2[i])) {
                commonSet.add(s2[i]);
            }
        }

        System.out.println(commonSet);
    }
}
