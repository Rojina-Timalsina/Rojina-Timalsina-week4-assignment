class Student{
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollNumber;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void setmarks(int[] marks){
        this.marks = marks;
    }

    public double calculateAverage(){
        int sum = 0;
        for (int mark : marks){
            sum+=mark;
        }
        return sum/marks.length;
    }
}

class GraduateStudent extends Student{
    private String thesisTopic;
    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic){
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public void thesisTopic(){
        System.out.println("Thesis topic: "+thesisTopic);
    }
    public String getThesistopic(){
        return thesisTopic;
    }

    public void setThesistopic(String thesisTopic){
        this.thesisTopic = thesisTopic;
    }

}
public class GradeBook {
    public static void main(String[] args) {
        int[] marks1 = {80,95,75};
        Student student =new Student("Rojina Timalsina", 45, marks1);
        System.out.println("Student: "+student.getName());
        System.out.println("Average marks: "+student.calculateAverage()); 

        int[] marks2 = {90,98,72};
        GraduateStudent graStudent = new GraduateStudent("Sadhana Adhikari", 18, marks2, "Global Health Issue");
        System.out.println("Graduate Student: " + graStudent.getName());
        System.out.println("Average marks: " + graStudent.calculateAverage());
    }
}
