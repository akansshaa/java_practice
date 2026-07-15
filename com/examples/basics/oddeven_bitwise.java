package com.examples.basics;
import java.util.*;
public class oddeven_bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        sc.close();
        if((num & 1) == 1){
            System.out.println("enetered number is an odd number.");
        }
        else{
            System.out.println("entered number is an even number.");
        }
    }

}
