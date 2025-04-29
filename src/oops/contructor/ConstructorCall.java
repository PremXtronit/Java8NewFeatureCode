package oops.contructor;


class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}

public class ConstructorCall {

    public static void main(String[] args) {
        Child child = new Child();
    }

}
