package com.company;

import java.awt.*;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        System.out.println("Car - Constructor:");
	    car car=new car();
        System.out.println("Car1 - Constructor:");
        car car1=new car("Ford");
        System.out.println("Car2 - Constructor:");
        car car2=new car("Red","Ford");

        System.out.println("Test-car");
        System.out.println("Car-model:"+car.getModel());
        System.out.println("Car-color: "+car.getColor());
        car1.setColor("Black");
        car1.setModel("Lada");
        car1.info();

        System.out.println("Test-car1");
        System.out.println("Car-model:"+car1.getModel());
        System.out.println("Car-color:"+car1.getColor());
        car1.setColor("White");
        car1.setModel("Porshe");
        car.info();

        System.out.println("Test-car2");
        System.out.println("Car-color:"+car2.getColor());
        System.out.println("Car-model:"+car2.getModel());
        car2.setColor("Yellow");
        car.info();


    }
}
