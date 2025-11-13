class Calculator {
    
    // Перегрузка методов - разные версии сложения
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    // Перегрузка с разными типами параметров
    public void printResult(int result) {
        System.out.println("Результат: " + result);
    }
    
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    
    public void printResult(String message) {
        System.out.println(message);
    }
}

class ScientificCalculator extends Calculator {
    
    // Переопределение метода - меняем реализацию
    @Override
    public void printResult(int result) {
        System.out.println("Научный результат: " + result + " единиц");
    }
    
    // Новый метод в подклассе
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    // Перегрузка в подклассе
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class MathTest {
    public static void main(String[] args) {
        Calculator simpleCalc = new Calculator();
        
        // Использование перегруженных методов
        int sum1 = simpleCalc.add(5, 3);
        double sum2 = simpleCalc.add(5.5, 3.2);
        int sum3 = simpleCalc.add(1, 2, 3);
        String text = simpleCalc.add("Hello ", "World");
        
        simpleCalc.printResult(sum1);
        simpleCalc.printResult(sum2);
        simpleCalc.printResult(text);
        
        ScientificCalculator sciCalc = new ScientificCalculator();
        
        // Переопределенный метод работает по-другому
        sciCalc.printResult(100);
        
        // Методы из родительского класса тоже работают
        int sciSum = sciCalc.add(10, 20);
        sciCalc.printResult(sciSum);
        
        // Новые методы подкласса
        double powerResult = sciCalc.power(2, 8);
        sciCalc.printResult(powerResult);
    }
}