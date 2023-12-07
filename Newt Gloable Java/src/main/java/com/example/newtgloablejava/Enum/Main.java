package com.example.newtgloablejava.Enum;

import static com.example.newtgloablejava.Enum.Days.Monday;

public class Main {
    public static void main(String[] args) {
        Days days = Monday;
        switch (days)
        {
            case Monday:
                System.out.println("monday");
                break;
            default:
                System.out.println("wed");
        }
    }
}
