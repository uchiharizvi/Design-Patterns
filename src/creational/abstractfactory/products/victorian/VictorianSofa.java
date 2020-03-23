package creational.abstractfactory.products.victorian;

import creational.abstractfactory.products.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void status() {
        System.out.println("Victorian Sofa has been created");
    }
}
