package com.cydeo.testsAkbar.day06_junit_practice_utility_methods;

import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {


  @Test
    public void testWait() throws InterruptedException {


    //we can instruct Webdriver to wait maximum amount of time
    //before throwing NoSuchElement exception by using implicit wait
    //If it is not available,it will wait for max of 10 second
    //if element is found 10s for example 1 second ===> it will move on to next step


    driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");
      driver.findElement(By.xpath("//button[.='Remove']")).click();
      //Thread.sleep(5000);

      WebElement itsGoneElm=driver.findElement(By.id("message"));
      System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        System.out.println("End");


  }





}
