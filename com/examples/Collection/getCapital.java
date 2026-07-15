package com.examples.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class getCapital {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

    map.put("India","New Delhi");
    map.put("china","beijing");
    map.put("pakistan","islamabad");
    map.put("sri lanka","columbo");
    map.put("bangladesh","dhaka");

    Scanner sc = new Scanner(System.in);
    System.out.print("enter the name of the country:");
    String country = sc.next();

    sc.close();
    
    if(map.containsKey(country)){
        System.err.printf("%s : %s",country,map.get(country));
    }else{
        System.out.println("sorry! we dont know the capital");
    } 
    }
}
