public class School {
    private String schoolName = "Школа №1";
    
    public class Classroom {
        private String className = "10А";
        public int studentCount = 25;
        protected String teacher = "Иванов";
        
        private void privateMethod() {
            System.out.println("Приватный метод класса");
        }
        
        public void publicMethod() {
            System.out.println("Публичный метод класса");
        }
    }
    
    public void testAccess() {
        Classroom room = new Classroom();
        
        System.out.println(room.studentCount); // доступ к public
        System.out.println(room.teacher);      // доступ к protected
        // System.out.println(room.className); // ошибка - private поле
        room.publicMethod();                   // доступ к public методу
        // room.privateMethod();               // ошибка - private метод
    }
    
    public static void main(String[] args) {
        School school = new School();
        school.testAccess();
    }
}