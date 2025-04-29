package java8;


public class StudentDTO {

    private long id;
    private String name;

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        this.id=student.getId();
        this.name=student.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
