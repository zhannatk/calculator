package course2calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceable {

    @Override
    public String welcome() {
        return "Welcome to calculator!";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        int result = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Error - not all parameters have been applied ");
        } else {
            result = num1 + num2;
        }
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        int equals = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Error - not all parameters have been applied");
        } else {
            equals = num1 - num2;
        }
        return num1 + " - " + num2 + " = " + equals;    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        int equals = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Error - not all parameters have been applied");
        } else {
            equals = num1 * num2;
        }
        return num1 + " * " + num2 + " = " + equals;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        int equals = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Error - not all parameters have been applied");
        } else {
            equals = num1 / num2;
        }
        return num1 + "/" + num2 + " = " + equals;    }

}
