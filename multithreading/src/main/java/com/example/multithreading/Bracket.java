package com.example.multithreading;

public class Bracket {
    public void generate()
    {
        for(int i = 1; i <= 20; i++)
        {
            if(i <= 10)
                System.out.print("[");
            else
                System.out.print("]");
        }
        System.out.println();
    }
}

class Main3
{
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                {
                    bracket.generate();
                }
            }
        }).start();
        Bracket bracket1 = new Bracket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                {
                    bracket1.generate();
                }
            }
        }).start();
    }
}
