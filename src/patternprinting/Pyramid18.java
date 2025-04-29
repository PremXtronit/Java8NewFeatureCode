package patternprinting;


public class Pyramid18 {

    public static void main(String[] args) {
        int noOfRows = 5;
        p1(noOfRows);
        p2(noOfRows);
        p3(noOfRows);
        p4(noOfRows);
        p5(noOfRows);
        p6(noOfRows);
    }

    private static void p1(int noOfRows) {

        int rowCount = 1;
        System.out.println("Here Is Your Pyramid P1");
        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();
            rowCount++;
        }

        System.out.println("Here Is Your Pyramid P1");
        for (int i = 0; i < noOfRows; i++) {

            for (int j = noOfRows - 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }


    }

    private static void p2(int noOfRows) {

        int rowCount = 1;
        System.out.println("Here Is Your Pyramid P2");
        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("Here Is Your Pyramid P2");
        for (int i = 0; i < noOfRows; i++) {

            for (int j = noOfRows - 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void p3(int noOfRows) {

        int rowCount = 1;
        System.out.println("Here Is Your Pyramid P3");

        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("Here Is Your Pyramid P3");
        for (int i = 0; i < noOfRows; i++) {

            for (int j = noOfRows - 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private static void p4(int noOfRows) {

        int rowCount = 1;
        System.out.println("Here Is Your Pyramid P4");

        for (int i = noOfRows; i > 0; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }

        System.out.println("Here Is Your Pyramid P4");

        for (int i = 0; i < noOfRows; i++) {

            for (int j = noOfRows; j > i; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void p5(int noOfRows) {

        int rowCount = noOfRows;

        System.out.println("Here Is Your Pyramid P5");

        for (int i = 0; i < noOfRows; i++) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            //Printing j where j value will be from rowCount-1 to 1

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount--;
        }
    }

    private static void p6(int noOfRows) {

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid P6");
        for (int i = noOfRows; i >= 1; i--) {

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j + " ");
            }

            for (int j = noOfRows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }
    }
}
