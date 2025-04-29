package serializable;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

    public static void main(String args[]) throws Exception {

        Dog dog = new Dog(10, 20);

        FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(dog);
        objectOutputStream.flush();

        System.out.println("success");

    }
}
