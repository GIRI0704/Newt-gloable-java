package com.example.newtgloablejava.InnerClass;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.mess();
        A.B obj = a.new B();

        // for static inner class
        //A.B obj1 = new A.B;
        obj.mess();
    }
}
