package concurrency.cloning;

//for deep cloning every object should be cloneable
public class CourseD implements Cloneable {

    String sub1;

    public CourseD(String sub1) {
        this.sub1 = sub1;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
