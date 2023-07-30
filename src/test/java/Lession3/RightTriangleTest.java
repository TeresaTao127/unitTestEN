package Lession3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RightTriangleTest {

    @Test
    void isRightTriangle() {
        assertTrue(RightTriangle.isRightTriangle(3, 4, 5));
    }
}