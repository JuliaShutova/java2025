public class StringPractice {
    public static void main(String[] args) {
        String text = " Hello, Java World! ";
        String emptyText = "";
        String spaces = "   ";
        String numbers = "12345";
        String mixedCase = "HeLLo WoRLD";
        
        System.out.println("1. length() - длина строки: " + text.length());
        System.out.println("2. trim() - убирает пробелы по краям: '" + text.trim() + "'");
        System.out.println("3. toUpperCase() - в верхний регистр: " + text.toUpperCase());
        System.out.println("4. toLowerCase() - в нижний регистр: " + text.toLowerCase());
        System.out.println("5. substring() - часть строки: " + text.substring(7, 11));
        System.out.println("6. replace() - замена символов: " + text.replace('l', 'L'));
        System.out.println("7. contains() - проверка содержания: " + text.contains("Java"));
        System.out.println("8. isEmpty() - пустая ли строка: " + emptyText.isEmpty());
        System.out.println("9. isBlank() - пустая или только пробелы: " + spaces.isBlank());
        System.out.println("10. equalsIgnoreCase() - сравнение без учета регистра: " + mixedCase.equalsIgnoreCase("hello world"));
        
        System.out.println("\nДополнительные проверки:");
        System.out.println("startsWith: " + text.startsWith(" Hello"));
        System.out.println("endsWith: " + text.endsWith("World! "));
        System.out.println("charAt(1): " + text.charAt(1));
        System.out.println("indexOf('J'): " + text.indexOf('J'));
    }
}