package exception;


import static java.lang.Thread.sleep;

public class MyTest {

    public static void main(String[] args) throws InterruptedException {


        doStuff();

    }

    public static void doStuff() throws InterruptedException {


        sleep(1000);

        System.out.println("Hello");


    }


}
