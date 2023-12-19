package com.example.multithreading.youtube;

import java.util.ArrayList;
import java.util.List;

public class QueueDA {
    List<String> q = new ArrayList<>();

    public String addQueue(String string)
    {
        q.add(string);
        return "add succesfully";
    }

    public String removeQueue()
    {
        if(q.size() == 0)
            return "q is empty";

        q.remove(0);

        return "removed succesfully";
    }

    public QueueDA(List<String> q) {
        this.q = q;
    }

    public List<String> getQ() {
        return q;
    }

    public void setQ(List<String> q) {
        this.q = q;
    }

}
