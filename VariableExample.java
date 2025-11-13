public class VariableExample {
    public static void main(String[] args) {
        int a = 1;
        int b; // объявляем b в той же области видимости, что и a
        {
            b = 2; // инициализируем b внутри блока
        }
        int c = a + b; // теперь работает, c = 3
        System.out.println("c = " + c); // выведет: c = 3
    }
}
