package com.example.newtgloablejava.InnerClass;

public class A {
    int num;
    public void mess()
    {
        System.out.println("in A class");
    }
    class B
    {
        public void mess()
        {
            System.out.println("in class B");
        }
    }
}
