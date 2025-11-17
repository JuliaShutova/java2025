public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Программа запустилась");
        
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Элемент массива: " + numbers[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка с массивом: " + e.getMessage());
        }
        
        String text = null;
        System.out.println("Длина строки: " + text.length());
        
        System.out.println("Этот текст уже не выведется");
    }
}