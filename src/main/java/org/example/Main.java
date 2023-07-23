package org.example;

import org.example.abstractFactory.AbstractFactory;
import org.example.abstractFactory.FactoryProducer;
import org.example.observer.*;
import org.interfaces.RandomGeneratedNumber;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // --------- Programozz felületre implementáció helyett ---------
        System.out.println("---- Felületre programozás ----");
        Motorcycle YamahaR17 = new Motorcycle();
        YamahaR17.setEngineDriveHealth(new GoodEngineDriveHealth());
        System.out.println("Yamaha R17:");
        YamahaR17.engineDriveHealthStatus();

        Motorcycle YamahaMT04 = new Motorcycle();
        YamahaMT04.setEngineDriveHealth(new BadEngineDriveHealth());
        System.out.println("Yamaha MT-04:");
        YamahaMT04.engineDriveHealthStatus();
        System.out.println("---------------------------------------\n");
        // -------------------------------------------------------------


        // ---------- Observer & Singleton ----------
        System.out.println("---- Observer & Singleton ----");
        PackageSubject packageSubject = PackageSubject.getInstance();
        NotificationObserver notificationObserver = new NotificationObserver(packageSubject);

        packageSubject.setDeliveryStatus("Package arrived at warehouse.");
        packageSubject.setDeliveryStatus("Package at delivery.");
        packageSubject.setDeliveryStatus("Package delivered successfully!");
        System.out.println("---------------------------------------\n");
        // -------------------------------------------------------------


        //---------- Abstract Factory ----------
        System.out.println("---- Abstract Factory ----");
        AbstractFactory extendedNumberFactory = FactoryProducer.getFactory("BINARY");
        RandomGeneratedNumber rndNumber = extendedNumberFactory.getNumber("BINARY");
        rndNumber.generateValue(2, 64);

        extendedNumberFactory = FactoryProducer.getFactory("HEXA");
        rndNumber = extendedNumberFactory.getNumber("HEXA");
        rndNumber.generateValue(100, 10000);

        System.out.println("---------------------------------------\n");
        // -------------------------------------------------------------
    }
}