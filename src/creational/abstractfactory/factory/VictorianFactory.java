package creational.abstractfactory.factory;

import creational.abstractfactory.products.*;
import creational.abstractfactory.products.victorian.VictorianChair;
import creational.abstractfactory.products.victorian.VictorianCofeeTable;
import creational.abstractfactory.products.victorian.VictorianSofa;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CofeeTable createCofeeTable() {
        return new VictorianCofeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
