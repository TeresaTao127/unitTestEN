package Lession4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest  {

    @Test
    void shouldReturnProperAreaOfASquare() {
        Square square1 = new Square(6);
        double expectedResult = 36;
        double result = square1.getArea();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnProperPerimeterOfASquare() {
        Square square1 = new Square(7);
        double expectedResult = 28;
        double result = square1.getPerimeter();

        Assertions.assertEquals(expectedResult, result);
    }
}