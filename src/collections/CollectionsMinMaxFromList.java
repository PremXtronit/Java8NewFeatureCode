package collections;


import java.util.*;

public class CollectionsMinMaxFromList {


    public static void main(String args[]) {

        int[] iArray = new int[]{-18, 40, 45};
        List<Integer> intList = Arrays.asList(-18, 40, -45);
        List<String> stringList = Arrays.asList("abc", "abb", "c");

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-18);
        list.add(40);
        list.add(-55);

        System.out.println("Min val: " + Collections.min(intList, null)); //second parameter is Comparator
        System.out.println("Min val: " + Collections.min(stringList, null));
        System.out.println("Min val: " + Collections.min(list, null));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("s1", 10));
        studentList.add(new Student("s4", 40));
        studentList.add(new Student("s5", 50));
        System.out.println("Min val: " + Collections.min(studentList, Student.AgeComparator));
        System.out.println("Max val: " + Collections.max(studentList, new AgeComparator()));
    }

}

class Student {

    String name;
    int age;

    public static final Comparator<Student> AgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.age == s2.age)
                return 0;
            else if (s1.age > s2.age)
                return 1;
            else
                return -1;
        }
    };

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return age == student.age && !(name != null ? !name.equals(student.name) : student.name != null);
    }

    @Override
    public int hashCode() {

        return 31 * (name != null ? name.hashCode() : 0) + age;
    }
}

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}
