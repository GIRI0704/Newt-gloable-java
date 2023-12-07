package com.example.newtgloablejava.MultipleTread;

public class Main {
    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        System.out.println(a.getPriority());
//
//        b.setPriority(Thread.MAX_PRIORITY);
//        a.start();
//        b.start();
//
//
//        X x = new X();
//        Thread t = new Thread(x);
//        t.start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 1; i <= 100; i++)
//                {
//                    System.out.println("in run");
//                    try {
//                        Thread.sleep(1000);  // sleep throw an exception
//                    }catch (InterruptedException e)
//                    {
//                        System.out.println(e.getMessage());
//                    }
//                }
//            }
//        };
//        r.run();

        Runnable r = () ->{

                for(int i = 1; i <= 10; i++)
                {
                    System.out.println("in run "+ i);
                    try {
                        Thread.sleep(1000);  // sleep throw an exception
                    }catch (InterruptedException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
        };
        r.run();
    }
}
