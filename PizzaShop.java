public class PizzaShop {
    
    public enum PizzaSize {
        SMALL(25, 300),
        MEDIUM(30, 450),
        LARGE(35, 600),
        EXTRA_LARGE(40, 800);
        
        private final int diameter;
        private final int price;
        
        PizzaSize(int diameter, int price) {
            this.diameter = diameter;
            this.price = price;
        }
        
        public int getDiameter() {
            return diameter;
        }
        
        public int getPrice() {
            return price;
        }
        
        public String getDescription() {
            return name() + " (" + diameter + " см) - " + price + " руб.";
        }
    }
    
    public enum PizzaType {
        MARGHERITA("томатный соус, моцарелла, базилик", 150),
        PEPPERONI("томатный соус, моцарелла, пепперони", 200),
        HAWAIIAN("томатный соус, моцарелла, ветчина, ананасы", 250),
        FOUR_CHEESES("сливочный соус, моцарелла, пармезан, горгонзола, рикотта", 300);
        
        private final String ingredients;
        private final int basePrice;
        
        PizzaType(String ingredients, int basePrice) {
            this.ingredients = ingredients;
            this.basePrice = basePrice;
        }
        
        public String getIngredients() {
            return ingredients;
        }
        
        public int calculateTotalPrice(PizzaSize size) {
            return basePrice + size.getPrice();
        }
    }
    
    public static void main(String[] args) {
        PizzaSize size = PizzaSize.MEDIUM;
        PizzaType type = PizzaType.PEPPERONI;
        
        System.out.println("Вы выбрали:");
        System.out.println("Размер: " + size.getDescription());
        System.out.println("Тип: " + type.name().toLowerCase());
        System.out.println("Ингредиенты: " + type.getIngredients());
        
        int totalPrice = type.calculateTotalPrice(size);
        System.out.println("Итоговая цена: " + totalPrice + " руб.");
        
        System.out.println("\nВсе доступные размеры:");
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println(pizzaSize.getDescription());
        }
    }
}