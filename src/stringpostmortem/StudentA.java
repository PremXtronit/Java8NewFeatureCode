package stringpostmortem;


public class StudentA {


    private int age;
    private String name;


    @Override
    public int hashCode() {
        return 31 * age + name.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        StudentA studentA = (StudentA) o;

        if (age != studentA.age)
            return false;

        return name.equals(studentA.name);

    }

    @Override
    public String toString() {
        return "StudentA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
