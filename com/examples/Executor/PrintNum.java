package com.examples.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNum implements Runnable {
    private final int threadnum;

    public PrintNum(int threadnum){
        this.threadnum = threadnum;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.printf("Thread %d : %d\n",threadnum,i);
        }
    }

    public static void main(String[] args) throws InterruptedException ,ExecutionException {

        //try with resource 
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
           PrintNum task = new PrintNum(1);
            service.submit(task);
        }


        //service.shutdown();
    }
}
