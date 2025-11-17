interface NumberFormatter {
    default String format(int number) {
        return "Число: " + number;
    }
}

interface HexConverter {
    default String format(int number) {
        return "Hex: " + Integer.toHexString(number);
    }
}

class NumberProcessor implements NumberFormatter, HexConverter {
    @Override
    public String format(int number) {
        System.out.println("Обрабатываю число " + number);
        return HexConverter.super.format(number);
    }
    
    public String formatAsDecimal(int number) {
        return NumberFormatter.super.format(number);
    }
    
    public String formatAsHex(int number) {
        return HexConverter.super.format(number);
    }
}

public class Practice2{
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        
        String result1 = processor.format(255);
        System.out.println("Основной формат: " + result1);
        
        String result2 = processor.formatAsDecimal(255);
        System.out.println("Десятичный формат: " + result2);
        
        String result3 = processor.formatAsHex(255);
        System.out.println("Шестнадцатеричный формат: " + result3);
    }
}