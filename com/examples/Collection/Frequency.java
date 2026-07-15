package com.examples.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,4,5,6,7,8,7);
        System.out.println(Collections.frequency(list, 1));
    }
}
