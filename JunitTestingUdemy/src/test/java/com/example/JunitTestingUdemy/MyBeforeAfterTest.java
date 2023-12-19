package com.example.JunitTestingUdemy;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    // junit test execute any order of the test method

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("beforeAll");
    }


    @BeforeEach
    void beforeEach()  // it runs before every test
    {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() // it runs after every test
    {
        System.out.println("afterEach");
    }
    @Test
    void test1()
    {
        System.out.println("test1");
    }
    @Test
    void test2()
    {
        System.out.println("test2");
    }
    @Test
    void test3()
    {
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("afterall");
    }
}
