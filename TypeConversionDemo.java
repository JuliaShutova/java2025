public class TypeConversionDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.6;
        
        System.out.println("byte + short = " + (b + s) + " (тип: int)");
        System.out.println("int + long = " + (i + l) + " (тип: long)");
        System.out.println("long + float = " + (l + f) + " (тип: float)");
        System.out.println("float + double = " + (f + d) + " (тип: double)");
        
        System.out.println("\n Смешанные операции");
        System.out.println("byte + int + long = " + (b + i + l) + " (тип: long)");
        System.out.println("int + float + double = " + (i + f + d) + " (тип: double)");
        
        System.out.println("\n Деление разных типов");
        int intDiv = 10;
        double doubleDiv = 3.0;
        System.out.println("int / double = " + (intDiv / doubleDiv) + " (тип: double)");
        
        System.out.println("\n Умножение разных типов");
        byte byteVal = 5;
        float floatVal = 2.5f;
        System.out.println("byte * float = " + (byteVal * floatVal) + " (тип: float)");
        
        System.out.println("\n С участием char");
        char c = 'A'; 
        int intVal = 10;
        System.out.println("char + int = " + (c + intVal) + " (тип: int)");
    }
}
