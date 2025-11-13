import java.util.ArrayList;
import java.util.HashMap;

public class VarExample {
    public static void main(String[] args) {
        var name = "Anna";
        var age = 25;
        var salary = 1500.50;
        var isActive = true;
        
        System.out.println("Name: " + name + ", Type: " + name.getClass().getSimpleName());
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + isActive);
        
        var list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        
        var map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        
        for (var item : list) {
            System.out.println(item);
        }
        
        var result = calculateSum(10, 20);
        System.out.println("Sum: " + result);
    }
    
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
