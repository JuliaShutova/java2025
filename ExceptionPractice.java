public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int zero = 0;
            int result = 10 / zero;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива: " + e.getMessage());
        }

        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный аргумент: " + e.getMessage());
        }

        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка приведения типа: " + e.getMessage());
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Обращение к null: " + e.getMessage());
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}