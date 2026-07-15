package com.examples.challengePolymorphism;

public class Car extends Vehicle{
    @Override
    public void services(){
        super.services();
        System.out.println("Smoother Driving experience");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.services();
    }
}
