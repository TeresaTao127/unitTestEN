package L4UppercaseAndLowercaseLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextFormatterLowercase {


    @Test
    void shouldLowercaseText() {
        LettersLowerCase class22 = new LettersLowerCase("ABCDEFG");
        String expectedResult = "abcdefg";
        String result = class22.getFormatText();
        Assertions.assertEquals(expectedResult, result);
    }
}