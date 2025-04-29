package InterviewQOnString35;

public class ToReverseStringPreservingSpaces {

    static void reverseString(String inputString) {

        char[] inputStringArray = inputString.toCharArray();
        char[] resultArray = new char[inputStringArray.length];

        //Step1 : Pick spaces from 'inputStringArray', and put in the 'resultArray' at the corresponding positions

        for (int i = 0; i < inputStringArray.length; i++) {
            if (inputStringArray[i] == ' ') {
                resultArray[i] = ' ';
            }
        }

        //Step2 : we copy every non-space character of inputStringArray into resultArray from j position

        int j = resultArray.length - 1;
        for (int i = 0; i < inputStringArray.length; i++) {
            if (inputStringArray[i] != ' ') {
                //If resultArray already has space at index j then decrementing 'j'

                if (resultArray[j] == ' ') {
                    j--;
                }
                resultArray[j] = inputStringArray[i];
                j--;
            }
        }
        System.out.println(inputString + " ---> " + String.valueOf(resultArray));
    }

    public static void main(String[] args) {
        reverseString("I Am Not String");

    }

}
