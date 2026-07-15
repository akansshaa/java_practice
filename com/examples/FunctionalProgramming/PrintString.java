package com.examples.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class PrintString {
    public static void main(String[] args) {

        //List<String> names = List.of("akansha","shiva","archita")
        List<String> list = Arrays.asList("akansha","shiva","archita");

        list.stream().forEach(str -> System.out.println(str));
    }
}
