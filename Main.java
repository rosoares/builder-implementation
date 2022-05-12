import builders.PostPaidPhoneBuilder;
import builders.PrePaidPhoneBuilder;
import products.PostPaidPhoneProduct;
import products.PrePaidPhoneProduct;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        PrePaidPhoneBuilder prePaidPhoneBuilder = PrePaidPhoneBuilder.start();

        director.createProductWithClient(prePaidPhoneBuilder);
        prePaidPhoneBuilder.setPhoneNumber("+5538992436019");

        PostPaidPhoneBuilder postPaidPhoneBuilder = PostPaidPhoneBuilder.start();
        director.createProductWithClientAndBilling(postPaidPhoneBuilder);
        postPaidPhoneBuilder.setDataPackage("10Gb");
        postPaidPhoneBuilder.setPhoneNumber("5538992436018");

        PostPaidPhoneProduct postPaidPhoneProduct = postPaidPhoneBuilder.build();

        PrePaidPhoneProduct prePaidPhoneProduct = prePaidPhoneBuilder.build();


    }

}
