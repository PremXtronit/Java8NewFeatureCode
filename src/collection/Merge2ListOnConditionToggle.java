package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2ListOnConditionToggle {


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 3, 5, 7);
        List<Integer> b = Arrays.asList(2, 4, 6, 8);
        List<Integer> c = new ArrayList<>();
        boolean flag = true;

        int i = 0;
        int j = 0;

        while (i < a.size() || j < b.size()) {
            if (flag && i < a.size()) {
                c.add(a.get(i));
                flag = false;
                i++;
            } else if (!flag && j < b.size()) {
                c.add(b.get(j));
                flag = true;
                j++;
            }
        }
        System.out.println(c);

    }

}
