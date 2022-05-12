package products;

import components.Address;
import components.Billing;
import components.Client;

public class InternetProduct {

    private Address address;
    private Billing billing;
    private Client client;
    private String speed;
    private String technology;

    public InternetProduct(Address address, Billing billing, Client client, String speed, String technology) {
        this.address = address;
        this.billing = billing;
        this.client = client;
        this.speed = speed;
        this.technology = technology;
    }

    public InternetProduct() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
