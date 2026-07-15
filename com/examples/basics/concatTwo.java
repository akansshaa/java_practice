package com.examples.basics;
import java.util.*;
public class concatTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first string : ");
        String s1 = sc.next();
        System.out.print("enter second string : ");
        String s2 = sc.next();
        String newStr = s1.concat(" ").concat(s2);
        System.out.println(newStr.toUpperCase());
        sc.close();
    }
}
