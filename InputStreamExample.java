import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69};
        
        try (ByteArrayInputStream input = new ByteArrayInputStream(data)) {
            int byteData;
            System.out.print("Прочитанные байты: ");
            
            while ((byteData = input.read()) != -1) {
                System.out.print(byteData + " ");
            }
            
            System.out.println();
            
            ByteArrayInputStream input2 = new ByteArrayInputStream(data);
            byte[] buffer = new byte[3];
            int bytesRead = input2.read(buffer);
            System.out.print("Первые " + bytesRead + " байта: ");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(buffer[i] + " ");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}