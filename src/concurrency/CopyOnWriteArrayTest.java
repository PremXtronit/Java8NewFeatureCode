package concurrency;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

//Returns a shallow copy of this list.  (The elements themselves are not copied.)
public class CopyOnWriteArrayTest {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            if (i % 2 == 0) {
                try {
                    // al.remove(i);//this will throw exception
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                itr.remove(); //this will not throw exception
            }
        }
        System.out.println(al);


        CopyOnWriteArrayList<Integer> cowAL = new CopyOnWriteArrayList<>();
        cowAL.add(1);
        cowAL.add(2);
        cowAL.add(3);
        cowAL.add(4);
        cowAL.add(5);
        Iterator itr1 = cowAL.iterator();
        while (itr1.hasNext()) {
            Integer i = (Integer) itr1.next();
            if (i % 2 == 0) {
                //itr1.remove(); // this will throw exception
                cowAL.remove(i);
            }
        }
        System.out.println(cowAL);

        CopyOnWriteArraySet<Integer> cowAS = new CopyOnWriteArraySet<>();
        cowAS.add(1);
        cowAS.add(2);
        cowAS.add(3);
        cowAS.add(4);
        cowAS.add(5);
        Iterator itr2 = cowAS.iterator();
        while (itr2.hasNext()) {
            Integer i = (Integer) itr2.next();
            if (i % 2 == 0) {
                // itr2.remove(); // this will throw exception
                cowAS.remove(i);
            }
        }
        System.out.println(cowAS);
        cowAS.forEach(value -> System.out.println(value));
        cowAS.forEach(System.out::println);

        /*interview Question*/
        /*List has 9 2 3 4 5 6 3 8 1 add 10 after 5 */
        searchingAndAddingInList();

        /*find and remove element from list*/
        findAndRemove();

    }


    public static void searchingAndAddingInList() {

        //it does not throws CHE some other can modify cowAS object
        CopyOnWriteArrayList<Integer> cowAS = new CopyOnWriteArrayList<>();
        cowAS.add(9);
        cowAS.add(2);
        cowAS.add(3);
        cowAS.add(5);
        cowAS.add(6);
        cowAS.add(3);
        cowAS.add(8);
        cowAS.add(1);

        //cowAS.indexOf(5); // if element found it return index otherwise -1
        //cowAS.add(cowAS.indexOf(5)+1,10);

        Iterator itr2 = cowAS.iterator();
        while (itr2.hasNext()) {
            Integer i = (Integer) itr2.next();
            if (i == 5) {
                cowAS.indexOf(i);
                cowAS.add(cowAS.indexOf(5) + 1, 10);
                break;
            }
        }

        cowAS.forEach(value -> System.out.println(value));

        List<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(6);
        al.add(3);
        al.add(8);
        al.add(1);

        //al.indexOf(15); // if element found it return index otherwise -1
        //al.add(cowAS.indexOf(15) + 1, 10);

        // you can make if else or iterate find index then + then add
        al.add(al.indexOf(15) + 1, 10);


        al.forEach(integer -> {
            System.out.println(integer);
        });
    }

    private static void findAndRemove() {


    }

}
