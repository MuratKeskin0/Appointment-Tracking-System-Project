/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appointmentTrackingSystem;




/**
 *
 * @author murat
 */
public class Appointment {
    String reason,date,time;
   
    Patient patients= new Patient();
    Doctor doctors= new Doctor();

    public void Appointment(String date, String time, String reason, Doctor d, Patient p) {
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.patients=p;
        this.doctors=d;
    }

    Appointment() {
    }

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

   

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }

    public Doctor getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctors) {
        this.doctors = doctors;
    }

   

    
    
    
}
