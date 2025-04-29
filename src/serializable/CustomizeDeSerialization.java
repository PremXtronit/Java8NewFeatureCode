package serializable;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CustomizeDeSerialization {

    public static void main(String args[]) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("f.txt");
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        Account account = (Account) in.readObject();
        System.out.println(account.getUserName() + " " + account.getPassword() + " " + account.getAmount());
        in.close();
    }
}
