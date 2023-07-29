package org.example;

import org.example.ageVerification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ageVerificationTest {

    @Test
    void isAdult() {


        assertTrue(ageVerification.isAdult(18));

        }

}