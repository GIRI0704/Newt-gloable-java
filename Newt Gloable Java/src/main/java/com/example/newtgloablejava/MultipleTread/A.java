package com.example.newtgloablejava.MultipleTread;

public class A extends Thread{
    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.println("in A");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
}
