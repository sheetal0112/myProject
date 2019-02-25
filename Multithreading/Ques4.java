//Try shutdown() and shutdownNow() and observe the difference
package com.multithreading.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3"+10/0);
                }
            });
        }finally {
            executorService.shutdown();
            //executorService.shutdownNow();
        }

        System.out.println("End");
    }
}