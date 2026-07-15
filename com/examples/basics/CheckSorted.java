package com.examples.basics;
import com.examples.Array.ArrayUtility;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean inc = is_Increasing(arr);
        boolean dec = is_decreasing(arr);
        if(inc || dec){
            System.out.println("the array is sorted.");
        }
        else{
            System.out.println("the array is unsorted");
        }
    }
    public static boolean is_Increasing(int[] a) {
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean is_decreasing(int[] a) {
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                return false;
            }
        }
        return true;
    }
}
