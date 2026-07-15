package com.examples.challengeInheritance;

public class testinheritance {
    public static void main(String[] args) {
        vehicle myVehicle = new vehicle();
        TwoWheeler myBike = new TwoWheeler();
        myVehicle.commute();
        myBike.commute();
    }
}
