public class Calculator {
    
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public double sum(double... numbers) {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }
    
    public String sum(String... texts) {
        StringBuilder result = new StringBuilder();
        for (String text : texts) {
            result.append(text);
        }
        return result.toString();
    }
    
    public void printInfo(String title, int... values) {
        System.out.print(title + ": ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public void printInfo(String title, String... messages) {
        System.out.print(title + ": ");
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println();
    }

    public static void main1(String[] args) {
        Calculator calc = new Calculator();
        
        int result1 = calc.sum(1, 2, 3);
        System.out.println("Сумма чисел: " + result1);
        
        double result2 = calc.sum(1.5, 2.3, 3.7);
        System.out.println("Сумма дробных: " + result2);
        
        String result3 = calc.sum("Hello", " ", "World");
        System.out.println("Конкатенация: " + result3);
        
        calc.printInfo("Числа", 10, 20, 30);
        calc.printInfo("Сообщения", "привет", "мир");
    }
}