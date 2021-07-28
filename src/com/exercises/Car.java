package com.exercises;

public class Car extends  Vehicle{
    String make;
    String model = "corvette";
    int year = 2004;
    String color = "blue";
    double price = 12999.99;

    Car(String make){
        this.make = make;
    }

    void go(){
        System.out.println("The car is moving");
    }

    void drive(){
        System.out.println("You drive" +
                " the car");
    }

    void brake(){
        System.out.println("You step on" +
                " the brakes.");
    }

    public String toString(){
        return "This car is a " +
                this.make + " model " +
                model + " from year " +
                year + " with color " +
                color + " with a price of" +
                price + ".";
    }

}
