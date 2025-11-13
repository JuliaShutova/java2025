import java.util.Scanner;

class Main {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите Ваше имя: ");
    String user = scanner.nextLine();
    System.out.println("Привет, " + user);
    scanner.close();
}
