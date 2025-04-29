package CollectionMyHashMap;

/*
 * Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
 * Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).
 * */

public class TMHashMap {

    private Entry table[] = new Entry[2];

    class Entry {
        Employee key;
        String value;
        Entry next;

        Entry(Employee k, String v) {
            key = k;
            value = v;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Employee getKey() {
            return key;
        }
    }


    public void put(Employee key, String value) {

        int bucketIndex = key.hashCode() % table.length;

        Entry existingElement = table[bucketIndex];

        while (existingElement != null) {
            if (existingElement.key.equals(key)) {
                existingElement.value = value;
                System.out.println("Duplicate key found and value overridden");
                return;
            } else {
                System.out.println("Collision at " + bucketIndex + " for " + key + ", adding element to the existing bucket");
            }
            existingElement = existingElement.next;
        }


        Entry entryInOldBucket = new Entry(key, value);
        entryInOldBucket.next = table[bucketIndex];
        table[bucketIndex] = entryInOldBucket;
    }


    public Entry get(Employee key) {

        int bucketIndex = key.hashCode() % table.length;

        Entry existingElement = table[bucketIndex];

        while (existingElement != null) {
            if (existingElement.key.equals(key)) {
                return existingElement;
            }
            existingElement = existingElement.next;
        }
        return null;
    }


    public static void main(String[] args) {

        TMHashMap map = new TMHashMap();

        Employee e1 = new Employee(100, "A");
        map.put(e1, "D1");

        Employee e2 = new Employee(100, "A");
        map.put(e2, "D2");

        Entry e = map.get(e2);
        System.out.println(e.getKey() + "::" + e.getValue());

        Employee e3 = new Employee(102, "C");
        map.put(e3, "D3");
        e = map.get(e3);
        System.out.println(e.getKey() + "::" + e.getValue());

        Employee e4 = new Employee(104, "D");
        map.put(e4, "D4");
        e = map.get(e4);
        System.out.println(e.getKey() + "::" + e.getValue());

        Employee e5 = new Employee(106, "E");
        map.put(e5, "D5");
        e = map.get(e5);
        System.out.println(e.getKey() + "::" + e.getValue());

        Employee e6 = new Employee(108, "F");
        map.put(e6, "D6");
        e = map.get(e6);
        System.out.println(e.getKey() + "::" + e.getValue());


        System.out.println(map);
    }

    static class Employee {
        private Integer id;
        private String name;

        Employee(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            Employee employee = (Employee) o;

            return this.id.equals(employee.id) && this.name.equals(employee.name);
        }

        @Override
        public int hashCode() {
            return id.hashCode() + name.hashCode();
        }

        @Override
        public String toString() {
            return "z_test.Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
