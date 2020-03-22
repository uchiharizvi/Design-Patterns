package creational.factory.product;

public class TruckLogistics implements Logistics {

    @Override
    public void deliver(){
        System.out.println("Delivering via Truck");
    }
}
