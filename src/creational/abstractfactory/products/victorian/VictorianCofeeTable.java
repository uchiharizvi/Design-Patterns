package creational.abstractfactory.products.victorian;

import creational.abstractfactory.products.CofeeTable;

public class VictorianCofeeTable implements CofeeTable {
    @Override
    public void status() {
        System.out.println("Victorian Cofee Table has been created");
    }
}
