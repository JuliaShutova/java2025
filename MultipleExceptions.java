class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class SpecificException extends CustomException {
    public SpecificException(String message) {
        super(message);
    }
}

class MoreSpecificException extends SpecificException {
    public MoreSpecificException(String message) {
        super(message);
    }
}

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int choice = 2;
            if (choice == 1) {
                throw new NullPointerException("Что-то null");
            } else if (choice == 2) {
                throw new ArrayIndexOutOfBoundsException("Неверный индекс");
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        try {
            throw new MoreSpecificException("Самое конкретное исключение");
        } catch (MoreSpecificException e) {
            System.out.println("Поймали MoreSpecific: " + e.getMessage());
        } catch (SpecificException e) {
            System.out.println("Поймали Specific: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Поймали Custom: " + e.getMessage());
        }
    }
}