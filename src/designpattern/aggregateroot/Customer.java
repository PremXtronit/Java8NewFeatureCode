package designpattern.aggregateroot;

import java.util.Collections;
import java.util.List;

public class Customer {

    private String name;

    private List<Address> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(List<Address> addresses) {

        for (AddressType addressType : AddressType.values()) {
            int i = Collections.frequency(addresses, new Address(addressType));
            if (i > 1) {
                throw new IllegalArgumentException("Exception");
            }
        }
    }
}
