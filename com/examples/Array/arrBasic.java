package com.examples.Array;
import java.util.*;
public class arrBasic {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter elements in the array at position " +i+": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("elements entered in the array are as follows: ");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i]);
        }
        find(arr,2);
   } 
   public static void find(int[] a,int num){
      int l = a.length;
      boolean flag = false;
      System.out.println("number to find a match for: "+num);
      for(int i=0;i<l;i++){
        if(a[i]==num){
            System.out.println("match found!.At position "+ i);
            flag = true;
            break;
        }
    }
    if(!flag){
        System.out.println("no match found.");
    }
   }
}
