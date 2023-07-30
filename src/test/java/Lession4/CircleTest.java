package Lession4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle1 = new Circle(1);
        double expectedResult = Math.PI;
        double result = circle1.getArea();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void getPerimeter() {
        Circle circle1 = new Circle(1);
        double expectedResult = 2*Math.PI;
        double result = circle1.getPerimeter();

        Assertions.assertEquals(expectedResult, result);
    }
}