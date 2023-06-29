package course2calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceable calculatorServiceable;

    public CalculatorController(CalculatorServiceable calculatorServiceable) {
        this.calculatorServiceable = calculatorServiceable;
    }
    @GetMapping
    public String welcome() {
        return calculatorServiceable.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorServiceable.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorServiceable.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorServiceable.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorServiceable.divide(num1, num2);
    }
}
