// класс для демонстрации работы с javadoc
// содержит примеры различных комментариев и дескрипторов

public class JavadocExample {
    
    private static int objectCount = 0;
    private String userName;
    private int userAge;

    // конструктор по умолчанию
    // инициализирует поля значениями по умолчанию
    public JavadocExample() {
        this.userName = "Unknown";
        this.userAge = 0;
        objectCount++;
    }

    // параметризованный конструктор
    // создает объект с указанными именем и возрастом
    // @param name имя пользователя
    // @param age возраст пользователя
    public JavadocExample(String name, int age) {
        // проверка валидности имени
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("имя не может быть пустым");
        }
        // проверка валидности возраста
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("возраст должен быть от 0 до 150");
        }
        this.userName = name;
        this.userAge = age;
        objectCount++;
    }

    // устанавливает данные пользователя
    // проверяет корректность входных параметров
    // @param name имя пользователя
    // @param age возраст пользователя
    // @return true если данные установлены успешно
    public boolean setUserData(String name, int age) {
        // проверка имени
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        // проверка возраста
        if (age < 0 || age > 150) {
            return false;
        }
        
        this.userName = name;
        this.userAge = age;
        return true;
    }

    // рассчитывает год рождения пользователя на основе текущего года
    public int calculateBirthYear(int currentYear) {
        return currentYear - this.userAge;
    }

    // возвращает строковое представление объекта
    @Override
    public String toString() {
        return "Имя: " + userName + ", Возраст: " + userAge;
    }

    // устаревший метод для получения информации о пользователе
    // @deprecated начиная с версии 1.0, используйте toString()
    @Deprecated
    public String getUserInfo() {
        return this.toString();
    }

    // возвращает количество созданных объектов класса
    public static int getObjectCount() {
        return objectCount;
    }

    // основной метод для демонстрации работы класса
    // создает объекты и выводит информацию о них
    // @param args аргументы командной строки
    public static void main(String[] args) {
        // создание объектов с разными конструкторами
        JavadocExample user1 = new JavadocExample();
        JavadocExample user2 = new JavadocExample("Анна", 25);
        
        // вывод информации об объектах
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        
        // использование методов
        user1.setUserData("Мария", 30);
        int birthYear = user2.calculateBirthYear(2024);
        
        System.out.println("год рождения второго пользователя: " + birthYear);
        System.out.println("всего создано объектов: " + JavadocExample.getObjectCount());
        
        // демонстрация устаревшего метода
        System.out.println("устаревший метод: " + user1.getUserInfo());
    }
}