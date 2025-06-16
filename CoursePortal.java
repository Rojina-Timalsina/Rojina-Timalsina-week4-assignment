//Class Course: fields title, duration, instructor, method getCourseInfo()
//Subclasses:
//LiveCourse: add scheduleTime
//RecordedCourse: add videoCount
//use encapsulation and method overriding
//File: CoursePortal.java.



class Course{
    public String title;
    public String duration;
    public String instructor;

    public Course(String title, String duration, String instructor){
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getCourseInfo(){
         return "Title: "+this.title+ "Duration: "+this.duration+ "Instructor: "+this.instructor;     
    }

       
    }

class LiveCourse extends Course{
    public String scheduleTime;
    public LiveCourse(String title, String duration, String instructor, String scheduleTime){
        super(title, duration, instructor);
        this.scheduleTime =scheduleTime;
    }
    @Override
    public String getCourseInfo(){
        return super.getCourseInfo() + "Schedule Time: " +scheduleTime;     
    }
}
class RecordedCourse extends Course{
    public int videocount;
    public RecordedCourse(String title, String duration, String instructor, int videocount){
        super(title, duration, instructor);
        this.videocount =videocount;
    }
    @Override
    public String getCourseInfo(){
        return super.getCourseInfo() + "Video count: " +videocount;     
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        Course c1 = new LiveCourse("Math", "8 hours", "Mrs. Timalsina", "8am");
        Course c2 = new RecordedCourse("C programming", "4 hours", "Mr.Timalsina", 60);

        System.out.println(c1.getCourseInfo());
        System.out.println(c2.getCourseInfo());
    }
}