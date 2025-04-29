package generic;


public class MyBoundedInterface {

    public static void main(String a[]) {

        BoundExm<Y> bey = new BoundExm<Y>(new Y());
        bey.doRunTest();

        BoundExm<Z> bez = new BoundExm<Z>(new Z());
        bez.doRunTest();

        // BoundExm<String> bes = new BoundExm<String>(new String());

    }

}

class BoundExm<T extends X> {

    private T t;

    public BoundExm(T t) {
        this.t = t;
    }

    public void doRunTest() {
        this.t.printClass();
    }
}

interface X {
    public void printClass();
}

class Y implements X {
    public void printClass() {
        System.out.println("I am in class Y");
    }
}

class Z implements X {
    public void printClass() {
        System.out.println("I am in class Z");
    }
}
