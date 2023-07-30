package Lession4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle1 = new Triangle(3,4,5);
        double expectedResult = 6;
        double result = triangle1.getArea();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void getPerimeter() {
        Triangle triangle1 = new Triangle(3,4,5);
        double expectedResult = 12;
        double result = triangle1.getPerimeter();

        Assertions.assertEquals(expectedResult, result);
    }
}