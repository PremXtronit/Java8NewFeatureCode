package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewListTypeMethodReference {

    public static void main(String[] args) {

        List<StudentDTO> list = listOfStudent().stream()
                .map(StudentDTO::new).collect(Collectors.toList());

        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);


        List<StudentDTO> l1 = listOfStudent().stream().map(NewListTypeMethodReference::m1).collect(Collectors.toList());

        Function<Student, StudentDTO> f4 = (s) -> m1(s);

        List<StudentDTO> l2 = listOfStudent().stream().map(f4).collect(Collectors.toList());

        System.out.println();
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
