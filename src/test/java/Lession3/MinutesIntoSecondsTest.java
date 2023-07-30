package Lession3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesIntoSecondsTest {

    @Test
    void minutesIntoSeconds() {
        double minutes=2.5;
        double expectedSeconds=150;

        double result= TimeConverter.minutesIntoSeconds(2.5);
        Assertions.assertEquals(expectedSeconds,result);
    }
}