//Class Patient: private fields name, age, and method getTreatmentPlan()
//Subclasses:
//InPatient: add roomNumber, override getTreatmentPlan() with full plan
//OutPatient: add appointmentDate, override getTreatmentPlan() accordingly
//Use encapsulation for all fields
//File: HospitalRecords.java.

class Patient{
    private String name;
    private int age;
    
    public Patient(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTreatmentPlan(){
        return "General treatment plan";
    }
}
class InPatient extends Patient{
    private int roomNumber;
    public InPatient(String name, int age, int roomNumber){
        super(name, age);
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber(){
        return roomNumber;
    }

    @Override
    public String getTreatmentPlan(){

        return " InPatient Plan: " + roomNumber + " relugar monitoring .";
    }
}
class OutPatient extends Patient{
    private String appointmentDate;
    public OutPatient(String name, int age, String appointmentDate){
        super(name, age);
        this.appointmentDate = appointmentDate;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    @Override
    public String getTreatmentPlan(){
        return " OutPatient Plan: " + appointmentDate + " for checkup .";
    }
    
}


public class HospitalRecords {
    public static void main(String[] args) {
        Patient p1 = new InPatient("sita", 34, 24);
        Patient p2 = new OutPatient("Rikesh", 30, "july 08, 2025");

        System.out.println("Patient Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println(p1.getTreatmentPlan());
        System.out.println();

        System.out.println("patient Name : "+p2.getName());
        System.out.println("Age: "+p2.getAge());
        System.out.println(p2.getTreatmentPlan());
    }
}