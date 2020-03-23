package creational.abstractfactory.products.victorian;

import creational.abstractfactory.products.Chair;

public class VictorianChair implements Chair {

    @Override
    public void status() {
        System.out.println("Victorian Chair has been created");
    }
}
