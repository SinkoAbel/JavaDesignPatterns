package org.example;

import org.example.unitTest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void threePlusSeven() {
        assertEquals(10, calculator.Addition(3, 7));
    }

    @Test
    void fiveMinusThirteen() {
        assertEquals(-8, calculator.Subtraction(5, 13));
    }

    @Test
    void sixMultipliedBySix() {
        assertEquals(36, calculator.Multiply(6, 6));
    }

    @Test
    void ninetyNineDividedByNine() {
        assertEquals(11, calculator.Division(99, 9));
    }

    @Test
    void errorByDividingZero() { assertThrows(ArithmeticException.class, () -> {
            calculator.Division(5, 0);
        });
    }
}