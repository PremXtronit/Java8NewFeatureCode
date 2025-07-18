package threading.synchronization;

import java.util.concurrent.Future;

public class MainClass {

    public static void main(String[] args) {
        Table table = new Table();


    }

}

class Table {

    void printTableBlock(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

    }
}
