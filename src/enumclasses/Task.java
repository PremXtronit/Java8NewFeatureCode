package enumclasses;


public enum Task implements Runnable {

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    Task(int value) {
        this.setValue(value);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

