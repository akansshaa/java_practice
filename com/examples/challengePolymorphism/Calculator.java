package com.examples.challengePolymorphism;
public class Calculator {
    private int sum(int a, int b){
        return a+b;
    }
    private int sum(int a,int b,int c){
        return a+b+c;
    }
    private double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(2,4));
        System.out.println(obj.sum(2,4,5));
        System.out.println(obj.sum(2.0,5.0));
    }
}
