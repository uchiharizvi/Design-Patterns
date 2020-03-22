package creational.factory;

import creational.factory.creator.FisheriesTransporters;
import creational.factory.creator.SandDunesTransporters;
import creational.factory.creator.Transporters;

import java.util.Scanner;

public class ClientDemo {
    private static Transporters transporters;

    public static void main(String[] args) {
        chooseMode();
        requestDelivery();
    }

    private static void chooseMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Mode of Transport");
        System.out.println("1) Land");
        System.out.println("2) Sea");
        Integer choice = scanner.nextInt();
        switch(choice){
            case 1:
                transporters = new SandDunesTransporters();
                break;
            case 2:
                transporters = new FisheriesTransporters();
        }
    }

    private static void requestDelivery() {
        transporters.deliver();
    }

}
