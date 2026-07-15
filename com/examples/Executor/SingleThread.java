package com.examples.Executor;

import java.util.concurrent.Executors;

import com.examples.MultiThreading.ThreadPrint;

import java.util.concurrent.ExecutorService;

public class SingleThread {
    public static void main(String[] args) {
        //static builder pattern used to create executor service 
        //here threadpool with one thread at present 
        ExecutorService service = Executors.newSingleThreadExecutor();

        ThreadPrint task = new ThreadPrint('*');

        service.submit(task);
        service.shutdown();
    }
}
