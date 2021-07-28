package com.exercises;

public class PrivateCar {
    private String make;
    private String model;
    private int year;

    PrivateCar(String make,
               String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public  int getYear(){
        return this.year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public  void setYear(int year){
        this.year = year;
    }

    public void copy(PrivateCar car){
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }

    PrivateCar(PrivateCar car){
        this.copy(car);
    }
}
