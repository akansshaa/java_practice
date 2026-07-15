package com.examples.Array;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] newArr = reverseArray.reverse(arr);
        if (is_pal(arr,newArr)){
            System.out.println("paindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static boolean is_pal(int[] a1,int[] a2) {
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
               return false;
            }
        }
        return true;
    }
}
