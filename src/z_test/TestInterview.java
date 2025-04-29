package z_test;

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

        map.containsKey(e2);

        System.out.println(e1);

    }

    public static void method2(Employee e) {
        e.name = "Interview";
    }
}
