package com.examples.MultiThreading;

public class ThreadClass extends Thread{
    @Override
    public void run(){
        //first task
        for(int i=1;i<=10;i++){
            System.out.printf("%d:%c",i,targetChar);
        }
        System.out.printf("%c completed task %s",targetChar,Thread.currentThread().getName());
    }
    private final char targetChar;

    public ThreadClass(char targetChar){
        this.targetChar = targetChar;
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass('*');
        ThreadClass t2 = new ThreadClass('$');
        
        long startTime = System.currentTimeMillis();
        System.out.println("starting first thread");
        t1.start();
        System.out.println("starting second thread");
        t2.start();
        
        long endTime = System.currentTimeMillis();

        System.out.printf("total time taken: %d",endTime-startTime);
    }
}

//start() internally causes the JVM to 
// invoke run() on a new thread.


