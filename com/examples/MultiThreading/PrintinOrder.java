package com.examples.MultiThreading;

public class PrintinOrder extends Thread {
    private int threadNumber;
    public PrintinOrder(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run(){
        System.out.printf("\n %s Thread starting -%d\n",Thread.currentThread().getName(),threadNumber);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.printf("\n %s Thread ending -%d\n",Thread.currentThread().getName(),threadNumber);
    }

    public static void main(String[] args) throws InterruptedException{
        PrintinOrder t1 = new PrintinOrder(1);
        PrintinOrder t2 = new PrintinOrder(2);
        PrintinOrder t3 = new PrintinOrder(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();
        
        t3.start();
        
    }
}
