package searching;


public class BinarySearchRecursive {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80};

        int index = recursiveBinarySearch(arr1, 0, arr1.length, 20);
        System.out.println("Found 10 at " + index + " index");

        index = recursiveBinarySearch(arr1, 0, arr1.length, 50);
        System.out.println("Found 50 at " + index + " index");

        index = recursiveBinarySearch(arr1, 0, arr1.length, 70);
        System.out.println("Found 70 at " + index + " index");
    }

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end, key);

            } else {
                return mid;
            }
        }
        return -(start + 1);
    }
}
