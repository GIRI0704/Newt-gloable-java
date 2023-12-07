package com.example.newtgloablejava.AnonymousInnerClas;
//Abstract and anonymous inner class
abstract class B {
    public static void main(String[] args) {
        B b = new B() {
            @Override
            public void mess() {
                System.out.println("in b");
            }
        };
        b.mess();
    }
    public void mess()
    {
        System.out.println("in B class");
    }
}
