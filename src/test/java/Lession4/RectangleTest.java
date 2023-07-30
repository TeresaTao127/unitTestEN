package Lession4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle1 = new Rectangle(6,8);
        double expectedResult = 48;
        double result = rectangle1.getArea();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle1 = new Rectangle(7,8);
        double expectedResult = 30;
        double result = rectangle1.getPerimeter();

        Assertions.assertEquals(expectedResult, result);
    }
}