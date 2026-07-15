package com.examples.challenge101.challenge2;

public class employeeDetails {
    public static void main(String[] args) {
        employee emo = new employee("aks", 20, 50000.00);
        System.out.println("Name:"+emo.getName());
        System.out.println("Age:"+emo.getAge());
        System.out.println("Salary:"+emo.getSalary());
    }
}
