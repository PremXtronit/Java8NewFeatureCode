package serializable;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

    private String userName;
    private transient String password;
    private transient int amount;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String newPass = "123" + password;
        oos.writeObject(newPass);
        oos.writeInt(amount + 100);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String newPass = (String) ois.readObject();
        password = newPass.substring(3);
        amount = (int) ois.readInt() - 100;
    }

    public Account() {
    }

    public Account(String userName, String password, int amount) {
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
