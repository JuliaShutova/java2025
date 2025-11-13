import java.io.IOException;

public class GreetingProgram {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        
        try {
            StringBuilder nameBuilder = new StringBuilder();
            int character;
            
            while ((character = System.in.read()) != '\n' && character != -1) {
                nameBuilder.append((char) character);
            }
            
            String name = nameBuilder.toString().trim();
            
            System.out.println("Привет, " + name);
            
        } catch (IOException e) {
            System.out.println("Ошибка при чтении ввода: " + e.getMessage());
        }
    }
}