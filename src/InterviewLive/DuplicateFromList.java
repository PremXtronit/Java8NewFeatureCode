package InterviewLive;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFromList {
    public static void main(String[] args) {

        Date d1 = new Date();
        User u1 = new User("A", d1, Gender.F);
        User u2 = new User("A", d1, Gender.F);
        User u3 = new User("B", d1, Gender.M);
        User u4 = new User("C", d1, Gender.F);
        User u5 = new User("C", d1, Gender.M);

        List<User> al = new ArrayList<>();
        al.add(u1);
        al.add(u2);
        al.add(u3);
        al.add(u4);
        al.add(u5);
        Map<User, Integer> m = new HashMap<>();
        for (User user : al) {
            m.put(user, m.getOrDefault(user, 0) + 1);
        }
        for (Map.Entry<User, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey().getName() + " " + entry.getValue());
            }
        }

        //Java8
        Map<User, Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //Normal List
        List<String> names = Arrays.asList("A", "B", "C");
        Map<String, String> newMap = names.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));


    }

}

class User {
    private String name;
    private Date dob;
    private Gender gender;

    public User(String name, Date dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(dob, user.dob) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob, gender);
    }
}

enum Gender {
    M, F
}
