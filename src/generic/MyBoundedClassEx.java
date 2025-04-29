package generic;


public class MyBoundedClassEx {

    public static void main(String a[]) {

        BoundEx<C> bec = new BoundEx<>(new C());
        bec.doRunTest();

        BoundEx<B> beb = new BoundEx<>(new B());
        beb.doRunTest();

        BoundEx<A> bea = new BoundEx<>(new A());
        bea.doRunTest();

        //BoundEx<String> bes = new BoundEx<String>(new String()); //CTE
    }
}

/**
 * This class only accepts type parameters as any class
 * which extends class A or class A itself.
 * Passing any other type will cause compiler time error
 */
class BoundEx<T extends A> {

    private T t;

    public BoundEx(T t) {
        this.t = t;
    }

    public void doRunTest() {
        this.t.printClass();
    }
}

class A {
    public void printClass() {
        System.out.println("I am in super class A");
    }
}

class B extends A {
    public void printClass() {
        System.out.println("I am in sub class B");
    }
}

class C extends A {
    public void printClass() {
        System.out.println("I am in sub class C");
    }
}
