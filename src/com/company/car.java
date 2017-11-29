package com.company;

public class car {
    private String model;
    private String color;
    car(){
        this("Model Default");
    }
    car(String model){
        this("Color Default", model);
    }
    car(String color, String model){
        this.color=color;
        this.model=model;
        this.info();
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setModel(String model){
        System.out.println("Вы не можете изменить модель машины.");
    }
    public void run(){
        System.out.println("Car - run...");
    }
    public void stop(){
        System.out.println("Car -stop...");
    }
    public void info(){
        System.out.println("Car model:"+model+", car color: "+color);
    }
}
