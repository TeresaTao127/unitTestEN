package L4UppercaseAndLowercaseLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextFormatterUppercase {

    @Test
    void shouldUppercaseText() {
        Class1 class11 = new Class1("abcdefg");
        String expectedResult = "ABCDEFG";
        String result = class11.getFormatText();
        Assertions.assertEquals(expectedResult, result);

    }
}