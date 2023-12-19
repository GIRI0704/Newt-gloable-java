package com.example.learnspringframework.Enterprice;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
class DataService {
    public List<Integer> getData() {
        return Arrays.asList(1, 2, 3, 4);
    }
}
