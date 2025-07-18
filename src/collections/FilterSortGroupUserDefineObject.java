package collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//sort by name group dept
class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private String dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Emp(Integer id, String name, Integer age, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class FilterSortGroupUserDefineObject {

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "C", 25, "IT");
        Emp e2 = new Emp(2, "F", 26, "IT");
        Emp e3 = new Emp(3, "E", 27, "CS");
        Emp e4 = new Emp(4, "B", 23, "CS");
        Emp e5 = new Emp(5, "A", 25, "EC");

        List<Emp> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        emps.add(e5);

        Comparator<Emp> nameComparator1 = new Comparator<Emp>() {
            @Override
            public int compare(Emp e1, Emp e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        //Comparator<Emp> nameComparator2 = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Comparator<Emp> nameComparator = Comparator.comparing(Emp::getName);

        Map<String, List<Emp>> map =
                emps.stream()
                        .filter(e -> e.getAge() > 23)
                        .sorted(nameComparator)
                        .collect(Collectors.groupingBy(e -> e.getDept()));

        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }

}
