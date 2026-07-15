package com.examples.FunctionalProgramming;
import java.util.List;
public class PrintOddNums {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        numbers.stream()
            .filter(num -> (num%2) == 1)
            .forEach(num -> System.out.println(num));
    }
}

/* method reference exp:-
int sum1 = number.stream().reduce(0, (a,b)->a+b);

int sum1 = number.stream().reduce(0, Integer::sum);

*/
