package serializable;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {

    public static void main(String args[]) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("f.txt");
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        Dog dog = (Dog) in.readObject();
        System.out.println(dog.getI() + " " + dog.getJ());
        in.close();

    }
}