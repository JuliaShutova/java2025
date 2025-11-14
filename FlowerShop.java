class Flower {
    private String name;
    private double price;
    
    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getDescription() {
        return name + " - " + price + " руб.";
    }
    
    @Deprecated
    public String showFlower() {
        return "Цветок: " + name + ", Цена: " + price + " руб.";
    }
}

class Rose extends Flower {
    private String color;
    
    public Rose(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " Цвет: " + color;
    }
}

public class FlowerShop {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Flower tulip = new Flower("Тюльпан", 50);
        Rose redRose = new Rose("Роза", 100, "красный");
        
        System.out.println(tulip.showFlower());
        System.out.println(redRose.getDescription());
        
        @SuppressWarnings("unused")
        int bouquetPrice = 350;
    }
}