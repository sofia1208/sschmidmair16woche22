package com.example.sschmidmair16woche22;

public class Car {
    private String firstname;
    private String lastname;
    private String producer;
    private String modell;

    public Car(String firstname, String lastname, String producer, String modell) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.producer = producer;
        this.modell = modell;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
