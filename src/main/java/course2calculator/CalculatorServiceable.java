package course2calculator;

public interface CalculatorServiceable {
    String welcome();

    String plus(Integer num1, Integer num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);
}