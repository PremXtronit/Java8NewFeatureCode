package collections;


import java.util.Arrays;

public class MaximumMinimumArrayDemo {

    public static void main(String args[]) {
        largestAndSmallest(new int[]{-20, 34, 21, -87, 92, Integer.MAX_VALUE});
        largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
        largestAndSmallest(new int[]{1, -1, 0});
    }

    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers) + " Largest: " + largest + " Smallest: " + smallest);
    }
}
