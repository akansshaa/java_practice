package com.examples.basics;
import java.util.*;
public class TwoSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("enter elements: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("enter element to be searched:");
        int num = sc.nextInt();
        sc.close();
        boolean result = search(arr,num);
        if(result){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
    public static boolean search(int[][] a,int n){
        boolean flag = false;
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               if(a[i][j]==n){
                flag = true;
               }
            }
        }
        return flag;
    }
}
