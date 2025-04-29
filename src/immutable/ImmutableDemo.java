package immutable;

/*
 * The instance variable of the class is final i.e.
 * we cannot change the value of it after creating an object.
 * The class is final so we cannot create the subclass.
 * There is no setter methods i.e. we have no option to change the value of the instance variable.
 * */

public class ImmutableDemo {

    public static void main(String[] args) {

        Student student = new Student("Prem");
        System.out.println(student.getName());

        try {
            student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

final class Student implements Cloneable {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

/*
* Immutable objects are automatically thread-safe. True or false?
* All wrapper classes in java.lang are immutable which includes String.
* What are the advantages of immutability?
 • Immutable objects are thread-safe by default and aprt from this, the overhead caused due to the use of synchronisation is avoided.
 • Once created the state of the immutable object cannot be changed so there is no possibility of them getting into an inconsistent state.
 • The references to the immutable objects can be easily shared or cached without any need to copy or clone them as there state can never be changed after its construction.
 • The immutable objects can be best used as the keys of a map.
1) Immutable objects are by default thread safe and can be shared without synchronization in concurrent environment.
2) Immutable object simplifies development because its easier to share between multiple threads without external synchronization.
3) Immutable objects boost performance of Java applications by reducing synchronization in code.
4) Another important benefit of Immutable objects is its reusability.
   One can cache Immutable objects and reuse them just like String literals and Integers.
   One can use static factory methods to provide methods like valueOf(),
   which can return an existing Immutable object from cache, instead of creating a new one. .
* */