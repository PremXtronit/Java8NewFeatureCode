package designpattern.singletone;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private volatile static Singleton instance;
    private int value;

    private Singleton() {
    }

    //creates multiple instance if two thread access this method simultaneously

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /* * 2nd version : this definitely thread-safe and only
     * creates one instance of Singleton on concurrent environment
     * but unnecessarily expensive due to cost of synchronization  at every call.
     * */

    public static synchronized Singleton getInstanceTS() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* An implementation of double checked locking of Singleton.
     * Intention is to minimize cost of synchronization and improve performance,
     * by only locking critical section of code, the code which creates instance of Singleton class.
     * By the way this is still broken, if we don't make _instance volatile, as another thread can
     * see a half initialized instance of Singleton.
     * */

    public static Singleton getInstanceDC() {
        if (instance == null) {   //first checking
            synchronized (Singleton.class) {
                if (instance == null) { //second checking
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}