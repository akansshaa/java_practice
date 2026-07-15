package com.examples.basics;
import java.util.*;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the series: ");
        int len = sc.nextInt();
        System.out.println("the series is as follows: ");
        for(int i=0;i<=len;i++){
            System.out.print(fibo(i)+" ");
        }
        sc.close();
    }
    public static int fibo(int num){
        if(num == 0||num == 1) return 0;
        if(num == 2 || num == 3) return 1;
        else{
            return fibo(num-1) + fibo(num-2);
        } 
    }
}
