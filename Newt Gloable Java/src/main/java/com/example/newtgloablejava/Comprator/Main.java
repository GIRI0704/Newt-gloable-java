package com.example.newtgloablejava.Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("giri");
        list.add("nas");
        list.add("roshan");

        list.forEach(n -> System.out.println(n));

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else return -1;
            }
        };




        Collections.sort(list,comparator);

        for(String s : list)
        {
            System.out.print(s+" ");
        }
    }
}
