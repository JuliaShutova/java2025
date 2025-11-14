class Protein {
    public String getStructure() {
        return "Первичная структура";
    }
    
    public void fold() {
        System.out.println("Белок сворачивается");
    }
}

class Enzyme extends Protein {
    @Override
    public String getStructure() {
        return "Третичная структура с активным центром";
    }
    
    @Override
    public void fold() {
        System.out.println("Фермент формирует специфическую 3D-структуру");
    }
}

public class Lab {
    public static void main(String[] args) {
        Protein protein = new Enzyme();
        System.out.println(protein.getStructure());
        protein.fold();
    }
}