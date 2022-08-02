package pro.sky.MavenHomeWork;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }
}
