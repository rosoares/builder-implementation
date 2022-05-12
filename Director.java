import builders.Builder;
import components.Billing;
import components.Client;

import java.math.BigDecimal;

public class Director {

    public void createProductWithClient(Builder builder) {


        builder.buildClient(getNewClient());
    }

    public void createProductWithClientAndBilling(Builder builder) {

        builder.buildBilling(getNewBilling());
        builder.buildClient(getNewClient());

    }

    private Client getNewClient() {
        // Client data can be fetched by an API or Database
        return new Client("Jhon Client", "000111");
    }

    private Billing getNewBilling() {
        return new Billing("Credit Card", new BigDecimal("49.99"), true);
    }

}
