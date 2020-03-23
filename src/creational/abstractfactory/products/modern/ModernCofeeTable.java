package creational.abstractfactory.products.modern;

import creational.abstractfactory.products.CofeeTable;

public class ModernCofeeTable implements CofeeTable {
    @Override
    public void status() {
        System.out.println("Modern Cofee Table has been created");
    }
}
