/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appointmentTrackingSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author murat
 */
public class AppointmentTracker {

    ArrayList<Appointment> appointments = new ArrayList();

    void addAppointment(Appointment apt) {

        for (Appointment a : appointments) {
            if (a.getDate() != null && a.getTime() != null && a.getDoctors() != null) {
                if ((!a.getDate().equals(apt.getDate()) || !a.getTime().equals(apt.getTime()))
                        || !a.doctors.equals(apt.getDoctors())) {
                } else {
                    System.out.println("Appointment is already taken");
                    return;
                }
            }
        }

        appointments.add(apt);
    }

    void removeAppointment(Appointment ap) {
        appointments.remove(ap);
    }

    void getAppointmentsForDateandTime(String dates, String time) {
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(dates) && appointment.getTime().equals(time)) {
                System.out.println(" Patient Name : " + appointment.patients.getFirstName() + "\n Patient Surname : " + appointment.patients.getLastName() + "\n Patient Id: " + appointment.patients.getId()
                        + "\n Patient Gender : " + appointment.patients.getGender() + "\n Birth Date of Patience : " + appointment.patients.getDob()
                        + "\n Email of Patience : " + appointment.patients.getEmail() + "\n Patience Phone Number : " + appointment.patients.getPhone() + "\n************************************************"
                        + "\n Date of Appointment : " + appointment.getDate() + "\n Time of Appointment : " + appointment.getTime() + "\n Reason of Appointment : " + appointment.getReason() + "\n************************************************"
                        + "\n Doctor Name : " + appointment.doctors.getFirstName() + "\n Doctor Surname : " + appointment.doctors.getLastName() + "\n Doctor Id : " + appointment.doctors.getId()
                        + "\n Doctor Phone Number : " + appointment.doctors.getPhone() + "\n Doctor Title : " + appointment.doctors.getTitle()
                        + "\n Doctor Email: " + appointment.doctors.getEmail()
                );
            }
        }
    }

    void ListAllPatients() {
        System.out.println("Patient names and surnames:");
        Set<String> names = new HashSet<>();
        for (Appointment appointment : appointments) {
            if (appointment.patients != null) {
                String name = appointment.patients.getFirstName() + " " + appointment.patients.getLastName();
                if (!names.contains(name)) {
                    names.add(name);
                    System.out.println(name);
                }
            }
        }
    }

    void ListAllDoctors() {
        System.out.println("Patient names and surnames:");
        Set<String> names = new HashSet<>();
        for (Appointment appointment : appointments) {
            if (appointment.doctors != null) {
                String name = appointment.doctors.getFirstName() + " " + appointment.doctors.getLastName();
                if (!names.contains(name)) {
                    names.add(name);
                    System.out.println(name);
                }
            }
        }
    }

    void getAppointmentsByPatienceId(String Id) {
        for (Appointment appointment : appointments) {
            if (appointment.patients.getId().equals(Id)) {
                System.out.println(" Patient Name : " + appointment.patients.getFirstName() + "\n Patient Surname : " + appointment.patients.getLastName() + "\n Patient Id: " + appointment.patients.getId()
                        + "\n Patient Gender : " + appointment.patients.getGender() + "\n Birth Date of Patience : " + appointment.patients.getDob()
                        + "\n Email of Patience : " + appointment.patients.getEmail() + "\n Patience Phone Number : " + appointment.patients.getPhone() + "\n************************************************"
                        + "\n Date of Appointment : " + appointment.getDate() + "\n Time of Appointment : " + appointment.getTime() + "\n Reason of Appointment : " + appointment.getReason() + "\n************************************************"
                        + "\n Doctor Name : " + appointment.doctors.getFirstName() + "\n Doctor Surname : " + appointment.doctors.getLastName() + "\n Doctor Id : " + appointment.doctors.getId()
                        + "\n Doctor Phone Number : " + appointment.doctors.getPhone() + "\n Doctor Title : " + appointment.doctors.getTitle()
                        + "\n Doctor Email: " + appointment.doctors.getEmail()
                );
                System.out.println("--------------------------------------------------------------------------------");
            }
        }
    }

    void IsDoctorAvaliableAtThisTimeAndDate(Doctor d, String date, String time) {
        boolean isNotAvaliable = false;
        for (Appointment appointment : appointments) {
            if (appointment.doctors != null) {
                if (appointment.getTime().equals(time) && appointment.getDate().equals(date) && appointment.doctors == d) {
                    isNotAvaliable = true;

                }

            }
        }
        if (isNotAvaliable) {
            System.out.println("Not Avaliable");
        } else {
            System.out.println("Avaliable");
        }
    }

    void ListDoctorAppointments(Doctor d) {
        int count = 0;

        for (Appointment appointment : appointments) {
            if (appointment.getDoctors() == d && appointment.doctors != null) {
                count++;
                System.out.println("Appointment: " + count + "\nPatient Name : " + appointment.patients.getFirstName() + "\n Patient Surname : " + appointment.patients.getLastName() + "\n Patient Id: " + appointment.patients.getId()
                        + "\n Patient Gender : " + appointment.patients.getGender() + "\n Birth Date of Patience : " + appointment.patients.getDob()
                        + "\n Email of Patience : " + appointment.patients.getEmail() + "\n Patience Phone Number : " + appointment.patients.getPhone() + "\n************************************************"
                        + "\n Date of Appointment : " + appointment.getDate() + "\n Time of Appointment : " + appointment.getTime() + "\n Reason of Appointment : " + appointment.getReason() + "\n************************************************"
                        + "\n Doctor Name : " + appointment.doctors.getFirstName() + "\n Doctor Surname : " + appointment.doctors.getLastName() + "\n Doctor Id : " + appointment.doctors.getId()
                        + "\n Doctor Phone Number : " + appointment.doctors.getPhone() + "\n Doctor Title : " + appointment.doctors.getTitle()
                        + "\n Doctor Email: " + appointment.doctors.getEmail()
                );
                System.out.println("------------------------------------------------------------------");
            }
        }

    }

    int getPatientsNumber() {
        Set<Patient> patients = new HashSet<>();
        for (Appointment appointment : appointments) {
            if (appointment.patients != null) {
                patients.add(appointment.patients);
            }
        }
        return patients.size();
    }

    int getTotalDoctorsNumber() {
        Set<Doctor> doctors = new HashSet<>();
        for (Appointment appointment : appointments) {
            if (appointment.doctors != null) {
                doctors.add(appointment.getDoctors());
            }
        }
        return doctors.size();
    }

    int getGeneralPractitionerDoctorsNumber() {
        Set<GeneralPractitioner> generalPractitioners = new HashSet<>();
        for (Appointment appointment : appointments) {

            if (appointment.doctors != null && !(appointment.doctors instanceof Specialist)) {
                GeneralPractitioner gb = (GeneralPractitioner) appointment.doctors;
                generalPractitioners.add(gb);
            }
        }
        return generalPractitioners.size();
    }

    int getSpecialistDoctorsNumber() {
        Set<Specialist> specialists = new HashSet<>();
        for (Appointment appointment : appointments) {

            if (appointment.doctors instanceof Specialist && appointment.doctors != null) {
                Specialist sp = (Specialist) appointment.doctors;
                specialists.add(sp);
            }
        }

        return specialists.size();
    }

    int getAppointmentsNumber() {
        int count = 0;
        for (Appointment appointment : appointments) {
            count++;

        }
        return count;
    }

    int getAppointmentsNumberByDate(String date) {
        int count = 0;

        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                count++;
            }
        }
        return count;
    }

    void checkAppointmentAtThisDateAndTime(String date, String time) {
        boolean isFull = false;

        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time)) {
                isFull = true;
            }

        }
        if (isFull) {
            System.out.println("Full");
        } else {
            System.out.println("free");
        }

    }

    void getAppointmentsForDate(String date) {
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                System.out.println(" Patient Name : " + appointment.patients.getFirstName() + "\n Patient Surname : " + appointment.patients.getLastName() + "\n Patient Id: " + appointment.patients.getId()
                        + "\n Patient Gender : " + appointment.patients.getGender() + "\n Birth Date of Patience : " + appointment.patients.getDob()
                        + "\n Email of Patience : " + appointment.patients.getEmail() + "\n Patience Phone Number : " + appointment.patients.getPhone() + "\n************************************************"
                        + "\n Date of Appointment : " + appointment.getDate() + "\n Time of Appointment : " + appointment.getTime() + "\n Reason of Appointment : " + appointment.getReason() + "\n************************************************"
                        + "\n Doctor Name : " + appointment.doctors.getFirstName() + "\n Doctor Surname : " + appointment.doctors.getLastName() + "\n Doctor Id : " + appointment.doctors.getId()
                        + "\n Doctor Phone Number : " + appointment.doctors.getPhone() + "\n Doctor Title : " + appointment.doctors.getTitle()
                        + "\n Doctor Email: " + appointment.doctors.getEmail()
                );
                System.out.println("-----------------------------------------------------------------------------");
            }

        }

    }
}
