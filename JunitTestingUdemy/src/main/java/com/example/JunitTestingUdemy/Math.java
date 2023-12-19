package com.example.JunitTestingUdemy;

public class Math {

    public int calculate(int nums[])
    {
        int sum = 0;
        for(int i : nums)
        {
            sum+=i;
        }
        return sum;
    }
}
