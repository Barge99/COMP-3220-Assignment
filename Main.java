
import java.util.Scanner;

public class Main{
  
      
    public static void main(String[] args){
      int counter = 0;
  Patient[] Patients = new Patient[50];   // manually setting Patient and Appointment for this demo
  Appointment[] appointments = new Appointment[50];

      Scanner scan = new Scanner(System.in);
    
      Booking Booking = new Booking();
      Booking.makeDocs();


     System.out.println("Welcome to the Prototype Medical Clinic! Please input your Name, Patient ID, and Health Number \n Name:");
     String name = scan.nextLine();
     System.out.println("Patient ID:");
     String ID = scan.nextLine();
     System.out.println("Health Card Number:");
     String healthNumber = scan.nextLine();
      // future: Check if a patient is already registered in a database or not, counter being the number of patients so far
      // in the future it'll probably be better and easier to do alot of this by checking against a storage file.
        
      
      
      Patients[0]= new Patient(ID,name,healthNumber);
      


    while(true){ //runloop
  
       Booking.WelcomeMSG();

     

    
int Choice = scan.nextInt();

if(Choice==1) // Book a new appointment.
  {
   
   System.out.println("Which doctor are you booking an appointment with?");
   Booking.chooseDoc();
   Choice = scan.nextInt();
  Booking.doctors[Choice-1].displayschedule();
  System.out.println("Please enter a time to book");
  int time = scan.nextInt();
  appointments[counter]= new Appointment(Booking.doctors[Choice-1].getdoctorID(), "appid", healthNumber, "Time");
  
Booking.booktime(time,appointments[counter], Booking.doctors[Choice-1]);
counter++;
}
else if(Choice==2) //Check your appointments. (doesn't work)
  {
System.out.println("Which doctor are you checking for an appointment with?");
Booking.chooseDoc();
Choice = scan.nextInt();
Booking.checkapps(Booking.doctors[Choice-1],Patients[0]);
// not tracking which patient we're on, as current main only uses one. defaults to first one.

}
else{
  System.out.println("\nexiting...");
  break;
}
    }

}
}
