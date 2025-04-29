package patternprinting;


public class Diamond19 {

    public static void main(String[] args) {
        d1(7);
        d2(7);
    }

    private static void d1(int noOfRows) {

        int midRow = (noOfRows) / 2;
        int row = 1;

        for (int i = midRow; i > 0; i--) {

            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //Printing j *'s at the end of each row
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }

        //Printing lower half of the diamond

        for (int i = 0; i <= midRow; i++) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing j *'s at the end of each row

            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
            row--;
        }
    }

    private static void d2(int noOfRows) {

        int midRow = (noOfRows) / 2;
        int row = 1;
        for (int i = midRow; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
            row++;
        }

        //Printing lower half of the diamond

        for (int i = 0; i <= midRow; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = row; j > 0; j--) {
                System.out.print(row + " ");
            }
            System.out.println();
            row--;
        }
    }
}
