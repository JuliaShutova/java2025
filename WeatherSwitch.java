public class WeatherSwitch {
    public static void main(String[] args) {
        System.out.println("=== Weather switch examples ===");
        
        // температура (int)
        int temperature = 25;
        System.out.print("Temperature " + temperature + "°C: ");
        switch(temperature) {
            case -10: case -5: case 0: 
                System.out.println("very cold"); break;
            case 5: case 10: case 15: 
                System.out.println("cool"); break;
            case 20: case 25: 
                System.out.println("warm"); break;
            case 30: case 35: 
                System.out.println("hot"); break;
            default: 
                System.out.println("unknown temperature");
        }
        
        // тип осадков (String)
        String precipitation = "rain";
        System.out.print("Precipitation: " + precipitation + " - ");
        switch(precipitation) {
            case "rain": 
                System.out.println("take an umbrella"); break;
            case "snow": 
                System.out.println("wear warm shoes"); break;
            case "hail": 
                System.out.println("better stay home"); break;
            case "fog": 
                System.out.println("be careful on the road"); break;
            default: 
                System.out.println("no precipitation");
        }
        
        // сила ветра (char)
        char windPower = 'C';
        System.out.print("Wind power " + windPower + ": ");
        switch(windPower) {
            case 'A': 
                System.out.println("calm"); break;
            case 'B': 
                System.out.println("light breeze"); break;
            case 'C': 
                System.out.println("moderate wind"); break;
            case 'D': 
                System.out.println("strong wind"); break;
            case 'E': 
                System.out.println("storm"); break;
            default: 
                System.out.println("unknown wind power");
        }
        
        // времена года (Enum)
        enum Season { SPRING, SUMMER, AUTUMN, WINTER }
        Season season = Season.SUMMER;
        System.out.print("Season: " + season + " - ");
        switch(season) {
            case SPRING: 
                System.out.println("flowers bloom"); break;
            case SUMMER: 
                System.out.println("you can swim"); break;
            case AUTUMN: 
                System.out.println("leaves fall"); break;
            case WINTER: 
                System.out.println("snow falls"); break;
        }
        
        // уровень ультрафиолета (Integer)
        Integer uvIndex = 3;
        System.out.print("UV index " + uvIndex + ": ");
        switch(uvIndex) {
            case 1: case 2: 
                System.out.println("low risk"); break;
            case 3: case 4: case 5: 
                System.out.println("moderate risk"); break;
            case 6: case 7: 
                System.out.println("high risk"); break;
            case 8: case 9: case 10: 
                System.out.println("very high risk"); break;
            default: 
                System.out.println("extreme risk");
        }
    }
}
