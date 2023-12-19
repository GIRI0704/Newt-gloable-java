package com.example.multithreading.youtube;

import com.example.multithreading.youtube.QueueDA;

import java.util.ArrayList;
import java.util.List;

public class ThreadBeaking {
    public static void main(String[] args) {

//        for (int i = 1; i < 5; i++)
//        {
//            Cake cake = new Cake();
//            Thread thread = new Thread(cake);
//            thread.start();
//        }
        List<String> queue = new ArrayList<>();
        QueueDA obj = new QueueDA(queue);


        for(int i = 0; i < 6; i++)
        {
            List<String> temp = obj.getQ();

            String str = obj.addQueue("giri " + i);
            System.out.println(str);
        }


    }
}
