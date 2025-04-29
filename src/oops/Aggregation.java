package oops;


/*
* Aggregation : Since Organization has Person as employees, the relationship between them is Aggregation.
*/


import java.util.List;

class Organization {
    private List<Person> employees;
}

class Person {
    private String name;
}


public class Aggregation {
}
