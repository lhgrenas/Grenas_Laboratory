public class Person {
    
    private String name;
    private int id;

    //Constructor
    public Person (String name, int id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + id);
    }
}

class Student extends Person {

    private String gradeLevel;

    public Student (String name, int id, String gradeLevel){
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}

class Teacher extends Person {
    
    private String subject;

    public Teacher (String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Staff extends Person {

    private String department;
    
    public Staff (String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class SchoolTest {
    
    public static void main(String[] args) {

        Student student = new Student("Grenas, Lovie", 1085865, "Freshmen");
        student.displayInfo();

        Teacher teacher = new Teacher("Sir Archie" , 01, "OOP");
        teacher.displayInfo();

        Staff staff = new Staff("ABC", 10, "BSIT");
        staff.displayInfo();
    }
}