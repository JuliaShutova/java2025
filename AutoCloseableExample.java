public class AutoCloseableExample {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Работа с ресурсом");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Ресурс закрыт автоматически");
    }
}