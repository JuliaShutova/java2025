public class University {
    private String name = "МГУ";
    
    // публичный внутренний класс - доступен извне
    public class Student {
        public void displayUniversity() {
            System.out.println("Университет: " + name); // имеет доступ к приватным полям внешнего класса
        }
    }
    
    // внутренний класс с доступом в пределах пакета
    class Professor {
        void teach() {
            System.out.println("Профессор преподает в " + name);
        }
    }
    
    // приватный внутренний класс - доступен только внутри University
    private class Department {
        private String departmentName;
        
        public Department(String name) {
            this.departmentName = name;
        }
        
        void displayInfo() {
            System.out.println("Кафедра " + departmentName + " в " + name);
        }
    }
    
    // метод для демонстрации работы с приватным классом
    public void createDepartment() {
        Department mathDept = new Department("Математика");
        mathDept.displayInfo();
    }
    
    public static void main(String[] args) {
        University university = new University();
        
        // создание объектов внутренних классов
        University.Student student = university.new Student();
        University.Professor professor = university.new Professor();
        
        student.displayUniversity();
        professor.teach();
        university.createDepartment(); // использует приватный класс
    }
}

// другой класс в том же пакете
class ExternalClass {
    public void testAccess() {
        University uni = new University();
        
        University.Student student = uni.new Student(); // доступно - public
        University.Professor professor = uni.new Professor(); // доступно - package private
        
        // University.Department department = uni.new Department(); // ошибка - private класс
    }
}