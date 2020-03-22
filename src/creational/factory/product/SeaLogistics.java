package creational.factory.product;

public class SeaLogistics implements Logistics {
    @Override
    public void deliver() {
        System.out.println("delivering via ship");
    }
}
