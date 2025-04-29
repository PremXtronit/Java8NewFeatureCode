package InterviewQOnString35;


public class ToProveStringsAreImmutable {

    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "JAVA";
        System.out.println(s1 == s2);
        s1 = s1 + "J2EE";
        System.out.println(s1 == s2);

        String s3 = new String("JAVA");
        s3.concat("J2EE");
        System.out.println(s3);
    }
}
