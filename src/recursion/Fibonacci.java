package recursion;


/*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
  such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
        F(0) = 0,
        F(1) = 1
        F(n) = F(n - 1) + F(n - 2), for n > 1.
        Given n, calculate F(n).

        Example 1:
        Input: n = 2
        Output: 1
        Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

        Example 2:
        Input: n = 3
        Output: 2
        Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

        Example 3:
        Input: n = 4
        Output: 3
        Explanation: F(4) = F(3) + F(2) = 2
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
        */

public class Fibonacci {


    public static void main(String[] args) {

        //Print fibonacci series from 20 numbers
        for (int i = 0; i < 10; i++) {
            int a = function(i);
            System.out.println(a);
        }
    }

    public static int function(int n) {
        if (n > 1) {
            return function(n - 1) + function(n - 2);
        }
        return n;
    }
}



