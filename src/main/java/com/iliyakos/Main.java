package com.iliyakos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> Class.forName("org.priya.Test"));
        executorService.submit(() -> {
            final Test test = new Test();
            System.out.println("Object created by thread " + Thread.currentThread().getName());
        });
    }
}
