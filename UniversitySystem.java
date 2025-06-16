//Base class Person: private fields name, id, and method getRoleDetails()
//Subclasses:
//Student: add program
//Teacher: add subject
//Admin: add department
//Override getRoleDetails() to show respective info.
//File: UniversitySystem.java.


class person{
    public String name;
    private int id;

    public person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public void getRoleDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+this.id);
    } 
}

class Student extends person{
    private String program;
    public Student(String name, int id, String program){
        super(name, id);
        this.program = program;
    }
    public String getProgram(){
        return program;
    }
    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Program: " + this.program);
    }
}
class Teacher extends person{
    private String Subjet;
    public Teacher(String name, int id, String Subjet){
        super(name, id);
        this.Subjet = Subjet;
    }
    public String getSubject(){
        return Subjet;
    }
    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Subject: " + this.Subjet);
    }
}
class Admin extends person{
    private String department;
    public Admin(String name, int id, String department){
        super(name, id);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    @Override
    public void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Department: " + this.department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        person p1 = new Admin("Sita Koirala", 106, "Human Resources");
        person p2 = new Student("Samir Neupane", 109, "computer science");
        person p3 = new Teacher("Gita Acharya", 103, "English");

        System.out.println("Admin");
        p1.getRoleDetails();
        System.out.println();
        System.out.println("Student");
        p2.getRoleDetails();
        System.out.println();
        System.out.println("Teacher");
        p3.getRoleDetails();
    }
}
