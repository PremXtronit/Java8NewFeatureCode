package java8;


public class SplitFunction {

    public static void main(String args[]) {

        String Str = new String("1-522-521-");

        for (String s : Str.split("-")) {
            System.out.println(s);
        }
    }
}


