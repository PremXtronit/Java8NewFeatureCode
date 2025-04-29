package collections;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringAscDesc {


    public static void main(String[] args) {

        String str1 = "cabedf";
        String str2 = "cabedf";

        String[] string1 = str1.split("");
        String[] string2 = str2.split("");

        //sort in ascending order
        List strList1 = Arrays.asList(string1);
        Collections.sort(strList1);
        System.out.println("Str1 " + strList1.toString());

        //sort in descending order
        List strList2 = Arrays.asList(string2);
        Collections.sort(strList2);
        System.out.println("Str2 " + strList2.toString());
        Collections.reverse(strList2);
        System.out.println("Str2 " + strList2.toString());
        String strListString1 = strList2.toString();
        System.out.println("Str2 " + strListString1);

    }
}
