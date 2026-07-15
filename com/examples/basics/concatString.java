package com.examples.basics;
import java.util.*;
public class concatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first string : ");
        String str1 = sc.next();
        System.out.print("enter second string : ");
        String str2 = sc.next();
        sc.close();
       // String newstr = str1 + str2;
        String newStr = str1.concat(" ").concat(str2);
        System.out.printf("%s is the new modified string.\n" , newStr);
        System.out.printf("%S is the modified string in uppercase.\n",newStr);
        System.out.println(newStr.toUpperCase());
    }
}
