package newTwoTask;

public class Patient extends Men {

    public Patient(String name, int age, String healthStatus, int id) {
        super(name, age, healthStatus, id);

        System.out.println("Я человек: " + name + " " + age + " года " + healthStatus + " Я пациент, мой айди " + id);
    }
}
