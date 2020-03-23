package creational.abstractfactory.factory;

import creational.abstractfactory.products.Chair;
import creational.abstractfactory.products.CofeeTable;
import creational.abstractfactory.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CofeeTable createCofeeTable();
    Sofa createSofa();
}
