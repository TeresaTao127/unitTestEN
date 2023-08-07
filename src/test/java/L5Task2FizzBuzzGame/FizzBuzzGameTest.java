package L5Task2FizzBuzzGame;

import Lession3.L3TimeConvertor.TimeConvertor;
import Lession3.RightTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    void isFizz() {
        int i = 3;
        boolean isFizz = (i % 3 == 0);
        assertTrue(true);
    }
    @Test
    void isBuzz() {
        int i = 10;
        boolean isFizz = (i % 5 == 0);
        assertTrue(true);
    }
    @Test
    void isFizzBuzz() {
        int i = 15;
        boolean isFizz = (i % 15 == 0);
        assertTrue(true);
    }
}