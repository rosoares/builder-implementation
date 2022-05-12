package builders;

import components.Address;
import components.Billing;
import components.Client;
import products.CableTvProduct;

public class CableTvBuilder implements Builder {

    private final CableTvProduct cableTvProduct;

    private CableTvBuilder() {
        cableTvProduct = new CableTvProduct();
    }

    public static CableTvBuilder start() {
        return new CableTvBuilder();
    }

    @Override
    public Builder buildAddress(Address address) {
        cableTvProduct.setAddress(address);
        return this;
    }

    @Override
    public Builder buildBilling(Billing billing) {
        cableTvProduct.setBilling(billing);
        return this;
    }

    @Override
    public Builder buildClient(Client client) {
        cableTvProduct.setClient(client);
        return this;
    }

    public Builder setChannelsPackage(String channelsPackage) {
        cableTvProduct.setChannelsPackage(channelsPackage);
        return this;
    }

    public CableTvProduct build() {
        return cableTvProduct;
    }
}
