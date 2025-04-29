package serializable.OwnMarkerInterface;


public class MarkerJvm {

    public static void main(String[] args) {

        Payment payment = new Payment();

        if (payment instanceof Cheque) {
            payment.paymentByCheque();
        }

        if (payment instanceof BankDraft) {
            payment.paymentByCheque();
        }
    }
}
