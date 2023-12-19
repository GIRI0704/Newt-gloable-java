package com.example.JunitTestingUdemy;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    List<String> list = Arrays.asList("giri", "nas", "roshan");

    @Test
    void test()
    {
        Boolean test = list.contains("giri");
        assertEquals(true,test);
        assertEquals(3,list.size());

        Boolean test1 = list.contains("prem");

        assertTrue(test); // it check boolean is true

//        assertTrue(test1,"something went wrong")
        assertArrayEquals(new int[]{1,2},new int[]{1,2});
    }
}
