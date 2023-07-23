package org.example.abstractFactory;

import org.interfaces.RandomGeneratedNumber;

public abstract class AbstractFactory {
    public abstract RandomGeneratedNumber getNumber(String numberType);
}
