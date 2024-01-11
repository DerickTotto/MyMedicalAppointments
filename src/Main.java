//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Derick Carcamo", "Pediatria");
        myDoctor.AddAvalaiableAppointment(new Date(), "4PM");
        myDoctor.AddAvalaiableAppointment(new Date(), "7PM");
        myDoctor.AddAvalaiableAppointment(new Date(), "10AM");

        for (Doctor.AvaiableAppointment aA: myDoctor.getAvaiableAppointment()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        //System.out.println(myDoctor.getAvaiableAppointment());

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Carlos", "carlos@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());

        patient.setPhoneNumber("1234567");
        System.out.println(patient.getPhoneNumber());

    }
}