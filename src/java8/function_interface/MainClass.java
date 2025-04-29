package java8.function_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> {
            System.out.println(s);
            return true;
        };
        System.out.println(predicate.test("Hello"));

        Function<String, String> function = (s) -> {
            System.out.println(s);
            return "return some value from function";
        };
        System.out.println(function.apply("Input value of function"));

        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("Take input param");

        Supplier<String> supplier = () -> {
            return "return some value";
        };
        System.out.println(supplier.get());

    }

}
