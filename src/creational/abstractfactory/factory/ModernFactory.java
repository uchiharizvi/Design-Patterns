package creational.abstractfactory.factory;

import creational.abstractfactory.products.*;
import creational.abstractfactory.products.modern.ModernChair;
import creational.abstractfactory.products.modern.ModernCofeeTable;
import creational.abstractfactory.products.modern.ModernSofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CofeeTable createCofeeTable() {
        return new ModernCofeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
