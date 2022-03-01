package com.cydeo.testsAkbar.day05_css_xpath_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*

 */




public class FirstTest {
//test method is annotated with @Test annotation
    //It's a void method with no param
     @Test
    public void testAddition(){
         int num1=10;
         int num2=7;
         int expectedResult=17;

         Assertions.assertEquals(expectedResult,num1+num2);
     }
@Test
    public void testString(){
        String message="I love Selenium";
        //assert this msg equal"I live Selenium";
        //todo: This method accept 2 parameters
         Assertions.assertEquals("I love Selenium",message);
        //assert this message starts with "I love"

           //TODO: below asserTrue accept 1 parameter as boolean
           Assertions.assertTrue(message.startsWith("I love"));



      }





}
