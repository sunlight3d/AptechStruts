/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;


/**
 * Models a Person who registers.
 * @author bruce phillips
 *
 */
public class Person {

    private String firstName;
    private String lastName;
    private String sport;
    private String gender;
    private String residency;
    private boolean over18;
    private String[] carModels;

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

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getSport() {
        return sport;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public String getResidency() {
        return residency;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setCarModels(String[] carModels) {
        this.carModels = carModels;
    }

    public String[] getCarModels() {
        return carModels;
    }

    public String toString() {
        return "First Name: " + getFirstName() + " | "
                + " Last Name:  " + getLastName() + " | "
                + " Favorite Sport: " + getSport() + " | "
                + " Gender: " + getGender() + " | "
                + " Residency: " + getResidency() + " | "
                + " Over 21: " + isOver18() + " | "
                + " Car models: " + Arrays.asList(getCarModels());

    }
}
