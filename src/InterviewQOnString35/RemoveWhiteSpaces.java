package InterviewQOnString35;


public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String str = "  a a a b b b c c c c   ";

        //1. Using replaceAll() Method
        String strWithoutSpace = str.replaceAll("\\s", "");
        System.out.println(strWithoutSpace);

        //2. Without Using replaceAll() Method
        char[] strArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                sb.append(strArray[i]);
            }
        }

        System.out.println(sb);
    }
}
