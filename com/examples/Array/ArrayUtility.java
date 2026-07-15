package com.examples.Array;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter elements in the array:");
        for(int i=0;i<l;i++){
            System.out.print("enter element:");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void displayArray(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    
}
