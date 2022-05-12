package products;

import components.Client;

public class PrePaidPhoneProduct {

    private Client client;
    private String phoneNumber;

    public PrePaidPhoneProduct(Client client, String phoneNumber) {
        this.client = client;
        this.phoneNumber = phoneNumber;
    }

    public PrePaidPhoneProduct() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
