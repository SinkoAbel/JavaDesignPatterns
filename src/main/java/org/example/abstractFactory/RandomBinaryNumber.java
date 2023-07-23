package org.example.abstractFactory;

import org.interfaces.RandomGeneratedNumber;

import java.util.Random;

public class RandomBinaryNumber implements RandomGeneratedNumber {
    @Override
    public void generateValue(int from, int to) {
        Random rnd = new Random();
        int generatedInt = rnd.nextInt(to) + from;
        System.out.println("Random generated binary number: " + Integer.toBinaryString(generatedInt));
    }
}
