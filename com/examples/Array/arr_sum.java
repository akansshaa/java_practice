package com.examples.Array;
public class arr_sum {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("sum of all elements of arr: "+sum(arr));
        System.out.println("average of all elements of arr: "+avg(arr));
    }
    public static int sum(int[] a){
        int s = 0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public static double avg(int[] a){
        double average;
        int tot = sum(a);
        average = tot/a.length;
        return average;
    }
}
