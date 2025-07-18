package designpattern.solid;

interface Bird {
    void makeSound();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}

class Ostrich implements Bird {

    public void makeSound() {
        System.out.println("Boom boom");
    }
}

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();                 // ✅ Safe
        sparrow.makeSound();

        Bird ostrich = new Ostrich();
        ostrich.makeSound();           // ✅ Safe
        // ostrich.fly();              // ❌ Not allowed, and that's good
    }
}

//Why This Follows LSP:
//Ostrich doesn't inherit fly() since it can't fly, avoiding misuse.
//We're substituting subtypes only in contexts where their full behavior is valid.