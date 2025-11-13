public class DecodeExample {
    public static void main(String[] args) {
        // декодирование шестнадцатеричных чисел
        Integer hex1 = Integer.decode("0x10");
        Integer hex2 = Integer.decode("0XFF");
        Integer hex3 = Integer.decode("#A0");
        
        System.out.println("0x10 = " + hex1);
        System.out.println("0XFF = " + hex2);
        System.out.println("#A0 = " + hex3);
        
        // декодирование восьмеричных чисел
        Integer oct1 = Integer.decode("010");
        Integer oct2 = Integer.decode("077");
        
        System.out.println("010 = " + oct1);
        System.out.println("077 = " + oct2);
        
        // декодирование десятичных чисел
        Integer dec1 = Integer.decode("100");
        Integer dec2 = Integer.decode("-50");
        
        System.out.println("100 = " + dec1);
        System.out.println("-50 = " + dec2);
        
        // примеры с другими классами-оболочками
        Long longHex = Long.decode("0x1000L");
        Long longOct = Long.decode("01000");
        Short shortHex = Short.decode("0x7F");
        
        System.out.println("0x1000L = " + longHex);
        System.out.println("01000 = " + longOct);
        System.out.println("0x7F = " + shortHex);
        
        // обработка исключений
        try {
            Integer invalid1 = Integer.decode("abc");
        } catch (NumberFormatException e) {
            System.out.println("ошибка декодирования 'abc': " + e.getMessage());
        }
        
        try {
            Integer invalid2 = Integer.decode("0xGH");
        } catch (NumberFormatException e) {
            System.out.println("ошибка декодирования '0xGH': " + e.getMessage());
        }
        
        // сравнение с другими методами
        Integer parseResult = Integer.parseInt("100");
        Integer decodeResult = Integer.decode("100");
        Integer valueOfResult = Integer.valueOf("100");
        
        System.out.println("parseInt('100') = " + parseResult);
        System.out.println("decode('100') = " + decodeResult);
        System.out.println("valueOf('100') = " + valueOfResult);
        
        // разница в обработке разных систем счисления
        System.out.println("parseInt('010') = " + Integer.parseInt("010")); // 10
        System.out.println("decode('010') = " + Integer.decode("010")); // 8
        System.out.println("parseInt('0x10') = " + Integer.parseInt("0x10")); // ошибка
        System.out.println("decode('0x10') = " + Integer.decode("0x10")); // 16
    }
}