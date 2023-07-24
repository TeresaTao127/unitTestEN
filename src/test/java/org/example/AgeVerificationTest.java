package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {

    @Test
    void AgeGreaterThanOrEqualTo18() {

        assertTrue(AgeVerification.isAgeGreaterThanOrEqualTo18(18));

    }
}