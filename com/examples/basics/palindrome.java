package com.examples.basics;
import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean check = check_palindrone(num);
        if(check){
            System.out.println("this is a plaindrome number.");
        }
        else{
            System.out.println("this is not a palindrome number.");
        }
    }
    public static boolean check_palindrone(int num){
        int org = num;
        int rev = reverse(num);
        if(rev == org){
            return true;
        }
        else{
            return false;
        }
    }
    public static int reverse(int num){
        int new_num = 0;
        while(num!=0){
            int r = num%10;
            new_num = new_num*10+r;
            num/=10;
        }
        return new_num;
    }
}