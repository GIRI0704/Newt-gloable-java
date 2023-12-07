package com.example.newtgloablejava.MultipleTread;

public class B extends Thread{
    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.println("in B");
            try {
                Thread.sleep(1000);  // sleep throw an exception
            }catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
