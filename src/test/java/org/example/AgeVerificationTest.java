package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeVerificationTest {

    @Test
    void isAdult() {


        assertTrue(AgeVerification.isAdult(18));

        }

}