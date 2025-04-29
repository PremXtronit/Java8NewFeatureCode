package designpattern.aggregateroot;

import java.util.Objects;

public class Address {

    private String address1;
    private AddressType addressType;


    public Address() {
    }

    public Address(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressType == address.addressType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressType);
    }
}
