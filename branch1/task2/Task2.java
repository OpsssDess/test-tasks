class Men{
private String name;
private int age;
private String healthStatus;

Men(String name, int age, String healthStatus){
this.name = name;
this.age = age;
this.healthStatus = healthStatus;
System.out.println("я человек: "+ name +" "+age+" года "+healthStatus);

}
}

class Patient extends Men{
public int id;

public Patient(String name, int age, String healthStatus, int id) {
super(name, age, healthStatus);
this.id = id;
System.out.println("я человек: "+ name +" "+age+" года "+healthStatus+"я пациент, мой айди "+id );
}
}

class Doctor extends Men{
public String position;

public Doctor(String name, int age, String healthStatus, String position){
super(name,age,healthStatus);
this.position = position;
System.out.println("я человек: "+ name +" "+age+" года "+healthStatus+"я доктор, мо€ позици€ "+position );
}
}

class Registry {
Registry(){
System.out.println("–егитратура записывает пациентов и отправл€ет их доктору!");
}
public String registr(Patient id){
String b = "¬ы зарегистрировались";  
return b;
}
public String showPatient(Doctor position){
String b = "” вас п€ть пациентов!";  
return b;
}
}

public class Task2 {
public static void main(String [] args){
Men men = new Men("¬ан€", 14, "Zdorov");
Doctor doctor = new Doctor("Gector", 22, "zdorov", "xirurg");
Patient patient = new Patient("Jack", 22, "zdorov", 1);
Registry registry = new Registry();
System.out.println("id:" +patient.id +" "+registry.registr(patient));
System.out.println(doctor.position +" "+ registry.showPatient(doctor));
}
}