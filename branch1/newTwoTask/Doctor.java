package newTwoTask;

public class Doctor extends Men {

    public String position;
    public Patient[] patientList = new Patient[3];

    public Doctor(String name, int age, String healthStatus, String position, int id) {
        super(name, age, healthStatus, id);
        this.position = position;
        System.out.println("Я человек: " + name + " " + age + " года " + healthStatus + " Я доктор, моя позиция " + position);
    }

    

    public Patient[] getPatient() {
        return patientList;
    }
}
