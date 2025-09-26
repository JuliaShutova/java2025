abstract class VirusStamp {
    // базовый класс
    protected String name;
    protected double infectiousness;

    public VirusStamp(String name, double infectiousness) {
        this.name = name;
        this.infectiousness = infectiousness;
    }

    public abstract void mutate();

    public double getInfectiousness() {
        return infectiousness;
    }

    public String getDescription() {
        return "Virus: " + name + ", Infectiousness: " + infectiousness;
    }
}


class InfluenzaVirusStamp extends VirusStamp {
    // наследуемый класс, ребёнок 1
    public InfluenzaVirusStamp() {
        super("Influenza", 0.7);
    }

    @Override
    public void mutate() {
        infectiousness *= 1.1; // Грипп мутирует, увеличивая заразность на 10%
        System.out.println(name + " has mutated! New infectiousness: " + infectiousness);
    }
}


class CovidVirusStamp extends VirusStamp {
    // ребёнок 2
    public CovidVirusStamp() {
        super("COVID-19", 0.9);
    }

    @Override
    public void mutate() {
        infectiousness *= 1.2; // COVID мутирует более агрессивно
        System.out.println(name + " has mutated into a new variant! New infectiousness: " + infectiousness);
    }
}


public class VirusSimulation {
    public static void main(String[] args) {
        // создаем массив штампов вирусов (базового типа)
        VirusStamp[] virusStamps = {
            new InfluenzaVirusStamp(),
            new CovidVirusStamp()
        };

        // симулируем мутацию для каждого вируса
        
        for (VirusStamp virus : virusStamps) {
            System.out.println("Before mutation: " + virus.getDescription());
            virus.mutate(); 
            System.out.println("-------------------");
        }
    }
}