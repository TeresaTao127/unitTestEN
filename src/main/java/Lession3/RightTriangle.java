package Lession3;

public class RightTriangle {
    public static boolean isRightTriangle(int a, int b, int c) {
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;

        return aSquared + bSquared == cSquared || aSquared + cSquared == bSquared || bSquared + cSquared == aSquared;
    }

}

