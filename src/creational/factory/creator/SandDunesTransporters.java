package creational.factory.creator;

import creational.factory.product.Logistics;
import creational.factory.product.TruckLogistics;

public class SandDunesTransporters extends Transporters {
    @Override
    public Logistics delivery() {
        return new TruckLogistics();
    }
}
