package threading;

class Customer {
    int amount = 10000;

    synchronized void withDraw(int withDrawAmount) {
        if (this.amount < withDrawAmount) {
            System.out.println("Less balance wait for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amount = amount - withDrawAmount;
        System.out.println("Withdraw is completed " + withDrawAmount);
    }

    synchronized void deposit(int depositAmount) {
        this.amount = this.amount + depositAmount;
        notify();
        System.out.println("Deposit of  " + depositAmount + "is completed");
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) {
        final Customer c = new Customer();

        Runnable wTask = () -> c.withDraw(2000);
        new Thread(wTask).start();

        Runnable dTask = () -> c.deposit(2000);
        new Thread(dTask).start();
    }
}

