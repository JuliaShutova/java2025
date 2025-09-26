abstract class VirusStamp {
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
    public InfluenzaVirusStamp() {
        super("Influenza", 0.7);
    }

    @Override
    public void mutate() {
        infectiousness *= 1.1;
    }
}

class CovidVirusStamp extends VirusStamp {
    public CovidVirusStamp() {
        super("COVID-19", 0.9);
    }

    @Override
    public void mutate() {
        infectiousness *= 1.2;
    }
}