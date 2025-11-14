class Protein {
    public String getStructure() {
        return "Первичная структура";
    }
    
    public void synthesize() {
        System.out.println("Синтез белка");
    }
}

class Enzyme extends Protein {
    @Override
    public String getStructur() {  // Опечатка в названии метода
        return "Третичная структура";
    }
    
    @Override
    public void synthesize() {
        System.out.println("Синтез фермента");
    }
}