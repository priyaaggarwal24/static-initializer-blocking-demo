package com.iliyakos;

public class Test {
    static {
        System.out.println("Entered static block by thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
            System.out.println("Finished static block by thread " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
