package patternprinting;

import java.util.Scanner;

public class NumberPatternPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5;//sc.nextInt();

        q1(rows);
        q2(rows);
        q6(rows);
        q17(rows);
        q10(rows);
        q13(rows);

        q4(rows);
        q5(rows);
        q7(rows);

        q3(rows);
        q8(rows);
        q9(rows);
        q11(rows);
        q12(rows);

        q14(rows);
        q15(rows);
        q16(rows);


        sc.close();
    }

    //Q1
    public static void q1(int rows) {

        System.out.println("Here is your pattern....!!! Q1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q2
    public static void q2(int rows) {

        System.out.println("Here is your pattern....!!! Q2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q3
    public static void q3(int rows) {

        System.out.println("Here is your pattern....!!! Q3");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q4
    public static void q4(int rows) {

        System.out.println("Here is your pattern....!!! Q4");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q5
    public static void q5(int rows) {

        System.out.println("Here is your pattern....!!! Q5");

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(rows - j + " ");
            }
            System.out.println();
        }
    }

    //Q6
    public static void q6(int rows) {

        System.out.println("Here is your pattern....!!! Q6");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(rows - j + " ");
            }
            System.out.println();
        }

    }

    //Q7
    public static void q7(int rows) {

        System.out.println("Here is your pattern....!!! Q7");
        for (int i = rows; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //Q8
    public static void q8(int rows) {

        System.out.println("Here is your pattern....!!! Q8");

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q9
    public static void q9(int rows) {

        System.out.println("Here is your pattern....!!! Q9");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    //Q10
    public static void q10(int rows) {

        System.out.println("Here is your pattern....!!! Q10");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 - j + " ");
            }

            System.out.println();
        }

    }

    //Q11
    public static void q11(int rows) {

        System.out.println("Here is your pattern....!!! Q11");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    //Q12
    public static void q12(int rows) {

        System.out.println("Here is your pattern....!!! Q12");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print(j + 1 + " ");
            }

            System.out.println();
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    //Q13
    public static void q13(int rows) {

        System.out.println("Here is your pattern....!!! Q13");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    //Q14
    public static void q14(int rows) {

        System.out.println("Here is your pattern....!!! Q14");
        for (int i = 1; i <= rows; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
                for (int j = 1; j <= rows; j++) {
                    System.out.print(num);

                    num = (num == 0) ? 1 : 0;
                }
            } else {
                num = 1;
                for (int j = 1; j <= rows; j++) {
                    System.out.print(num);

                    num = (num == 0) ? 1 : 0;
                }
            }

            System.out.println();
        }
        System.out.println("Here is your pattern....!!! Q14");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    //Q15
    public static void q15(int rows) {

        System.out.println("Here is your pattern....!!! Q15");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(1);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
        System.out.println("Here is your pattern....!!! Q15");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(1);
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }

            System.out.println();
        }
    }

    //Q16
    public static void q16(int rows) {

        System.out.println("Here is your pattern....!!! Q16");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    //Q17
    public static void q17(int rows) {

        System.out.println("Here is your pattern....!!! Q17");
        for (int i = 0; i < rows; i++) {
            int num = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + rows - j - 1;
            }
            System.out.println();
        }
    }
}
