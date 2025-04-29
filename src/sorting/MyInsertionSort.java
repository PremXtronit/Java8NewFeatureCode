package sorting;


public class MyInsertionSort {

    public static void main(String a[]) {
        int[] arr1 = {5, 2, 4, 6, 1, 3};
        int[] arr2 = doInsertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

}
