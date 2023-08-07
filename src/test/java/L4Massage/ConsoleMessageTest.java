package L4Massage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleMessageTest {

    @Test
    void getMessage() {
        ConsoleMessage consoleMessage1 = new ConsoleMessage();
        String expectedResult = "ConsoleMessage class";
        String result = consoleMessage1.getMessage();
        Assertions.assertEquals(expectedResult, result);

    }
}