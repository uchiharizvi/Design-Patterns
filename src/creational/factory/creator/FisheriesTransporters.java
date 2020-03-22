package creational.factory.creator;

import creational.factory.product.Logistics;
import creational.factory.product.SeaLogistics;

public class FisheriesTransporters extends Transporters {
    @Override
    public Logistics delivery() {
        return new SeaLogistics();
    }
}
