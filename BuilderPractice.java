public class BuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        System.out.println("1. append() - добавляет в конец: " + sb.append(" World"));
        System.out.println("2. insert() - вставляет в позицию: " + sb.insert(5, " Java"));
        System.out.println("3. delete() - удаляет часть: " + sb.delete(5, 10));
        System.out.println("4. reverse() - переворачивает: " + sb.reverse());
        sb.reverse();
        System.out.println("5. replace() - заменяет часть: " + sb.replace(6, 11, "Everyone"));
        System.out.println("6. charAt() - символ по индексу: " + sb.charAt(0));
        System.out.println("7. length() - длина: " + sb.length());
        System.out.println("8. capacity() - вместимость: " + sb.capacity());
        sb.ensureCapacity(50);
        System.out.println("9. ensureCapacity() - увеличивает вместимость");
        System.out.println("10. toString() - в строку: " + sb.toString());
        
        StringBuffer buffer = new StringBuffer("Thread");
        buffer.append(" Safe");
        System.out.println("StringBuffer: " + buffer.toString());
    }
}