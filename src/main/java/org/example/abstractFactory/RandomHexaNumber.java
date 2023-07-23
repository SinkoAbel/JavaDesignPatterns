package org.example.abstractFactory;

import org.interfaces.RandomGeneratedNumber;

import java.util.Random;

public class RandomHexaNumber implements RandomGeneratedNumber {
    @Override
    public void generateValue(int from, int to) {
        Random rnd = new Random();
        int randomInt = rnd.nextInt(to) + from;
        System.out.println("Random generated hexadecimal number: " + Integer.toHexString(randomInt));
    }
}
