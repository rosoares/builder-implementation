package builders;

import components.Address;
import components.Billing;
import components.Client;
import products.InternetProduct;

public class InternetBuilder implements Builder {

    private final InternetProduct internetProduct;

    private InternetBuilder() {
        internetProduct = new InternetProduct();
    }

    public static InternetBuilder start() {
        return new InternetBuilder();
    }

    @Override
    public Builder buildAddress(Address address) {
        internetProduct.setAddress(address);
        return this;
    }

    @Override
    public Builder buildBilling(Billing billing) {
        internetProduct.setBilling(billing);
        return this;
    }

    @Override
    public Builder buildClient(Client client) {
        internetProduct.setClient(client);
        return this;
    }

    public Builder setSpeed(String speed) {
        internetProduct.setSpeed(speed);
        return this;
    }

    public Builder setTechnology(String technology) {
        internetProduct.setTechnology(technology);
        return this;
    }

    public InternetProduct build() {
        return internetProduct;
    }
}
