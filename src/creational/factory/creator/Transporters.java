package creational.factory.creator;

import creational.factory.product.Logistics;

public abstract class Transporters {
    public void deliver() {
        Logistics logistics = delivery();
        logistics.deliver();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Logistics delivery();
}
