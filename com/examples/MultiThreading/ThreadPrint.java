package com.examples.MultiThreading;

public class ThreadPrint extends Thread{
    private final char targetChar;

    public ThreadPrint(char targetChar){
        this.targetChar = targetChar;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.printf("Hello from Thread %c\n", targetChar);
        }
        System.out.printf("task completed for thread %c\n", targetChar);
    }

    public static void main(String[] args) {
        ThreadPrint t1 = new ThreadPrint('A');
        ThreadPrint t2 = new ThreadPrint('B');

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println("exception caught!");
        }
    }
}
/*public class PrintRunnable implements Runnable{

    private final char targetChar;
    @Override 
    public void run(){
        for(int i=0;i<10;i++){
            System.out.printf("%d:%c",i,targetChar);
        }
        System.out.printf("\n%c task completed\n",targetChar);
    }
    public PrintRunnable(char targetChar) {
        this.targetChar = targetChar;
    }
    public static void main(String[] args){
        PrintRunnable p1 = new PrintRunnable('*');

        Thread t1 = new Thread(p1);
        t1.start();
    }
} */
