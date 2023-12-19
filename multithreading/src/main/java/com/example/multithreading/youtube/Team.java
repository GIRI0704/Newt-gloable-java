package com.example.multithreading.youtube;

public class Team implements Runnable{
    Counter counter;
    Team(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++)
        {
            counter.increment();
        }
    }
}
