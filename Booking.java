public class Booking {
private int check = 0;

private Doctor[] doctors = new Doctor[3];

public void makeDocs() {
    Doctor doc1 = new Doctor("100A", "James John");
    doctors[0] = doc1;
    Doctor doc2 = new Doctor("100B", "John Jimmy");
    doctors[1] = doc2;
    Doctor doc3 = new Doctor("100C", "Jimmy Jeff");
    doctors[2] = doc3;
}

public void WelcomeMSG() {
    System.out.println("Welcome! Please choose from the following options/n1: Book a new appointment/n2: Check my appointments");
}

public void appointmentnew(Doctor doc, Patient pat, String appid, String time) {
    Appointment appointment = new Appointment(doc.getdoctorID(), appid, pat.getId(), time);
}

public void patientnew(String id, String name, String number) {
    Patient patient = new Patient(id, name, number);
}

public void chooseDoc() {
    System.out.println("Available doctors:/n1:" + doctors[0].getname() + "/n2:" + doctors[1].getname() + "/n3:" + doctors[2].getname() );
}

public void booktime(int timeindex, Appointment name, Doctor doc) {
    while(check == 0) {
    if(doc.timeslots[timeindex] == null) {
        doc.timeslots[timeindex] = name;
        check++;
    } else {
        System.out.println("That time is unavailable./nPlease select another time./n");
    }
}
}

public void checkapps(Doctor doc,Patient pat) {
    System.out.println("Current Appointments:\n");

    for(int i=0;i == 47;i++) {

        if(doc.timeslots[i] == null) {
            continue;
        }

        Appointment app = doc.timeslots[i];

        if(app.gethealthcardNum() == pat.getId()) {
            System.out.println(app.getappointmentID() + "/n" + app.getdoctorID() + "/n" + app.gettime() + "/n------------------------\n");
        }
        }
    }
}
