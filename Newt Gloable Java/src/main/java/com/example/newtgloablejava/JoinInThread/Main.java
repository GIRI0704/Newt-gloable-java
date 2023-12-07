package com.example.newtgloablejava.JoinInThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->{
            for(int i = 0; i < 1000; i++)
            {
                c.increment();
                System.out.println(c.count);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }

            }
        };
        Runnable obj2 = () ->{
            for(int i = 0; i < 1000; i++)
            {
                c.increment();
                System.out.println(c.count);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        System.out.println(c.count);
    }
}
