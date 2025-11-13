class Box<T> {
    private T content;
    
    public Box(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
    
    public void checkContent() {
        if (content instanceof String) {
            System.out.println("В коробке строка: " + content);
        } else if (content instanceof Integer) {
            System.out.println("В коробке число: " + content);
        } else if (content instanceof Double) {
            System.out.println("В коробке дробное число: " + content);
        } else {
            System.out.println("В коробке что-то другое");
        }
    }
}

public class GenericInstanceofExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Привет");
        Box<Integer> intBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);
        Box<Object> objectBox = new Box<>("Объект");
        
        stringBox.checkContent();
        intBox.checkContent();
        doubleBox.checkContent();
        objectBox.checkContent();
        
        System.out.println();
        
        Box<?> unknownBox = stringBox;
        if (unknownBox.getContent() instanceof String) {
            String text = (String) unknownBox.getContent();
            System.out.println("Неизвестная коробка содержит строку: " + text);
        }
        
        Box<?> anotherBox = intBox;
        if (anotherBox.getContent() instanceof Integer number) {
            System.out.println("Коробка содержит число: " + number);
        }
        
        processBox(stringBox);
        processBox(intBox);
    }
    
    public static void processBox(Box<?> box) {
        Object content = box.getContent();
        
        if (content instanceof String str) {
            System.out.println("Обрабатываем строку: " + str.toUpperCase());
        } else if (content instanceof Integer num) {
            System.out.println("Обрабатываем число: " + (num * 2));
        } else {
            System.out.println("Неизвестный тип содержимого");
        }
    }
}