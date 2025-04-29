package concurrency.cloning;
//http://javaconceptoftheday.com

public class ShallowIsDefaultCloning {

    public static void main(String[] args) {

        Course science = new Course("Physics");
        Student s1 = new Student(1, "Prem", science);
        Student s2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //both object has same reference of course object this is shallow
        System.out.println(s1.course == s2.course);


    }
}
