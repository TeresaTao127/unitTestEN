package L4Massage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowMessageTest {

    @Test
    void getMessage() {
        WindowMessage windowMessage1 = new WindowMessage();
        String expectedResult1 = "WindowMessage class";
        String result1 = windowMessage1.getMessage();
        Assertions.assertEquals(expectedResult1, result1);
    }
}