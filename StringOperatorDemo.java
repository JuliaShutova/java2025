public class StringOperatorDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        int number = 42;
        double price = 19.99;
        boolean isActive = true;
        char symbol = '!';
        
        String result1 = str1 + " " + str2;
        System.out.println(result1);
        
        String result2 = "Number: " + number;
        System.out.println(result2);
        
        String result3 = "Price: " + price + " USD";
        System.out.println(result3);
        
        String result4 = "Status: " + isActive;
        System.out.println(result4);
        
        String result5 = str1 + symbol;
        System.out.println(result5);
        
        String result6 = "Calculation: " + (10 + 5);
        System.out.println(result6);
        
        String result7 = "Mixed: " + number + price + str1;
        System.out.println(result7);
        
        String result8 = number + price + " Text";
        System.out.println(result8);
        
        Object obj = new Object();
        String result9 = "Object: " + obj;
        System.out.println(result9);
        
        String nullString = null;
        String result10 = "Null value: " + nullString;
        System.out.println(result10);
    }
}
