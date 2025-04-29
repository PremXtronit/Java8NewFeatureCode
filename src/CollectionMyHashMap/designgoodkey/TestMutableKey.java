package CollectionMyHashMap.designgoodkey;


import java.util.HashMap;

public class TestMutableKey {

    public static void main(String[] args) {

        HashMap<Account, String> map = new HashMap<Account, String>();

        Account a1 = new Account(1);
        a1.setHolderName("ONE");

        Account a2 = new Account(2);
        a2.setHolderName("TWO");

        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());

        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");

        System.out.println(map.get(a1)); // ONE
        System.out.println(map.get(a2)); // TWO

        Account a3 = new Account(1);
        a3.setHolderName("THREE");

        System.out.println(map.get(a3)); // ONE
    }
}














