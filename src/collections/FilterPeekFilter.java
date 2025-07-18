package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//1. Check the list is not empty
//2. Check the object is no null
//3. Create the list which is having department is “Sales” and Sal is < 40000;
//4. What is the use of peek statement ? Use this statement to print the Department and Salary before creating the new list

public class FilterPeekFilter {

    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();

        departmentList.add(new Department("HR", 20000));
        departmentList.add(new Department("Sales", 30000));
        departmentList.add(new Department("Finance", 10000));
        departmentList.add(new Department("Marketing", 25000));
        departmentList.add(new Department("Sales", 45000));

        // 1. Check list is not empty
        if (departmentList == null || departmentList.isEmpty()) {
            System.out.println("Department list is empty or null.");
            return;
        }

        // 2. Filter out any null objects just in case
        List<Department> filteredList =
                departmentList.stream()
                        .filter(Objects::nonNull) // 2. Check object is not null
                        .peek(dept -> System.out.println("Before filtering: " + dept)) // 4. Use peek to print
                        .filter(dept -> "Sales".equals(dept.dep) && dept.sal < 40000) // 3. Filter by dep and sal
                        .collect(Collectors.toList());

        System.out.println("Filtered List (Sales dept with salary < 40000):");
        filteredList.forEach(System.out::println);


        filteredList.stream().filter(Objects::nonNull).filter(x -> "Sales".equals(x.dep) && x.sal < 5000);
    }
}

class Department {
    String dep;
    int sal;

    Department(String dep, int sal) {
        this.dep = dep;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "{dep: " + dep + ", sal: " + sal + "}";
    }
}

/*
What is peek() in Java?
peek() is used in Streams to perform an intermediate action, mainly for debugging or logging.
It does not modify the stream; it’s like saying “Hey, let me take a quick look.”
It's best used before a terminal operation like collect() or forEach().
*/