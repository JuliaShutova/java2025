import java.util.Date;

public class TimeFormatPractice {
    public static void main(String[] args) {
        Date now = new Date();
        
        System.out.printf("Текущее время: %tH:%tM:%tS%n", now, now, now);
        System.out.printf("Дата: %tA, %tB %tY года%n", now, now, now);
        System.out.printf("Час в 12-часовом формате: %tI%n", now);
        System.out.printf("Текущий месяц цифрой: %tm%n", now);
        System.out.printf("Год двумя цифрами: %ty%n", now);
    }
}