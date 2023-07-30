package L4AreaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnProperAreaOfARectangle() {
        Rectangle rectangle1 = new Rectangle(5, 6);
        double expectedResult = 30;
        double result = rectangle1.getArea();
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnProperPerimeterOfARectangle() {
        Rectangle rectangle1 = new Rectangle(7, 8);
        double expectedResult=30;
        double result=rectangle1.getPerimeter();
        Assertions.assertEquals(expectedResult,result);
    }
}