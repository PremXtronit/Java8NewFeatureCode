package java8.lambda_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

    public static void main(String[] args) {

        List<Developer> list = new ArrayList<Developer>();
        list.add(new Developer(1, "A", 10));
        list.add(new Developer(2, "B", 20));

        //sort by age
        Collections.sort(list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //sort by name
        Collections.sort(list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        list.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

        list.forEach((developer) -> {
            System.out.println(developer);
        });

        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        list.forEach(System.out::println);

        Comparator<Developer> salaryComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        list.sort(salaryComparator.reversed());

    }


}
