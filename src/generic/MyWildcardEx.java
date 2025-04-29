package generic;

public class MyWildcardEx {

    public static void main(String a[]) {

        EmpUtil<CompAEmp> empA = new EmpUtil<CompAEmp>(new CompAEmp("A", 20000));

        EmpUtil<CompBEmp> empB = new EmpUtil<CompBEmp>(new CompBEmp("B", 30000));

        EmpUtil<CompAEmp> empC = new EmpUtil<CompAEmp>(new CompAEmp("C", 20000));

        System.out.println("Is salary same? " + empA.isSalaryEqual(empB));
        System.out.println("Is salary same? " + empA.isSalaryEqual(empC));
    }

}

class EmpUtil<T extends Emp> {

    private T emp;

    public EmpUtil(T obj) {
        emp = obj;
    }

    public int getSalary() {
        return emp.getSalary();
    }

    public boolean isSalaryEqual(EmpUtil<?> otherEmp) {

        return emp.getSalary() == otherEmp.getSalary();
    }
}

class Emp {

    private String name;
    private int salary;

    public Emp(String name, int sal) {
        this.name = name;
        this.salary = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class CompAEmp extends Emp {

    public CompAEmp(String nm, int sal) {
        super(nm, sal);
    }
}

class CompBEmp extends Emp {

    public CompBEmp(String nm, int sal) {
        super(nm, sal);
    }
}