package InterviewQOnString35;

public class ReverseEachWord {

    static void reverseEachWordOfString(String inputString) {

        String[] words = inputString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }

    public static void main(String[] args) {

        reverseEachWordOfString("Java Concept Of The Day");

        reverseEachWordOfStringRecursive("Java Concept Of The Day");
    }

    private static void reverseEachWordOfStringRecursive(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = recursiveMethod(word);
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }

    //Recursive method to reverse string
    public static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        System.out.println(str.charAt(0) + "-" + str.substring(1));
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }

}
