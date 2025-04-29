package concurrency;


import java.util.ArrayList;
import java.util.Iterator;

public class CME {


    private static ArrayList arrayList = new ArrayList();

    public static void main(String[] args) throws InterruptedException {

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                arrayList.add("D");
            }
        });
        thread.start();

        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            Thread.sleep(1000);
        }


    }

}
