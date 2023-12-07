package com.example.newtgloablejava.AnonymousInnerClas;

public class A {
    public static void main(String[] args) {
        A a = new A()
        {
            public void mess()
            {
                System.out.println("new mess");
            }
        };

        a.mess();
    }
    public void mess()
    {
        System.out.println("in A class");
    }
}
