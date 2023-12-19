package com.example.multithreading.youtube;

public class Counter {
    int cakeCount = 0;

    public synchronized void increment()
    {
        cakeCount++;
    }

}
