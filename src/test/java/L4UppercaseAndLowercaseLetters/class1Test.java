package L4UppercaseAndLowercaseLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class class1Test {

    @Test
    void getFormatText() {
        class1 class11 = new class1("abcdefg");
        String expectedResult = "ABCDEFG";
        String result = class11.getFormatText();
        Assertions.assertEquals(expectedResult, result);

    }
}