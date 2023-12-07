package com.example.newtgloablejava.JoinInThread;

public class A implements Runnable{
    Counter c = new Counter();
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++)
        {
            c.increment();
        }
    }
}
