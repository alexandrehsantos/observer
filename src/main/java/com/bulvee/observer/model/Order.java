package com.bulvee.observer.model;

public class Order {
    private String description;
    private double value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Description=" + this.description + " - Value=" + this.value;
    }

}
