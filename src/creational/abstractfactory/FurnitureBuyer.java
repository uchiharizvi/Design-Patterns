package creational.abstractfactory;

import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.factory.ModernFactory;
import creational.abstractfactory.factory.VictorianFactory;
import creational.abstractfactory.products.Chair;
import creational.abstractfactory.products.CofeeTable;
import creational.abstractfactory.products.Sofa;

import java.util.Scanner;

public class FurnitureBuyer {

    private static FurnitureFactory factory;
    private static Chair chair;
    private static Sofa sofa;
    private static CofeeTable cofeeTable;

    public FurnitureBuyer(FurnitureFactory factory) {
        this.factory = factory;

    }

    public void createFurniture() {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.cofeeTable = factory.createCofeeTable();
    }

    public void status() {
        chair.status();
        sofa.status();
        cofeeTable.status();
    }


}

