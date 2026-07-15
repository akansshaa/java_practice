package com.examples.FunctionalProgramming;

import java.util.function.BinaryOperator;

public class productLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> prod = (a,b) ->  a * b ;
        int result = prod.apply(4,5);
        System.out.println(result);
    }
}
