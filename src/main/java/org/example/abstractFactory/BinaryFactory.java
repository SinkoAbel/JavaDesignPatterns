package org.example.abstractFactory;

import org.interfaces.RandomGeneratedNumber;

public class BinaryFactory extends AbstractFactory {
    @Override
    public RandomGeneratedNumber getNumber(String numberType) {
        if (numberType.equalsIgnoreCase("BINARY"))
            return new RandomBinaryNumber();
        return null;
    }
}
