package newTwoTask;

public class Registry {

    Registry() {
        System.out.println("Регитратура: Мы записываем пациентов!!");
    }

    public void addPatientToDoctor(Doctor doctor, Patient patient) {
        boolean isFull = true;
        for (int i = 0; i < doctor.getPatient().length; i++) {
            if (doctor.getPatient()[i] == null) {
                doctor.getPatient()[i] = patient;
                isFull = false;
                break;
            }

        }
        if (isFull) {
            System.out.println("Регистратура: Приём закончен. " + patient.getName() + " Вы не успели!");
        }

    }

}
