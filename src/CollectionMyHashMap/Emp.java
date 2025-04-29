package CollectionMyHashMap;


public class Emp {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        return name.equals(emp.name) && id == emp.id;
    }

    @Override
    public int hashCode() {

        return 31 * id + name.hashCode();

    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
