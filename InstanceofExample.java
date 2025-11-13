class Virus {
}

class InfluenzaVirus extends Virus {
}

class CovidVirus extends Virus {
}

class Bacterium {
}

public class InstanceofExample {
    public static void main(String[] args) {
        // создаем объекты разных типов вирусов
        Virus virus = new Virus();
        InfluenzaVirus influenza = new InfluenzaVirus();
        CovidVirus covid = new CovidVirus();
        Bacterium bacterium = new Bacterium();
        Virus polymorphicVirus = new CovidVirus(); // полиморфизм
        
        // проверка instanceof с разными типами вирусов
        System.out.println("=== проверка instanceof для вирусов ===");
        
        // базовые случаи
        System.out.println("virus instanceof Virus: " + (virus instanceof Virus)); // true
        System.out.println("influenza instanceof InfluenzaVirus: " + (influenza instanceof InfluenzaVirus)); // true
        System.out.println("influenza instanceof Virus: " + (influenza instanceof Virus)); // true
        System.out.println("covid instanceof Virus: " + (covid instanceof Virus)); // true
        System.out.println("bacterium instanceof Object: " + (bacterium instanceof Object)); // true
        
        // полиморфные случаи
        System.out.println("polymorphicVirus instanceof Virus: " + (polymorphicVirus instanceof Virus)); // true
        System.out.println("polymorphicVirus instanceof CovidVirus: " + (polymorphicVirus instanceof CovidVirus)); // true
        System.out.println("polymorphicVirus instanceof InfluenzaVirus: " + (polymorphicVirus instanceof InfluenzaVirus)); // false
        
        // проверка с null
        System.out.println("\n=== проверка с null ===");
        Virus nullVirus = null;
        CovidVirus nullCovid = null;
        
        System.out.println("nullVirus instanceof Virus: " + (nullVirus instanceof Virus)); // false
        System.out.println("nullCovid instanceof CovidVirus: " + (nullCovid instanceof CovidVirus)); // false
        
        // практическое использование в методах
        System.out.println("\n=== практическое использование ===");
        analyzePathogen(virus);
        analyzePathogen(influenza);
        analyzePathogen(covid);
        analyzePathogen(bacterium);
        analyzePathogen(null);
        
        // проверка с массивами вирусов
        System.out.println("\n=== проверка с массивами ===");
        Virus[] viruses = {new Virus(), new InfluenzaVirus()};
        CovidVirus[] covidArray = {new CovidVirus(), new CovidVirus()};
        
        System.out.println("viruses instanceof Virus[]: " + (viruses instanceof Virus[])); // true
        System.out.println("covidArray instanceof CovidVirus[]: " + (covidArray instanceof CovidVirus[])); // true
        System.out.println("covidArray instanceof Virus[]: " + (covidArray instanceof Virus[])); // true
        System.out.println("viruses instanceof Object: " + (viruses instanceof Object)); // true
        
        // проверка с Object
        System.out.println("\n=== проверка с Object ===");
        System.out.println("virus instanceof Object: " + (virus instanceof Object)); // true
        System.out.println("influenza instanceof Object: " + (influenza instanceof Object)); // true
        System.out.println("bacterium instanceof Object: " + (bacterium instanceof Object)); // true
    }
    
    // метод демонстрирующий практическое использование instanceof для анализа патогенов
    public static void analyzePathogen(Object pathogen) {
        if (pathogen == null) {
            System.out.println("обнаружен null объект");
            return;
        }
        
        if (pathogen instanceof CovidVirus) {
            System.out.println("обнаружен COVID-19 вирус, применяем специфичное лечение");
        } else if (pathogen instanceof InfluenzaVirus) {
            System.out.println("обнаружен вирус гриппа, назначаем противогриппозные препараты");
        } else if (pathogen instanceof Virus) {
            System.out.println("обнаружен неизвестный вирус, применяем общую противовирусную терапию");
        } else {
            System.out.println("это не вирус, возможно бактерия или другой патоген");
        }
    }
}