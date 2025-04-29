package concurrency.cloning;


public class DeepCloningOverrideClone {

    public static void main(String[] args) {
        CourseD science = new CourseD("Physics");
        StudentD s1 = new StudentD(1, "Prem", science);
        StudentD s2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            s2 = (StudentD) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //both object has different reference of course object this is shallow
        System.out.println(s1.courseD == s2.courseD);
    }
}
