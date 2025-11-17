interface MathOperations {
    default int multiply(int a, int b) {
        return a * b;
    }
    
    static void printPi() {
        System.out.println("Число Пи: 3.14159");
    }
}

class Calculator implements MathOperations {
    @Override
    public int multiply(int a, int b) {
        System.out.println("Выполняю умножение...");
        return a * b;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int result1 = calc.multiply(5, 6);
        System.out.println("Умножение через объект: " + result1);
        
        MathOperations.printPi();
        
        MathOperations ops = new Calculator();
        int result2 = ops.multiply(3, 4);
        System.out.println("Умножение через интерфейс: " + result2);
    }
}