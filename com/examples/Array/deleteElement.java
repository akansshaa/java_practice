package com.examples.Array;
import java.util.*;
public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to be deleted: ");
        int to_delete = sc.nextInt();
        int[] arr = ArrayUtility.inputArray();
        int[] newArr = deleteNum(arr, to_delete);
        System.out.println("New Array: ");
        ArrayUtility.displayArray(newArr);
        sc.close();
    }
    public static int[] deleteNum(int[] a,int num){
        int occ = occurence.check(a, num);
        if(occ == 0){
            return a;
        }
        int newSize = a.length - occ;
        int[] newArr = new int[newSize];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=num){
               newArr[j] = a[i];
               j++;
            }
        }
        return newArr;
    }
}
