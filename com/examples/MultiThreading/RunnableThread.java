package com.examples.MultiThreading;

public class RunnableThread implements Runnable {
    @Override
    public void run(){
         for(int i=1;i<=10;i++){
            System.out.printf("%d%c  ",i,targetChar);
        }
        System.out.printf("%c completed task %s",targetChar,Thread.currentThread().getName());
    }
    private final char targetChar;

    public RunnableThread(char targetChar){
        this.targetChar = targetChar;
    }

    public static void main(String[] args) {
        RunnableThread p1 = new RunnableThread('*');
        RunnableThread p2 = new RunnableThread('#');

        Thread t1 = new Thread(p1);
        t1.start();

        //new Thread(t1).start()
        
        Thread t2 = new Thread(p2);
        t2.start();

        System.out.printf("%s",
            Thread.currentThread().getName());
    }
}
