package org.example.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String numberType) {
        if (numberType.equalsIgnoreCase("HEXA"))
            return new HexaFactory();
        else if (numberType.equalsIgnoreCase("BINARY"))
            return new BinaryFactory();
        else
            return null;
    }
}
