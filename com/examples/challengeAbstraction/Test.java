package com.examples.challengeAbstraction;

public class Test{
    public static void main(String[] args) {
        Square s = new Square(5.0);
        Circle c = new Circle(4.0);

        System.out.printf("Area of the curcle is %5.2f and that of Square is %5.2f",c.calculateArea(),s.calculateArea());
    }
}
