import java.util.*;

class Employee {
    String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public void work() {
        System.out.println(name + " работает");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    
    public void code() {
        System.out.println(name + " пишет код");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
    
    public void manage() {
        System.out.println(name + " управляет проектом");
    }
}

public class WildcardExample {
    
    // <? extends employee> - для чтения из коллекции
    public static void printAllEmployees(List<? extends Employee> employees) {
        for (Employee emp : employees) {
            emp.work();
        }
    }
    
    // <? super developer> - для записи в коллекцию
    public static void addDevelopers(List<? super Developer> team) {
        team.add(new Developer("Анна"));
        team.add(new Developer("Петр"));
    }
    
    public static void main(String[] args) {
        List<Employee> allEmployees = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();
        List<Manager> managers = new ArrayList<>();
        
        developers.add(new Developer("Иван"));
        developers.add(new Developer("Мария"));
        managers.add(new Manager("Ольга"));
        
        System.out.println("все разработчики:");
        printAllEmployees(developers);
        
        System.out.println("все менеджеры:");
        printAllEmployees(managers);
        
        System.out.println("добавляем разработчиков:");
        addDevelopers(allEmployees);
        addDevelopers(developers);
        
        // пример копирования
        List<Developer> devList = Arrays.asList(new Developer("Алексей"), new Developer("Светлана"));
        List<Employee> employeeList = new ArrayList<>();
        
        copyEmployees(devList, employeeList);
        System.out.println("скопировано " + employeeList.size() + " сотрудников");
    }
    
    // pecs в действии
    public static void copyEmployees(List<? extends Employee> source, 
                                   List<? super Employee> destination) {
        for (Employee emp : source) {
            destination.add(emp);
        }
    }
}