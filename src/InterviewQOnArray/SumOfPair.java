package InterviewQOnArray;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumOfPair {

    public static void main(String args[]) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};

        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};

        System.out.println("Given sum : " + 7);
        printPairs(numbers, 7);

        System.out.println("Given sum : " + 7);
        printPairs(numbersWithDuplicates, 7);

        findThePairs(numbersWithDuplicates, 7);

        findThePairsNLogN(numbersWithDuplicates, 7);

        System.out.println("Given sum : " + 7);
        printPairsUsingSet(numbersWithDuplicates, 7);

        System.out.println("Given sum : " + 7);
        printPairsUsingTwoPointers(numbersWithDuplicates, 7);
    }

    /**
     * complexity of this solution is O(n^2)
     */
    public static void printPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }

    //Time Complexity of this solution is O(n^2).
    static void findThePairs(int inputArray[], int inputNumber) {
        System.out.println("O(n^2) Pairs of elements whose sum is " + inputNumber + " are : ");

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                }
            }
        }
    }

    //time complexity of O(nLogn). But, it works only for sorted arrays.
    static void findThePairsNLogN(int inputArray[], int inputNumber) {

        Arrays.sort(inputArray);

        System.out.println("O(nLogn) Pairs of elements whose sum is " + inputNumber + " are : ");
        int i = 0;
        int j = inputArray.length - 1;
        while (i < j) {
            if (inputArray[i] + inputArray[j] == inputNumber) {
                System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                i++;
                j--;
            } else if (inputArray[i] + inputArray[j] < inputNumber) {
                i++;
            } else if (inputArray[i] + inputArray[j] > inputNumber) {
                j--;
            }
        }
    }

    /*
    *  complexity of this solution would be O(N)
    *  but it would need additional space of order O(n)
    *  to store numbers in Hashtable or Set
    */
    public static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int value : numbers) {
            int target = n - value;
            // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    /*
    * O(n), O(logN) or O(NLongN)
    */
    public static void printPairsUsingTwoPointers(int[] numbers, int k) {
        if (numbers.length < 2) {
            return;
        }
        // Arrays.sort() method uses a two pivot quicksort algorithm to sort array of primitives.
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
                left = left + 1;
                right = right - 1;
            } else if (sum < k) {
                left = left + 1;
            } else if (sum > k) {
                right = right - 1;
            }
        }
    }
}
