package L4UppercaseAndLowercaseLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class class2Test {

    @Test
    void getFormatText() {
        class2 class22 = new class2("ABCDEFG");
        String expectedResult = "abcdefg";
        String result = class22.getFormatText();
        Assertions.assertEquals(expectedResult, result);
    }
}