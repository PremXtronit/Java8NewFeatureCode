package generic;


public class MyGenericsClass {

    public static void main(String[] args) {

        GenericClass<String, String> stringObj = new GenericClass<>("Key", "JAVA2NOVICE");
        stringObj.printType();

        GenericClass<Boolean, Boolean> booleanObj = new GenericClass<>(Boolean.TRUE, Boolean.FALSE);
        booleanObj.printType();
    }
}


class GenericClass<K, V> {

    private K key;
    private V value;

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void printType() {
        System.out.println("Key: " + key.getClass().getName());
    }
}

