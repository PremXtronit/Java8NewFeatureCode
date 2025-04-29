//https://www.journaldev.com/1487/adapter-design-pattern-java
package designpattern.adapter;
/*
 * Adapter design pattern is one of the structural design pattern and its used so that
 * two unrelated interfaces can work together.
 * The object that joins these unrelated interface is called an Adapter.

 * One of the great real life example of Adapter design pattern is mobile charger.
 * Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
 * So the mobile charger works as an adapter between mobile charging socket and the wall socket.

 * We will try to implement multi-adapter using adapter design pattern in this tutorial.
 * So first we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
 * */

public class AdapterDemo {

    public static void main(String[] args) {

        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());

        SocketAdapter objAdapter = new SocketObjectAdapterImpl();
        Volt vObj3 = getVolt(objAdapter, 3);
        Volt vObj12 = getVolt(objAdapter, 12);
        Volt vObj120 = getVolt(objAdapter, 120);
        System.out.println("v3 volts using Object Adapter=" + vObj3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + vObj12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + vObj120.getVolts());

    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }

}

class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}

class Volt {

    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
/*
 * Now we want to build an adapter that can produce 3 volts, 12 volts and default 120 volts.
 * So first we will create an adapter interface with these methods.
 * */
interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}

//Using inheritance for adapter pattern
class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}

class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
