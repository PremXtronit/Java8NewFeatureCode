package designpattern.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Employee employee = new Employee
                .EmployeeBuilder("Vikram" , "ABC")
                .setHasBike(false)
                .setHasBike(true)
                .build();
        System.out.println(employee);
    }
}

class Employee {

    private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}