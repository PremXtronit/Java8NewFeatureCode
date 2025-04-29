package enumclasses;


public class EnumThreadSafe {

    public static void main(String[] args) {

        Task task1 = Task.PENNY;
        Task task2 = Task.NICKLE;
        Task task3 = Task.DIME;
        Task task4 = Task.QUARTER;

        Thread thread1 = new Thread(task1, "thread1");
        Thread thread2 = new Thread(task2, "thread2");
        Thread thread3 = new Thread(task3, "thread3");
        Thread thread4 = new Thread(task4, "thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
