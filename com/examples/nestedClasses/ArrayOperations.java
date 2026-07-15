package com.examples.nestedClasses;
 
public class ArrayOperations {
    private int[] numbers;
    public ArrayOperations(){
        this.numbers = new int[]{10,20,30,40,50};
    }
    private class Statistics{
            double mean(){                            
            double sum = 0;
            for(int num : numbers){
                sum+=num;
            }
            return sum/numbers.length;
        }
    }
    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations();
        ArrayOperations.Statistics stats = arrayOps.new Statistics();// Creating instance of inner class,inner class 
                                                                    //is associated with instance of outer class
        System.out.println("Mean: " + stats.mean());
    }
}
