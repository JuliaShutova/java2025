public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        // 1. Прямой вызов через класс
        A.printVars();
        
        // 2. Вызов через любой объект класса
        A obj1 = new A();
        obj1.printVars();
        
        // 3. Вызов через другой объект
        A obj2 = new A();
        obj2.printVars();
        
        // 4. Вызов из статического метода того же класса
        printVars();
        
        // 5. Вызов из другого класса
        B.callPrintVars();
    }
}

class B {
    public static void callPrintVars() {
        // Вызов из другого класса
        A.printVars();
        
        // Или через объект
        A aObj = new A();
        aObj.printVars();
    }
}