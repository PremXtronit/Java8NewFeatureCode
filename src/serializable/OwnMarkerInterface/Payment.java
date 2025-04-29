package serializable.OwnMarkerInterface;


public class Payment implements Cheque {


    public void paymentByCheque() {

        System.out.println("He made payment by cheque");
    }

    public void paymentByBankDraft() {

        System.out.println("He made payment by bank draft");
    }
}
