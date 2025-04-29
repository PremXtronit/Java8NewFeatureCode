package stringpostmortem;


public class MainClass {


    public static void main(String[] args) {


        String s1 = "durga"; // (compiletime constant)
        String s3 = s1.toUpperCase(); // (Runtime)
        System.out.println(s1 == s3); //true


        String s4="DURGA";
        String s2=s4.toLowerCase();

        System.out.println(s4 == s2); //true


    }
}
