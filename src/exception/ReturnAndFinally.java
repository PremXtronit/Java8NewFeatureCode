package exception;


public class ReturnAndFinally {


    public static void main(String[] args) {


        System.out.println(returnFrom());
        System.out.println(systemExist());


    }

    private static int returnFrom() {
        try {
            return 1;
        } catch (Exception ex) {
        } finally {
            return 2;
        }
    }

    private static int systemExist() {
        try {
            System.exit(0);
        } catch (Exception ex) {
        } finally {
            return 2;
        }
    }

}
