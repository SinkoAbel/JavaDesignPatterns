package org.example.abstractFactory;

import org.interfaces.RandomGeneratedNumber;

public class HexaFactory extends AbstractFactory {
    @Override
    public RandomGeneratedNumber getNumber(String numberType) {
        if (numberType.equalsIgnoreCase("HEXA"))
            return new RandomHexaNumber();
        return null;
    }
}
