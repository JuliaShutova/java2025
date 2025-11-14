class Protein {
    protected String structure = "Первичная структура";
    
    public Protein(String name) {
        System.out.println("Синтезирован белок: " + name);
    }
    
    public void fold() {
        System.out.println("Белок сворачивается в 3D-структуру");
    }
}

class Enzyme extends Protein {
    private String structure = "Третичная структура";
    
    public Enzyme(String name) {
        super(name);
        System.out.println("Создан фермент с активным центром");
    }
    
    public void showStructures() {
        System.out.println("Структура фермента: " + this.structure);
        System.out.println("Базовая структура белка: " + super.structure);
    }
    
    @Override
    public void fold() {
        System.out.println("Фермент формирует активный центр");
        super.fold();
    }
}

public class BiologyLab {
    public static void main(String[] args) {
        Enzyme amylase = new Enzyme("Амилаза");
        amylase.showStructures();
        amylase.fold();
    }
}