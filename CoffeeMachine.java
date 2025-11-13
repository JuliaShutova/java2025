public class CoffeeMachine {
    
    public enum CoffeeType {
        ESPRESSO(50, 0, "крепкий эспрессо"),
        AMERICANO(50, 150, "американо с водой"),
        CAPPUCCINO(50, 100, "капучино с молоком"),
        LATTE(50, 150, "латте с молочной пенкой");
        
        private final int coffeeMl;
        private final int waterMl;
        private final String description;
        
        CoffeeType(int coffeeMl, int waterMl, String description) {
            this.coffeeMl = coffeeMl;
            this.waterMl = waterMl;
            this.description = description;
        }
        
        // дополнительный метод для расчета времени приготовления
        public int getBrewingTime() {
            int baseTime = 30; // базовое время
            int additionalTime = (coffeeMl + waterMl) / 10; // +1 сек за каждые 10 мл
            return baseTime + additionalTime;
        }
        
        public void prepare() {
            System.out.println("готовим " + description);
            System.out.println("время приготовления: " + getBrewingTime() + " сек");
            System.out.println("кофе: " + coffeeMl + " мл, вода: " + waterMl + " мл");
        }
    }
    
    public static void main(String[] args) {
        CoffeeType myCoffee = CoffeeType.LATTE;
        myCoffee.prepare();
        
        System.out.println("\nвсе виды кофе:");
        for (CoffeeType coffee : CoffeeType.values()) {
            System.out.println(coffee.name() + " - " + coffee.getBrewingTime() + " сек");
        }
    }
}
