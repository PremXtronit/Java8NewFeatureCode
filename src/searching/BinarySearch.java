package searching;


public class BinarySearch {

    public static void main(String[] args) {
        int c, first, last, middle, n, search = 40, array[];

        array = new int[]{10, 20, 30, 40, 50};

        first = 0;
        last = array.length - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search)
                first = middle + 1;
            else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else
                last = middle - 1;

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(search + " is not present in the list.\n");
    }
}


