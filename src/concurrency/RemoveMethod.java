package concurrency;


import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethod {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();  // This line will remove element from list no CME
            //arrayList.remove("C");  this line will throw CME
        }
        System.out.println(arrayList);

    }
}
