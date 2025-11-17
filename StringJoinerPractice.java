import java.util.StringJoiner;

public class StringJoinerPractice {
    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println("Фрукты: " + joiner1.toString());
        
        StringJoiner joiner2 = new StringJoiner(" | ", "[ ", " ]");
        joiner2.add("Понедельник");
        joiner2.add("Вторник");
        joiner2.add("Среда");
        System.out.println("Дни недели: " + joiner2.toString());
        
        StringJoiner names = new StringJoiner(", ", "Студенты: ", ".");
        names.add("Анна");
        names.add("Иван");
        names.add("Мария");
        System.out.println(names.toString());
        
        StringJoiner emptyJoiner = new StringJoiner("-");
        System.out.println("Пустой джойнер: '" + emptyJoiner.toString() + "'");
        
        StringJoiner merged = joiner1.merge(joiner2);
        System.out.println("Объединенный: " + merged.toString());
        
        StringJoiner csv = new StringJoiner(";");
        csv.setEmptyValue("Нет данных");
        System.out.println("Пустой с сообщением: " + csv.toString());
        
        csv.add("Имя");
        csv.add("Возраст");
        csv.add("Город");
        System.out.println("CSV строка: " + csv.toString());
    }
}