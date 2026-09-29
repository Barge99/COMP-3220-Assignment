public class Doctor {
private String doctorID;
private String name;
private String specialty;

public Doctor(String doctorID, String name, String specialty) {
    this.doctorID = doctorID;
    this.name = name;
    this.specialty = specialty;
}

public String getdoctorID() {
    return doctorID;
}

public String getname() {
    return name;
}

public String getspecialty() {
    return specialty;
}

}
