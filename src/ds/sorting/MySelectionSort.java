package ds.sorting;


public class MySelectionSort {

    public static int[] doSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(arr, i, smallestIndex);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int smallestIndex) {
        int smallerNumber = arr[smallestIndex];
        arr[smallestIndex] = arr[i];
        arr[i] = smallerNumber;
    }

    public static void main(String a[]) {

        int[] arr1 = {5, 1, 12, -5, 16, 2, 12, 14};
        int[] arr2 = doSelectionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

}
