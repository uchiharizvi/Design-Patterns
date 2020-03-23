package creational.abstractfactory.products.modern;

import creational.abstractfactory.products.Chair;

public class ModernChair implements Chair {
    @Override
    public void status() {
        System.out.println("Modern Chair has been created");
    }
}
