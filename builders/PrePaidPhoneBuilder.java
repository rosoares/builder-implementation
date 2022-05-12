package builders;

import components.Address;
import components.Billing;
import components.Client;
import products.PrePaidPhoneProduct;

public class PrePaidPhoneBuilder implements Builder {

    private final PrePaidPhoneProduct prePaidPhoneProduct;

    private PrePaidPhoneBuilder() {
        prePaidPhoneProduct = new PrePaidPhoneProduct();
    }

    public static PrePaidPhoneBuilder start() {
        return new PrePaidPhoneBuilder();
    }

    @Override
    public Builder buildAddress(Address address) {
        return this;
    }

    @Override
    public Builder buildBilling(Billing billing) {
        return this;
    }

    @Override
    public Builder buildClient(Client client) {
        prePaidPhoneProduct.setClient(client);
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        prePaidPhoneProduct.setPhoneNumber(phoneNumber);
        return this;
    }

    public PrePaidPhoneProduct build() {
        return prePaidPhoneProduct;
    }
}
