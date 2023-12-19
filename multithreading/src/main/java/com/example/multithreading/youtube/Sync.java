package com.example.multithreading.youtube;

public class Sync {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(new Team(counter));
        Thread thread1 = new Thread(new Team(counter));

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        }catch (Exception e)
        {

        }
        System.out.println(counter.cakeCount);
    }
}
