package com.example.multithreading;

import static java.lang.Thread.sleep;

public class MultiTread implements  Runnable{
    private int thread;

    public MultiTread(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread "+thread+" "+ i);
        }
    }
}

class Main1
{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MultiTread(1));
        Thread thread1 = new Thread(new MultiTread(2));
        thread.start();;
        thread1.start();

    }
}
