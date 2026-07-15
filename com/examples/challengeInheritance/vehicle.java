package com.examples.challengeInheritance;

public class vehicle {
    public int wheels;

    private String color;

    public void getColor(String vehicleColor){
        color = vehicleColor;
    }
    
    vehicle(){
        wheels = 4;
        color = "white";
    }
    public void commute(){
        System.out.printf("no of tyres in vehicle are : %d and color is : %s\n",wheels,color);
    }

}
