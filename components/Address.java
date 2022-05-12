package components;

public class Address {

    private String street;
    private String neighborhood;
    private int houseNumber;

    public Address() {
    }

    public Address(String street, String neighborhood, int houseNumber) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
