package L4WeekdayNames;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekdayNameConverterTest {

    @Test
    void getWeekdayName() {

        String expectedResult="Monday";
        String result = WeekdayNameConverter.getWeekdayName(Weekday.MONDAY);
        assertEquals(expectedResult,result);
    }
}