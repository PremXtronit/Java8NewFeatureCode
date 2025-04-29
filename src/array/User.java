package array;


import java.util.Comparator;


class User {

    String name;
    int age;

    public static final Comparator<User> ageComparator = new Comparator<User>() {
        @Override
        public int compare(User s1, User s2) {
            if (s1.age == s2.age)
                return 0;
            else if (s1.age > s2.age)
                return 1;
            else
                return -1;
        }
    };

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User student = (User) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {

        return 31 * (name != null ? name.hashCode() : 0) + age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<User> {

    public int compare(User u1, User u2) {

        if (u1.age == u2.age)
            return 0;
        else if (u1.age > u2.age)
            return 1;
        else
            return -1;
    }
}