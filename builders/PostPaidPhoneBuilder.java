package builders;

import components.Address;
import components.Billing;
import components.Client;
import products.PostPaidPhoneProduct;

public class PostPaidPhoneBuilder implements Builder {

    private final PostPaidPhoneProduct postPaidPhoneProduct;

    private PostPaidPhoneBuilder() {
        postPaidPhoneProduct = new PostPaidPhoneProduct();
    }

    public static PostPaidPhoneBuilder start() {
        return new PostPaidPhoneBuilder();
    }

    @Override
    public Builder buildAddress(Address address) {
        return this;
    }

    @Override
    public Builder buildBilling(Billing billing) {
        postPaidPhoneProduct.setBilling(billing);
        return this;
    }

    @Override
    public Builder buildClient(Client client) {
        postPaidPhoneProduct.setClient(client);
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        postPaidPhoneProduct.setPhoneNumber(phoneNumber);
        return this;
    }

    public Builder setDataPackage(String dataPackage) {
        postPaidPhoneProduct.setDataPackage(dataPackage);
        return this;
    }

    public PostPaidPhoneProduct build() {
        return postPaidPhoneProduct;
    }
}
