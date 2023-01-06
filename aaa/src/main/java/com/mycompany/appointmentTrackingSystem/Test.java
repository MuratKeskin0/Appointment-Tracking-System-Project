/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.appointmentTrackingSystem;

//import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class Test {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        // creating patients;
        Patient patient1 = new Patient();
        patient1.setFirstName("Ahmet");
        patient1.setLastName("Uçar");
        patient1.setId("p1");
        patient1.setDob("10/12/2000");
        patient1.setGender("Male");
        patient1.setPhone("05351111111");
        patient1.setEmail("Ahmet123@gmail.com");

        Patient patient2 = new Patient();
        patient2.setFirstName("Mehmet");
        patient2.setLastName("Kapıcı");
        patient2.setId("p2");
        patient2.setDob("11/02/1980");
        patient2.setGender("Male");
        patient2.setPhone("05352222222");
        patient2.setEmail("Mehmet123@gmail.com");

        Patient patient3 = new Patient();
        patient3.setFirstName("Emma");
        patient3.setLastName("Lewis");
        patient3.setId("p3");
        patient3.setDob("15/04/1996");
        patient3.setGender("Female");
        patient3.setPhone("05353333333");
        patient3.setEmail("Emma123@gmail.com");

        // Creating Doctors;
        Doctor doctor1 = new Specialist();
        Specialist doctor1s = (Specialist) doctor1;
        doctor1s.setFirstName("Emmanuel");
        doctor1s.setLastName("Emenike");
        doctor1s.setId("d1");
        doctor1s.setPhone("05321111111");
        doctor1s.setEmail("Emmanuel321");
        doctor1s.setTitle("Assistant Professor Doctor");

        Doctor doctor2 = new Specialist();
        Specialist doctor2s = (Specialist) doctor2;
        doctor2s.setFirstName("Ali");
        doctor2s.setLastName("Koc");
        doctor2s.setId("d2");
        doctor2s.setPhone("05322222222");
        doctor2s.setEmail("Ali321");
        doctor2s.setTitle("Associate Professor");

        Doctor doctor3 = new GeneralPractitioner();
        GeneralPractitioner doctor3gp = (GeneralPractitioner) doctor3;
        doctor3gp.setFirstName("Leonel");
        doctor3gp.setLastName("Messi");
        doctor3gp.setId("d3");
        doctor3gp.setPhone("05323333333");
        doctor3gp.setEmail("Leo321");
        doctor3gp.setTitle("Professor");
        
        Doctor doctor4= new Doctor();
        

        // creating appointments and tracking system;
        AppointmentTracker apt1 = new AppointmentTracker();

        Appointment ap1 = new Appointment();
        ap1.Appointment("12/01/2023", "15.30", "eye", doctor1s, patient1);
        apt1.addAppointment(ap1);
        // Don't add same apt. again;
        Appointment ap2 = new Appointment();
        ap2.Appointment("12/01/2023", "15.30", "eye", doctor1s, patient1);
        //apt1.addAppointment(ap2);

        Appointment ap3 = new Appointment();
        ap3.Appointment("11/01/2023", "15.30", "eye", doctor1s, patient1);
        apt1.addAppointment(ap3);

        Appointment ap4 = new Appointment();
        ap4.Appointment("02/01/2023", "15.30", "head", doctor2s, patient3);
        apt1.addAppointment(ap4);

        Appointment ap5 = new Appointment();
        ap5.Appointment("11/01/2023", "16.30", "ear", doctor3gp, patient2);
        apt1.addAppointment(ap5);
        
        //There are methods from appointment tracker class. You can delete slashes to work which method you want.
        
        //apt1.ListAllPatients();
        //apt1.ListAllDoctors();
        //apt1.getAppointmentsForDateandTime("12/01/2023", "15.30");
        //apt1.getAppointmentsByPatienceId("p1");
        //apt1.IsDoctorAvaliableAtThisTimeAndDate(doctor1s, "11/01/2023", "15.30");
        //apt1.ListDoctorAppointments(doctor1s);
        //System.out.println(apt1.getPatientsNumber());
        //System.out.println(apt1.getTotalDoctorsNumber());
        //System.out.println(apt1.getGeneralPractitionerDoctorsNumber());
        //System.out.println(apt1.getSpecialistDoctorsNumber());
        //System.out.println(apt1.getAppointmentsNumber());
        //System.out.println(apt1.getAppointmentsNumberByDate("12/01/2023"));
        //apt1.checkAppointmentAtThisDateAndTime("12/01/2023", "15.38");
        //apt1.getAppointmentsForDate("11/01/2023");
        
        
        // Diagnose method which was written with overriding method in Doctor(super class) and its subclasses(GeneralPractitioner and Specialist);
        //doctor3gp.diagnose(scan);
        //doctor2s.diagnose(scan);
        //doctor4.diagnose(scan);
        
        
    }
}
