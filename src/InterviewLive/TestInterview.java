package InterviewLive;

import java.util.HashMap;
import java.util.Map;

public class TestInterview {


    public static void main(String[] args) {
        System.out.println("hello");

        Employee e1 = new Employee();
        e1.name = "Vipin";
        Map map = new HashMap();
        map.put(e1, "xyz");
        method2(e1);
        Employee e2 = new Employee();
        e2.name = "Vipin";
        System.out.println(map.containsKey(e2));

        System.out.println(e1);

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        // Convert to String for comparison
        int result = sb1.compareTo(sb2);
        System.out.println(result); // Will output a value based on lexicographical comparison
    }

    public static void method2(Employee e) {
        e.name = "InterviewLive";
        System.out.println(e.name);
    }
}
