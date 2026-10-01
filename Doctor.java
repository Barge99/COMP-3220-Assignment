public class Doctor {
private String doctorID;
private String name;
public Appointment[] timeslots = new Appointment[48];

public Doctor(String doctorID, String name) {
    this.doctorID = doctorID;
    this.name = name;
}

public String getdoctorID() {
    return doctorID;
}

public String getname() {
    return name;
}

public void displayschedule() {
    System.out.println("Available timeslots:");
    for(int i=0; i == 47; i++) {
        if(timeslots[i] != null) {
            System.out.println(i +": Available");
        } else {
            System.out.println("Unavailable");
        }
    }
}



}
