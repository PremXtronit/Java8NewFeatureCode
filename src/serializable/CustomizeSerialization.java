package serializable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomizeSerialization {

    public static void main(String[] args) throws IOException {

        Account account = new Account("Prem", "Password", 500); //original data

        FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account);
        objectOutputStream.flush();

        System.out.println("successfully Serialized ");
    }

}
