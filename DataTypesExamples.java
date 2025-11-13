public class DataTypesExamples {
    public static void main(String[] args) {
        byte byteValue = 100;
        byte zeroByte = 0;
        byte minByte = -128;
        byte maxByte = 127;

        short shortValue = 30000;
        short zeroShort = 0;
        short minShort = -32768;
        short maxShort = 32767;

        int intValue = 2000000000;
        int zeroInt = 0;
        int minInt = -2147483648;
        int maxInt = 2147483647;

        long longValue = 9000000000000000000L;
        long zeroLong = 0L;
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        float floatValue = 3.14f;
        float zeroFloat = 0.0f;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double doubleValue = 3.14159265359;
        double zeroDouble = 0.0;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        char charValue = 'A';
        char zeroChar = '\u0000';
        char unicodeChar = '\u03A9';
        char digitChar = '7';

        boolean booleanValue = true;
        boolean falseValue = false;

        System.out.println("byte: " + byteValue + ", zero: " + zeroByte);
        System.out.println("short: " + shortValue + ", zero: " + zeroShort);
        System.out.println("int: " + intValue + ", zero: " + zeroInt);
        System.out.println("long: " + longValue + ", zero: " + zeroLong);
        System.out.println("float: " + floatValue + ", zero: " + zeroFloat);
        System.out.println("double: " + doubleValue + ", zero: " + zeroDouble);
        System.out.println("char: " + charValue + ", zero: " + (int)zeroChar);
        System.out.println("boolean: " + booleanValue + ", false: " + falseValue);
    }
}
