package com.example.lab3;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Skill {
    private StringProperty firstName;
    private DoubleProperty k1;
    private DoubleProperty k2;
    private DoubleProperty k3;
    private DoubleProperty k4;
    private DoubleProperty k5;

    public Skill(String firstName, double k1, double k2, double k3, double k4, double k5) {
        this.firstName = new SimpleStringProperty(firstName);
        this.k1 = new SimpleDoubleProperty(k1);
        this.k2 = new SimpleDoubleProperty(k2);
        this.k3 = new SimpleDoubleProperty(k3);
        this.k4 = new SimpleDoubleProperty(k4);
        this.k5 = new SimpleDoubleProperty(k5);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public double getK1() {
        return k1.get();
    }

    public DoubleProperty k1Property() {
        return k1;
    }

    public void setK1(double k1) {
        this.k1.set(k1);
    }

    public double getK2() {
        return k2.get();
    }

    public DoubleProperty k2Property() {
        return k2;
    }

    public void setK2(double k2) {
        this.k2.set(k2);
    }

    public double getK3() {
        return k3.get();
    }

    public DoubleProperty k3Property() {
        return k3;
    }

    public void setK3(double k3) {
        this.k3.set(k3);
    }

    public double getK4() {
        return k4.get();
    }

    public DoubleProperty k4Property() {
        return k4;
    }

    public void setK4(double k4) {
        this.k4.set(k4);
    }

    public double getK5() {
        return k5.get();
    }

    public DoubleProperty k5Property() {
        return k5;
    }

    public void setK5(double k5) {
        this.k5.set(k5);
    }
}
