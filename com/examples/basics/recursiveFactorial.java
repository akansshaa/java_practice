package com.examples.basics;
import java.util.*;
public class recursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.print("Factorial of the number is:");
        System.out.println(fact);
        sc.close();
    }
    public static long factorial(int number){
        if(number == 1){
            return 1;
        }
        return number*factorial(number - 1);
    }
}
