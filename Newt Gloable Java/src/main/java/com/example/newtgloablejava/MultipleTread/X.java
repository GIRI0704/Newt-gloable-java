package com.example.newtgloablejava.MultipleTread;

public class X implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 11; i++)
        {
            System.out.println("in x "+ i);

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
