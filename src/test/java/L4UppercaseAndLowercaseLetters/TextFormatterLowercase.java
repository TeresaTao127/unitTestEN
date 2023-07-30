package L4UppercaseAndLowercaseLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextFormatterLowercase {

    @Test
    void shouldLowercaseText() {
        Class2 class22 = new Class2("ABCDEFG");
        String expectedResult = "abcdefg";
        String result = class22.getFormatText();
        Assertions.assertEquals(expectedResult, result);
    }
}