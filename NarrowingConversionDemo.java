public class NarrowingConversionDemo {
    public static void main(String[] args) {
        System.out.println("Примеры сужающего преобразования");
        
        int i = 1000;
        byte b = (byte) i;
        System.out.println("int " + i + " -> byte: " + b);
        
        long l = 123456789L;
        int i2 = (int) l;
        System.out.println("long " + l + " -> int: " + i2);
        
        double d = 123.456;
        int i3 = (int) d;
        System.out.println("double " + d + " -> int: " + i3);
        
        float f = 99.99f;
        short s = (short) f;
        System.out.println("float " + f + " -> short: " + s);
        
        int largeInt = 200;
        byte smallByte = (byte) largeInt;
        System.out.println("int " + largeInt + " -> byte: " + smallByte);
        
        double bigDouble = 300.75;
        byte tinyByte = (byte) bigDouble;
        System.out.println("double " + bigDouble + " -> byte: " + tinyByte);
        
        System.out.println("\n Потеря данных при переполнении");
        int overflow = 130;
        byte overflowByte = (byte) overflow;
        System.out.println("int " + overflow + " -> byte: " + overflowByte);
        
        long bigLong = 5000000000L;
        int smallInt = (int) bigLong;
        System.out.println("long " + bigLong + " -> int: " + smallInt);
        
        System.out.println("\n Преобразование с отрицательными числами");
        double negativeDouble = -45.67;
        int negativeInt = (int) negativeDouble;
        System.out.println("double " + negativeDouble + " -> int: " + negativeInt);
    }
}
