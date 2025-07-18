package threading;

public class WaysToCreateThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Runnable and return void");
            }
        });
        t1.start();

        Runnable r = () -> System.out.println("Job of the Thread");
        Thread t2 = new Thread(r);
        t2.start();

    }


}
