import java.util.Formatter;

public class FormatPractice {
    public static void main(String[] args) {
        String name = "Анна";
        int age = 25;
        double salary = 1234.567;
        boolean isWorking = true;
        char grade = 'A';
        
        Formatter formatter = new Formatter();
        formatter.format("Имя: %s, возраст: %d лет%n", name, age);
        formatter.format("Зарплата: %.2f рублей%n", salary);
        formatter.format("Работает: %b%n", isWorking);
        formatter.format("Оценка: %c%n", grade);
        formatter.format("Хэш-код имени: %h%n", name);
        
        System.out.println(formatter);
        
        System.out.printf("Процент скидки: 20%%%n");
        
        String result = String.format("Кратко: %s (%d лет)", name, age);
        System.out.println(result);
    }
}