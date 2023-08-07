package Lession3;

import Lession3.L3TimeConvertor.TimeConvertor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConvertorTest {

    @Test
    void minutesIntoSeconds() {
        double minutes=3;
        double expectedSeconds=180;

        double result= TimeConvertor.minutesIntoSeconds(3);
        Assertions.assertEquals(expectedSeconds,result);
    }
}