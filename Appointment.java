public class Appointment {
private String doctorID;
private String appointmentID;
public String healthcardNum;
private String time;

public Appointment(String doctorID, String appointmentID, String healthcardNum, String time) {
    this.doctorID = doctorID;
    this.appointmentID = appointmentID;
    this.healthcardNum = healthcardNum;
    this.time = time;
}

public String getdoctorID() {
    return doctorID;
}

public String getappointmentID() {
    return appointmentID;
}

public String gethealthcardNum() {
    return healthcardNum;
}

public String gettime() {
    return time;
}
}
