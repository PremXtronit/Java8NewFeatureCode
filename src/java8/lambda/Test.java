package java8.lambda;

public class Test {

    private int x = 10;

    public void m2() {

        int y = 20;

        MyInterface myInterface = () -> {
            System.out.println(x);
            System.out.println(y);
            x = 888;
            //y=999; CTE
        };
        myInterface.m1();


        MyInterface2 f2 = (a) -> {
            System.out.println(a);
        };

        f2.m2(100);

    }

}
