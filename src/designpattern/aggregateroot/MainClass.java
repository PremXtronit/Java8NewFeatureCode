package designpattern.aggregateroot;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Name1");

        Address a1 = new Address();
        a1.setAddress1("address1");
        a1.setAddressType(AddressType.HOME);


        Address a2 = new Address();
        a2.setAddress1("address1");
        a2.setAddressType(AddressType.HOME);

        List<Address> addresses = new ArrayList<>();
        addresses.add(a1);
        addresses.add(a2);

        c1.setAddresses(addresses);

        //Now let's say we want to implement the following validations:
        //“Customer can only have one address of Home type”.

        c1.addAddress(addresses);

    }
}
