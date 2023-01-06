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
public class GeneralPractitioner extends Doctor{
    
    @Override
    public void diagnose(Scanner scan){
         System.out.println("Choose one of them that you have ; ");
        System.out.println("1)I have a flu or something similar \n 2)I have broken bones \n 3)I have a problem in my internal organs or head area");
        int num=scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("The situation is stable");
                break;
            case 2:
                System.out.println("The situation is moderately critical");
                break;
            case 3:
                System.out.println("The situation is very critical");
                break;
            default:
                System.out.println("Invalid number");

        }
    }

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
    
}
