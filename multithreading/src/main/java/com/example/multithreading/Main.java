package com.example.multithreading;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        myCounter1.start();

        System.out.println("--------------------------------------------");

        counter2.start();
    }
}

class MyCounter extends Thread
{
    private int thread;

    public MyCounter(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void countMe() throws InterruptedException
    {
        for (int i = 0; i < 10; i++)
        {
            sleep(1000);
            System.out.println("thread : "+ i);
        }
    }
}
