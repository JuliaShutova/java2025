import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write(72);
            output.write(101);
            output.write(108);
            output.write(108);
            output.write(111);
            
            byte[] result = output.toByteArray();
            System.out.print("Записанные байты: ");
            for (byte b : result) {
                System.out.print(b + " ");
            }
            
            System.out.println("\nТекст: " + output.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}