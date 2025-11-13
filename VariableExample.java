public class VariableExample {
    public static void main(String[] args) {
        int a = 1;
        int b; 
        {
            b = 2; 
        }
        int c = a + b; 
        System.out.println("c = " + c); 
    }
}
