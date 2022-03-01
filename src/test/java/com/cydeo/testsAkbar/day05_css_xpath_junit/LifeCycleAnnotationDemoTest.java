package com.cydeo.testsAkbar.day05_css_xpath_junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

public class LifeCycleAnnotationDemoTest {
    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll run once before all tests");
    }
   @BeforeEach
    public void setup(){
        System.out.println("@BeforeEach run once before each test");
    }

@Test
public void test1(){
    System.out.println("Test1 method is running");
}

    @Test
    public void test2(){
        System.out.println("Test2 method is running");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("@AfterEach run once after each test");
    }


   @AfterAll
   public static void cleanUp() {
       System.out.println("@AfterAll run once after all tests");
   }




}
