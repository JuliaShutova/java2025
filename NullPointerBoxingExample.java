public class NullPointerBoxingExample {
    public static void main(String[] args) {
        // пример исключения NullPointerException при автораспаковке
        
        Integer nullInteger = null;
        Double nullDouble = null;
        Boolean nullBoolean = null;
        
        System.out.println("=== примеры NullPointerException ===");
        
        try {
            // попытка автораспаковки null в int
            int i = nullInteger; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при автораспаковке Integer в int");
        }
        
        try {
            // попытка автораспаковки null в double
            double d = nullDouble; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при автораспаковке Double в double");
        }
        
        try {
            // попытка автораспаковки null в boolean
            boolean b = nullBoolean; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при автораспаковке Boolean в boolean");
        }
        
        try {
            // арифметические операции с null
            Integer result = nullInteger + 10; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при арифметической операции с null Integer");
        }
        
        try {
            // сравнение с примитивом
            boolean comparison = (nullInteger == 5); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при сравнении null Integer с примитивом");
        }
        
        System.out.println("\n=== безопасные операции с null ===");
        
        // безопасные операции (не вызывают исключение)
        Integer safeInteger = null;
        
        // сравнение двух null объектов
        boolean safe1 = (safeInteger == null); // true - безопасно
        System.out.println("null Integer == null: " + safe1);
        
        // сравнение с другим null объектом
        Integer anotherNull = null;
        boolean safe2 = (safeInteger == anotherNull); // true - безопасно
        System.out.println("null Integer == null Integer: " + safe2);
        
        // вызов методов на null объекте (тоже NullPointerException)
        try {
            String stringValue = safeInteger.toString(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при вызове метода на null объекте");
        }
        
        System.out.println("\n=== безопасная работа с null ===");
        
        // безопасные способы обработки
        Integer potentiallyNull = getPossiblyNullInteger();
        
        // проверка перед автораспаковкой
        if (potentiallyNull != null) {
            int safeValue = potentiallyNull; // безопасно
            System.out.println("безопасная автораспаковка: " + safeValue);
        } else {
            System.out.println("значение равно null, используем значение по умолчанию");
            int defaultValue = 0;
            System.out.println("значение по умолчанию: " + defaultValue);
        }
        
        // использование тернарного оператора
        int result = (potentiallyNull != null) ? potentiallyNull : 0;
        System.out.println("результат с тернарным оператором: " + result);
    }
    
    // метод который может вернуть null
    public static Integer getPossiblyNullInteger() {
        return null;
    }
}