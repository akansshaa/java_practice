package com.examples.basics;
import java.util.*;
public class function_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n1 = sc.nextInt();
        System.out.print("enter a second num: ");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Sum of two given number: "+ sum(n1,n2));
    }
public static int sum(int a, int b){
    int sum = a+b;
    return sum;
}
}
