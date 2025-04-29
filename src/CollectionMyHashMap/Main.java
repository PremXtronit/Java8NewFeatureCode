package CollectionMyHashMap;

public class Main {


    public static void main(String[] args) {

        MyHashMap<String, String> myHashMap = new MyHashMap();

        myHashMap.put("Prem", "phone1");
        myHashMap.put("Prem", "phone1Replace");

        myHashMap.put("Priya", "phone2");
        myHashMap.put("Tanu", "phone3");

        System.out.println(myHashMap);

    }

}
