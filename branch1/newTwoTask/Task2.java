package newTwoTask;

public class Task2 {

    public static void main(String[] args) {

        Doctor xirurg = new Doctor("Гектор", 22, "Здоров", "хирург", 1);
        Doctor lor = new Doctor("Мотя", 22, "Здоров", "лор", 1);

        Patient patient = new Patient("Джек", 21, " болен ", 2);
        Patient patient1 = new Patient("Иван", 21, " болен ", 3);
        Patient patient2 = new Patient("Петя", 34, " болен ", 4);
        Patient patient3 = new Patient("Зина", 75, " больна ", 5);
        Patient patient4 = new Patient("Глаша", 12, " больна ", 6);
        Patient patient5 = new Patient("Изольда", 112, " больна ", 7);
        Patient patient6 = new Patient("Гриша", 54, " болен ", 8);

        Registry registry = new Registry();

        registry.addPatientToDoctor(xirurg, patient);
        registry.addPatientToDoctor(xirurg, patient1);
        registry.addPatientToDoctor(xirurg, patient2);

        registry.addPatientToDoctor(lor, patient3);
        registry.addPatientToDoctor(lor, patient4);
        registry.addPatientToDoctor(lor, patient5);
        registry.addPatientToDoctor(lor, patient6);

        registry.showPatientofDoctor(lor);
        registry.showPatientofDoctor(xirurg);

    }
}
