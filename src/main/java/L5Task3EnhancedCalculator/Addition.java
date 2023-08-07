package L5Task3EnhancedCalculator;

public class Addition implements MathOperation {

    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }
}
