package InterviewLive;


public class MethodSignature {

    public static void main(String[] args) {

        //display((null); this is ambiguity error

        display((StringBuffer) null);
        StringBuilder sb= null;
        display(sb);
    }

    static void display(StringBuilder obj1) {
        System.out.println("One");
    }

    static void display(StringBuffer obj2) {
        System.out.println("Two");
    }
}
