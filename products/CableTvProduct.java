package products;

import components.Address;
import components.Billing;
import components.Client;

public class CableTvProduct {

    private Address address;
    private Billing billing;
    private Client client;
    private String channelsPackage;

    public CableTvProduct() {
    }

    public CableTvProduct(Address address, Billing billing, Client client, String channelsPackage) {
        this.address = address;
        this.billing = billing;
        this.client = client;
        this.channelsPackage = channelsPackage;
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

    public String getChannelsPackage() {
        return channelsPackage;
    }

    public void setChannelsPackage(String channelsPackage) {
        this.channelsPackage = channelsPackage;
    }
}
