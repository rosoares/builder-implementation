package products;

import components.Billing;
import components.Client;

public class PostPaidPhoneProduct {

    private Billing billing;
    private Client client;
    private String phoneNumber;
    private String dataPackage;

    public PostPaidPhoneProduct() {
    }

    public PostPaidPhoneProduct(Billing billing, Client client, String phoneNumber, String dataPackage) {
        this.billing = billing;
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.dataPackage = dataPackage;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDataPackage() {
        return dataPackage;
    }

    public void setDataPackage(String dataPackage) {
        this.dataPackage = dataPackage;
    }
}
