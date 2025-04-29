package serializable;


import java.io.*;

public class ExternalizeTest {


    public static void main(String args[]) throws Exception, IOException {

        User u = new User("Sujoo", 20);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        u.writeExternal(out);
        out.flush();
        out.close();

        User u1 = new User();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
        u1.readExternal(in);

        System.out.println(u1.getName() + "  " + u1.getAge());

    }
}
