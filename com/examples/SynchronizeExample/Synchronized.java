package com.examples.SynchronizeExample;

public class Synchronized extends Thread {

    private Counter counter;

    public Synchronized(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<10000;i++){
            counter.increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Synchronized t1 = new Synchronized(counter);
        Synchronized t2 = new Synchronized(counter);

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Final count is: "+counter.getCount());
        }catch(Exception e){
            System.out.println("exception caught!");
        }
    }
}
