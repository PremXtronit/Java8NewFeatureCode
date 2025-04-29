package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {


    public static void main(String[] args) throws FileNotFoundException {


        try (FileOutputStream stream = new FileOutputStream("writehere.txt");) {
            String msg = "Welcome to javaTpoint!";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            stream.write(byteArray);
            System.out.println("Message written to file successfuly!");
        } catch (Exception exception) {
            System.out.println(exception);
        }


    }

}
