package com.examples.FunctionalProgramming;
import java.util.List;
public class FilterLength {
    public static void main(String[] args) {
        List<String> names = List.of("akanshaa mishra","shubhi mishraa","shreyaa");

        String result = names.stream()
            .filter(name -> name.length() > 10)
            .reduce(" ", (a,b) -> a+ " "+b);

        System.out.println(result);
    }

}
