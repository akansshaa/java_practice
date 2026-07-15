package com.examples.Executor;

import java.util.concurrent.Callable;

public class factorial implements Callable <Integer>{

    private final int number;

    public factorial(int number){
        this.number = number;
    }
    @Override
    public Integer call() throws Exception{
        Thread.sleep(2000);
            if(number <=1) {
                return 1;
            }
            int res = 1;
            for(int i=2;i<number;i++){
                res *= i;
            }
            return res;
    }
}
