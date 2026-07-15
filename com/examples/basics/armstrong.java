package com.examples.basics;
import java.util.*;
// a no is armstrong if sum of cube of each digit is equal to that num
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();
        sc.close();
        check(num);
    }
    public static void check(int n){
        int org = n;
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum += find_cube(r);
            n = n/10;
        }
        if(sum == org){
            System.out.println("given number is an armstrong no..");
        }
        else{
            System.out.println("given number is not an armstrong no.");
        }
    }
    public static int find_cube(int a){
        return a * a * a;
    }
}
