public class OperatorsExample {
    public static void main(String[] args) {
        // базовые типы
        int a = 10;
        int b = 3;
        double x = 5.5;
        double y = 2.0;
        boolean bool1 = true;
        boolean bool2 = false;
        
        // операторы с базовыми типами
        System.out.println("операторы с базовыми типами");
        
        // арифметические операторы
        int sum = a + b;           // 13
        int diff = a - b;          // 7
        int mult = a * b;          // 30
        int div = a / b;           // 3
        int mod = a % b;           // 1
        double divDouble = x / y;  // 2.75
        
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + mult);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);
        System.out.println("x / y = " + divDouble);
        
        // операторы сравнения
        boolean isEqual = a == b;      // false
        boolean notEqual = a != b;     // true
        boolean greater = a > b;       // true
        boolean less = a < b;          // false
        boolean greaterEqual = a >= b; // true
        boolean lessEqual = a <= b;    // false
        
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + notEqual);
        System.out.println("a > b: " + greater);
        System.out.println("a < b: " + less);
        
        // логические операторы
        boolean andResult = bool1 && bool2;    // false
        boolean orResult = bool1 || bool2;     // true
        boolean xorResult = bool1 ^ bool2;     // true
        boolean notResult = !bool1;            // false
        
        System.out.println("true && false: " + andResult);
        System.out.println("true || false: " + orResult);
        System.out.println("true ^ false: " + xorResult);
        System.out.println("!true: " + notResult);
        
        // побитовые операторы
        int bitAnd = a & b;    // 2
        int bitOr = a | b;     // 11
        int bitXor = a ^ b;    // 9
        int bitNot = ~a;       // -11
        int leftShift = a << 1; // 20
        int rightShift = a >> 1; // 5
        
        System.out.println("a & b: " + bitAnd);
        System.out.println("a | b: " + bitOr);
        System.out.println("a ^ b: " + bitXor);
        System.out.println("~a: " + bitNot);
        System.out.println("a << 1: " + leftShift);
        System.out.println("a >> 1: " + rightShift);
        
        // операторы инкремента и декремента
        System.out.println("\n инкремент и декремент ");
        int preIncrement = ++a;    // a становится 11, preIncrement = 11
        int postIncrement = b++;   // postIncrement = 3, b становится 4
        int preDecrement = --a;    // a становится 10, preDecrement = 10
        int postDecrement = b--;   // postDecrement = 4, b становится 3
        
        System.out.println("префиксный инкремент: " + preIncrement);
        System.out.println("постфиксный инкремент: " + postIncrement);
        System.out.println("префиксный декремент: " + preDecrement);
        System.out.println("постфиксный декремент: " + postDecrement);
        System.out.println("после операций a = " + a + ", b = " + b);
        
        // составные операторы присваивания
        System.out.println("\n составные операторы присваивания ");
        a += 5;     // a = 15
        a -= 3;     // a = 12
        a *= 2;     // a = 24
        a /= 4;     // a = 6
        a %= 4;     // a = 2
        
        System.out.println("после составных операторов a = " + a);
        
        // операторы со строками
        System.out.println("\n операторы со строками ");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        
        // конкатенация строк
        String concat1 = str1 + " " + str2;         // "Hello World"
        String concat2 = str1 + 123;                // "Hello123"
        String concat3 = str1 + true;               // "Hellotrue"
        
        System.out.println("конкатенация: " + concat1);
        System.out.println("строка + число: " + concat2);
        System.out.println("строка + boolean: " + concat3);
        
        // составная конкатенация
        str1 += " Java";    // str1 = "Hello Java"
        System.out.println("составная конкатенация: " + str1);
        
        // сравнение строк
        boolean strEqual = str1 == str3;        // false (сравнение ссылок)
        boolean strNotEqual = str1 != str3;     // true
        boolean contentEqual = str1.equals(str3); // false (сравнение содержимого)
        
        System.out.println("str1 == str3: " + strEqual);
        System.out.println("str1 != str3: " + strNotEqual);
        System.out.println("str1.equals(str3): " + contentEqual);
        
        // тернарный оператор
        System.out.println("\n тернарный оператор ");
        int max = (a > b) ? a : b;      // max = 2
        String message = (a % 2 == 0) ? "четное" : "нечетное"; // "четное"
        
        System.out.println("максимум: " + max);
        System.out.println("число " + a + " - " + message);
        
        // приоритет операторов
        System.out.println("\n приоритет операторов");
        int result1 = a + b * 2;        // 2 + 3 * 2 = 8
        int result2 = (a + b) * 2;      // (2 + 3) * 2 = 10
        boolean complexBool = a > 0 && b < 5 || a == b; // true && true || false = true
        
        System.out.println("a + b * 2 = " + result1);
        System.out.println("(a + b) * 2 = " + result2);
        System.out.println("a > 0 && b < 5 || a == b = " + complexBool);
    }
}