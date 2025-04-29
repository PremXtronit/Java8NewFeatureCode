package serializable;


import java.io.Serializable;

public class Dog implements Serializable {

    final int i=10;
    int j;

    public Dog(int i, int j) {
       // this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
