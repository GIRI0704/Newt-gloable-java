package com.example.newtgloablejava.Interface;

public class Main implements A{
    @Override
    public void mess() {
        System.out.println("in main class");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mess();
        System.out.println(A.age);
    }

    @Override
    public void config() {

    }
}
