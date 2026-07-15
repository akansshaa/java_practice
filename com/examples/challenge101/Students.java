package com.examples.challenge101;
public class Students {
    String name;
    int age;
    int rollNumber;

    
    public Students(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString() {
        return "Student details :{name:" + name 
                + ", age : "  + age 
                + ", rollnumber: " + rollNumber + "}";
        }
    public static void main(String[] args) {
        Students st1 = new Students("Akansha", 19, 334);
        System.out.println(st1);
    }
}
