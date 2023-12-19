package com.example.learnspringframework.Enterprice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


// spring provide 3 types of dependency injection
// 1 constructor based  --> it is recommended
// 2 setter
// 3 filed  ----> no setter no getter
@Component
class BusinessService {

    // setter injection
    private DataService dataService;
    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("setter injection");
        this.dataService = dataService;
    }

//    counstructor injection
//    @Autowired
//    public BusinessService(DataService dataService) {
//        super();
//        System.out.println("counstructor injection");
//        this.dataService = dataService;
//    }

    public long calculateSum() {
        long sum = 0l;
        List<Integer> data = dataService.getData();
        for (int i : data) {
            sum += i;
        }
        return sum;
    }
}
