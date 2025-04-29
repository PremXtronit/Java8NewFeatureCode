package InterviewQOnString35;


public class ReverseTheString {

    public static void main(String[] args) {
        String str = "MyJava";

        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());


        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println();

        //3. Using Recursive Method
        System.out.println(recursiveMethod(str));
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
