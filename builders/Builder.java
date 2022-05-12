package builders;

import components.Address;
import components.Billing;
import components.Client;

public interface Builder {

    Builder buildAddress(Address address);

    Builder buildBilling(Billing billing);

    Builder buildClient(Client client);

}
