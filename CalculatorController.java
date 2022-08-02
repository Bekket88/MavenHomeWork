package pro.sky.MavenHomeWork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String printWelcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " + " + b + " = " + calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " - " + b + " = " + calculatorService.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        if (b == 0) {
            return "На ноль делить нельзя";
        } else {
            return a + " / " + b + " = " + calculatorService.divide(a, b);
        }
    }
}
