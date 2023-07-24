package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOddOrEvenTest {

    @Test
    void isEven() {
        assertTrue(NumberOddOrEven.isEven(2));
    }

    @Test
    void isOdd() {
        assertTrue(NumberOddOrEven.isOdd(3));
    }
}