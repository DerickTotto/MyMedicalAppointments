import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: "+ name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("El Id del Doctor es: " + Doctor.id);
    }
    ArrayList<AvaiableAppointment> avaiableAppointment = new ArrayList<>();
    public void AddAvalaiableAppointment(Date date, String time){
        //System.out.println(avaiableAppointment);
        avaiableAppointment.add(new AvaiableAppointment(date, time));
    }

    public ArrayList<AvaiableAppointment> getAvaiableAppointment(){
        return avaiableAppointment;
    }

    public static class AvaiableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvaiableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
