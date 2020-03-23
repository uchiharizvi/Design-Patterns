package creational.abstractfactory;

import creational.abstractfactory.FurnitureBuyer;
import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.factory.ModernFactory;
import creational.abstractfactory.factory.VictorianFactory;

import java.util.Scanner;

public class FurnitureVariant {
    private static FurnitureFactory factory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Variant of Furniture");
        System.out.println("1) Victorian");
        System.out.println("2) Modern");
        Integer choice = scan.nextInt();
        switch(choice) {
            case 1:
                factory = new VictorianFactory();
            case 2:
                factory = new ModernFactory();
        }
        FurnitureBuyer buyer = new FurnitureBuyer(factory);
        buyer.createFurniture();
        buyer.status();
    }
}
