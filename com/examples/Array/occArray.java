package com.examples.Array;
import java.util.*;
public class occArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int result = find(arr,num);
        System.out.println("given elements is found "+ result+ " times.");
    }
    public static int find(int[] arr,int num){
        int count = 0;
        for(int nums : arr){
            if(nums == num){
                count++;
            }
        }
        return count;
    }
}
