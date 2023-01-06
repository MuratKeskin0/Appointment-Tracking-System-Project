/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appointmentTrackingSystem;

import java.util.Scanner;

/**
 *
 * @author murat
 */
public class Specialist extends Doctor {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    @Override
    public void diagnose(Scanner scan) {
        System.out.println("Choose one of the symptoms that you have ; ");
        System.out.println("1)Headache \n 2)Stomachache \n 3)Heartache \n 4)Broken bone");
        int num=scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("You should go to neurology department");
                break;
            case 2:
                System.out.println("You should go to internal medicine department");
                break;
            case 3:
                System.out.println("You should go to cardiology department");
                break;
            case 4:
                System.out.println("You should go to orthopedics department");
                break;
            default:
                System.out.println("Invalid number");

        }

    }

    

  
    

}
