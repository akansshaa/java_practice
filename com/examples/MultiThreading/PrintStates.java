package com.examples.MultiThreading;

public class PrintStates extends Thread {
    //cant throw any new exception as a child method 
    public synchronized void run(){
        try{
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getState());
        }catch(InterruptedException e){
            throw new RuntimeException(e); 
        }
        System.out.println("hello this is testing code.");
    }
    public static void main(String[] args) throws InterruptedException{
        PrintStates t1 = new PrintStates();
        PrintStates t2 = new PrintStates();
        System.out.printf("create thread %s\n",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("thread finished %s\n",t1.getState());
         
        System.out.printf("create thread %s\n",t2.getState());
        t2.start();
        t2.join();
        System.out.printf("thread finished %s",t2.getState());
    }
}
