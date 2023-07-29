package Lession3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class rightTriangleTest {

    @Test
    void isRightTriangle() {
        assertTrue(rightTriangle.isRightTriangle(3, 4, 5));
    }
}