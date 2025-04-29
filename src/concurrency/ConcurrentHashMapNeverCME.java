package concurrency;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapNeverCME {

    private static ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>(16, .75f, 16);

    public static void main(String[] args) {

        chm.put("A", "1");
        chm.put("B", "2");
        chm.put("C", "3");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chm.put("D", "4");
            }
        });
        thread.start();


        for (Map.Entry entry : chm.entrySet()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(entry.getKey() + "=> " + entry.getValue());
        }

        Set s1 = chm.keySet();
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Iterator itr1 = s1.iterator(); itr1.hasNext(); ) {
            System.out.println("" + itr1.next());
        }
    }
}
