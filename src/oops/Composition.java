package oops;

/*
   Composition : Since Engine is-part-of Car, the relationship between them is Composition.
*/


class Car {
    //To initialized car object Engine has to initialized
    //final variable must be initialized before constructor complete
    private final Engine engine;

    public Car() {
        engine = new Engine();
    }
}

class Engine {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


public class Composition {
}
