package com.example.multithreading.youtube;

public class Cake implements Runnable{
    @Override
    public void run() {
        System.out.println("mixing "+Thread.currentThread().getId());
        System.out.println("baking "+Thread.currentThread().getId());
        System.out.println("paking "+Thread.currentThread().getId());
    }
}
