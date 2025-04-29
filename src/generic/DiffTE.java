package generic;

//Difference between List, List<?>, List<T>, List<E>, and List<Object>


public class DiffTE {

    public static void main(String[] args) {

        //1. List: is a raw type, therefore not typesafe. It will only generate a runtime error when the casting is bad.

        //2. List<?>

        //3. T, E and U are the same, but people tend to use e.g. T for type, E for Element, V for value and K for key.
        // The method that compiles says that it took an array of a certain type, and returns an array of the same type.


    }

}

//Java Generics Wildcards