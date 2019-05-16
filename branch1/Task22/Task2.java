
package Task2222;

public class Task2 {
public static void main(String [] args){

Doctor doctor = new Doctor("Гектор", 22, "Здоров", "xirurg", 1);
Patient patient = new Patient("Джек", 21, " болен ", 2);
Patient patient1 = new Patient("Иван", 21, " болен ", 3);
Patient patient2 = new Patient("Петя", 34, " болен ", 4);
Patient patient3 = new Patient("Зина", 75, " больна ", 5);
Patient patient4 = new Patient("Глаша", 12, " больна ", 6);
Registry registry = new Registry();
registry.registr(patient);
registry.registr(patient1);
registry.registr(patient2);
registry.registr(patient3);
registry.registr(patient4);
doctor.showPatient();

}
}
