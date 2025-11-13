public class BooleanCreation {
    public static void main(String[] args) {
        // 1. создание через valueOf(boolean value)
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        
        // 2. создание через valueOf(String s)
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("TRUE");
        Boolean bool6 = Boolean.valueOf("FALSE");
        Boolean bool7 = Boolean.valueOf("True");
        Boolean bool8 = Boolean.valueOf("False");
        
        // 3. создание через конструктор (устаревший способ)
        Boolean bool9 = new Boolean(true);
        Boolean bool10 = new Boolean(false);
        Boolean bool11 = new Boolean("true");
        Boolean bool12 = new Boolean("false");
        
        // 4. создание через parseBoolean(String s)
        boolean primitive = Boolean.parseBoolean("true");
        Boolean bool13 = Boolean.valueOf(primitive); // комбинация с valueOf
        
        // 5. автоупаковка (autoboxing)
        Boolean bool14 = true;
        Boolean bool15 = false;
        
        // 6. создание через системные свойства
        Boolean bool16 = Boolean.getBoolean("java.version"); // вернет false если свойство не установлено
        
        System.out.println("=== способы создания Boolean ===");
        System.out.println("valueOf(true): " + bool1);
        System.out.println("valueOf(false): " + bool2);
        System.out.println("valueOf(\"true\"): " + bool3);
        System.out.println("valueOf(\"false\"): " + bool4);
        System.out.println("valueOf(\"TRUE\"): " + bool5);
        System.out.println("valueOf(\"FALSE\"): " + bool6);
        System.out.println("new Boolean(true): " + bool9);
        System.out.println("new Boolean(\"true\"): " + bool11);
        System.out.println("autoboxing true: " + bool14);
        System.out.println("autoboxing false: " + bool15);
        
        System.out.println("\n=== особые случаи ===");
        // любые строки кроме "true" возвращают false
        System.out.println("valueOf(\"yes\"): " + Boolean.valueOf("yes"));
        System.out.println("valueOf(\"1\"): " + Boolean.valueOf("1"));
        System.out.println("valueOf(\"on\"): " + Boolean.valueOf("on"));
        System.out.println("valueOf(\"\"): " + Boolean.valueOf(""));
        System.out.println("valueOf(null): " + Boolean.valueOf(null));
        
        System.out.println("\n=== сравнение методов ===");
        System.out.println("parseBoolean(\"true\"): " + Boolean.parseBoolean("true"));
        System.out.println("parseBoolean(\"false\"): " + Boolean.parseBoolean("false"));
        System.out.println("parseBoolean(\"yes\"): " + Boolean.parseBoolean("yes"));
        
        // разница между valueOf и parseBoolean
        Boolean fromValueOf = Boolean.valueOf("true"); // возвращает Boolean
        boolean fromParse = Boolean.parseBoolean("true"); // возвращает boolean
        System.out.println("тип valueOf: " + fromValueOf.getClass().getSimpleName());
        System.out.println("тип parseBoolean: " + ((Object)fromParse).getClass().getSimpleName());
    }
}
