package oops.contructor;


import java.io.IOException;

class ParentO {
    public void m1() throws Exception {
        System.out.println("m1 from ParentO");
    }
}

class ChildO extends ParentO {
    public void m1() throws Exception {
        System.out.println("m1 from ChildO");
    }
}

public class OverridingMain {

    public static void main(String[] args) throws IOException {
        ChildO childO = new ChildO();
        //childO.m1();

    }
}
