package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewListTypeMethodReference {

    public static void main(String[] args) {

        List<StudentDTO> list = listOfStudent().stream().map(StudentDTO::new).collect(Collectors.toList());

        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);

        System.out.println(listOfStudent().stream().map(NewListTypeMethodReference::m1).collect(Collectors.toList()));
    }

    private static List<Student> listOfStudent() {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "s1"));
        list.add(new Student(2, "s2"));
        return list;
    }

    public static StudentDTO m1(Student student) {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        return studentDTO;
    }
}
