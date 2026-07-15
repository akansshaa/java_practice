package com.examples.basics;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial: "+fact(n));
    }
    public static int fact(int num){
        int result = 1;
        if(num==0 || num==1){
            return 1;
        }
        else{
            for(int i=1;i<=num;i++){
                result*=i;
            }
        }
        return result;
    }
}
