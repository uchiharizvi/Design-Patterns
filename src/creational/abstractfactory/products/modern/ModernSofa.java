package creational.abstractfactory.products.modern;

import creational.abstractfactory.products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void status() {
        System.out.println("Modern Sofa has been created");
    }
}
