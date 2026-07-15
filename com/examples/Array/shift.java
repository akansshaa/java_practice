package com.examples.Array;
import java.util.*;
public class shift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int result1 = num << 2;
        int result2 = num >> 1;
        System.out.println("result left shift: "+result1);
        System.out.println("result right shf: "+ result2);
    }
}
