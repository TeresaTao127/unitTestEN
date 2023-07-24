package org.example;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void AddTwoNumber() {
        int numberA = 3;
        int numberB = 6;
        int expectedResult = 9;

        int result = Calculator.sum(numberA, numberB);

        Assertions.assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    void SubtractTwoNumber() {
        int numberA = 4;
        int numberB = 9;
        int expectedResult = -5;

        int result = Calculator.subtract(numberA, numberB);

        Assertions.assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    void MultiplyTwoNumber() {
        int numberA = 7;
        int numberB = 5;
        int expectedResult = 35;

        int result = Calculator.multiplication(numberA, numberB);

        Assertions.assertEquals(expectedResult, result);
    }


    @org.junit.jupiter.api.Test
    void divideTwoNumber() {
        int numberA = 8;
        int numberB = 4;
        double expectedResult = 2;

        double result = Calculator.divide(numberA, numberB);

        Assertions.assertEquals(expectedResult, result);
    }
}

