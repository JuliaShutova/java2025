interface Vehicle {
    String getType();
    
    // вложенный класс в интерфейсе
    static class Car implements Vehicle {
        private String model;
        
        public Car(String model) {
            this.model = model;
        }
        
        @Override
        public String getType() {
            return "Автомобиль: " + model;
        }
        
        public void startEngine() {
            System.out.println("Двигатель запущен");
        }
    }
}

public class MyCar {
    public static void main(String[] args) {
        // создание объекта вложенного класса
        Vehicle.Car myCar = new Vehicle.Car("Toyota");
        
        System.out.println(myCar.getType());
        myCar.startEngine();
        
        // работа через интерфейс
        Vehicle vehicle = new Vehicle.Car("Honda");
        System.out.println(vehicle.getType());
    }
}