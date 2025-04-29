package concurrency.cloning;


public class StudentD implements Cloneable {

    int id;
    String name;
    CourseD courseD;

    public StudentD(int id, String name, CourseD courseD) {
        this.id = id;
        this.name = name;
        this.courseD = courseD;
    }

    //Overriding clone() method to create a deep copy of an object.
    protected Object clone() throws CloneNotSupportedException {

        StudentD studentD = (StudentD) super.clone();

        studentD.courseD = (CourseD) courseD.clone();

        return studentD;

    }
}