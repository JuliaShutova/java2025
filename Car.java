public class Car {
    private String brand = "Toyota";
    protected int year = 2020;
    public String color = "red";
    
    public class Engine {
        public void displayCarInfo() {
            System.out.println("Марка: " + brand); // доступ к private
            System.out.println("Год: " + year);    // доступ к protected  
            System.out.println("Цвет: " + color);  // доступ к public
        }
        
        public void changeBrand(String newBrand) {
            brand = newBrand; // может изменять private поле
        }
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.displayCarInfo();
        engine.changeBrand("Honda");
        engine.displayCarInfo();
    }
}