package java8;


import java.util.Arrays;
import java.util.List;

public class Stream {


    public static void main(String[] args) {
        // write your code here

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //find even number and double them and The sum of Them
        int sum = 0;
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                sum = sum + integer * 2;
            }
        }
        System.out.println(sum);

        sum = integerList.stream().filter(integer -> integer % 2 == 0).mapToInt(integer -> integer * 2).sum();
        System.out.println(sum);

        //integerList.stream().filter(integer -> integer % 2 == 0).map();

    }

}
