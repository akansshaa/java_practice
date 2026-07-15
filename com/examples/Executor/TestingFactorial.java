package com.examples.Executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFactorial {
    public static void main(String[] args) {
        
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                factorial task = new factorial(i);
                list.add(service.submit(task));
            }
            service.shutdown();
            for (Future<Integer> future : list) {
                System.out.printf("\n result is %d\n", future.get());
            }
            
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                service.shutdown();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
