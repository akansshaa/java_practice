//take string and return no of unique characters using a set

package com.examples.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string:");
        String str = sc.nextLine();
        Set<Character> unique = new HashSet<>();
        for (char ch : str.toCharArray()) {
            unique.add(ch);
        }
        System.out.println("Number of unique characters: " + unique.size());
        sc.close();
    }
}
