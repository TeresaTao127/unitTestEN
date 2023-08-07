package L5Task3EnhancedCalculator;

public class Division implements MathOperation {
    @Override
    public double calculate(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return number1 / number2;

    }
}
