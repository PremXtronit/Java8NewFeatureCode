package generic;
//www.journaldev.com

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {


    public static void main(String[] args) {

        //1. Java Generics Upper Bounded Wildcard
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints=" + sum);

        //2.Java Generics Unbounded Wildcard
        //Sometimes we have a situation where we want our generic method to be working with all types,
        // in this case unbounded wildcard can be used. Its same as using <? extends Object>.
        printData(ints);
        //We can provide List<String> or List<Integer> or any other type of Object list argument to the printData method.
        // Similar to upper bound list, we are not allowed to add anything to the list.


        //3. Java Generics Lower bounded Wildcard
        //Suppose we want to add Integers to a list of integers in a method, we can keep the argument
        // type as List<Integer> but it will be tied up with Integers whereas List<Number> and List<Object>
        // can also hold integers, so we can use lower bound wildcard to achieve this.
        // We use generics wildcard (?) with super keyword and lower bound class to achieve this.

        //We can pass lower bound or any super type of lower bound as an argument in this case,
        // java compiler allows to add lower bound object types to the list.
        List<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        addIntegers(numbers);
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(new Integer(50));
        System.out.println(list);
    }
}
