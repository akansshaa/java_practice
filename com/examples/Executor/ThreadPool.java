package com.examples.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool implements Runnable{ 
//cant add throws here because of runnable interface use try-catch
    public void run(){
        Thread current = Thread.currentThread();
        System.out.printf("started %s\n",current.getName());
        try{
            Thread.sleep(getRandom()*1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.printf("ended : %s\n",current.getName());
    }

    private int getRandom(){
        double random = Math.random()*5 + 1;
        return (int)random;
    }

    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            for(int i=0;i<10;i++){
            ThreadPool task = new ThreadPool();
            service.submit(task);
            }

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("emergency shutdown!!");
                service.shutdown();
            }
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
    }
}
