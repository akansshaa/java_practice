package com.examples.basics;
import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks scored: ");
        int marks = sc.nextInt();
        sc.close();
        if(marks>90){
            System.out.println("grade: A");
        }
        else if(marks>75){
            System.out.println("grade: B");
        }
        else if(marks>60){
            System.out.println("grade: C");
        }
    }
}
