package com.examples.basics;
import java.util.*;
public class passChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do{
            System.out.print("enter a valid password of length 8,atleast one /'a'/ ,one /'A'/ and one special charater: ");
            password = sc.next();
        }while(!isValid(password));
        System.out.println("password entered is valid.");
        sc.close();
    }
    public static boolean isValid(String pass){
        boolean flag = false;
        if(pass.length()>=8){
            flag = true;
        }
        return flag;
    }
}
