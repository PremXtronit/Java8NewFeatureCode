package InterviewQOnString35;


import java.util.Scanner;

public class CountTheWords {

    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        countNumberOfWords1(s);
        countNumberOfWords2(s);

    }

    public static void countNumberOfWords1(String s) {
        String[] words = s.trim().split(" ");
        System.out.println("Number of words in the string = " + words.length);
    }

    public static void countNumberOfWords2(String s) {
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string = " + count);
    }
}
