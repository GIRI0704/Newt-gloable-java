package com.example.newtgloablejava.JoinInThread;

public class Counter {
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
