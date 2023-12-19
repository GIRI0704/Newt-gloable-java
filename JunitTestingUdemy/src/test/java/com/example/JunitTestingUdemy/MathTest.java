package com.example.JunitTestingUdemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    Math math = new Math();
    @Test
    void test() {

        int nums[] = {1, 2, 3};
        int result = math.calculate(nums);
        int expectedResult = 6;

        assertEquals(expectedResult, result);
    }

    @Test
    void test1() {
        int nums[] = {};
        int result = math.calculate(nums);
        int expectedResult = 0;

        assertEquals(expectedResult, result);
    }


}
