package sorting;


public class MyBubbleSort {

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {5, 1, 12, -5, 16};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            printNumbers(array);
        }
    }

}
