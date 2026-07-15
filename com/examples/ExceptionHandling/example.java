package com.examples.ExceptionHandling;
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number for division");
        System.out.print("enter first number:");
        int first = sc.nextInt();
        System.out.print("enter second number:");
        int second = sc.nextInt();
        sc.close();
        try{
            int result = first/second;
            System.out.printf("Result is %d:",result);
        }catch(ArithmeticException exception){
            if(exception.getMessage().equals("/ by Zero")){
                System.out.println("Division by zero exception!");
            }else{
                throw exception;
            }
        }
    }
}
