package com.cydeo.testsAkbar.day06_junit_practice_utility_methods;

import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPracticeSet extends TestBase {
   //Java Script alerts are pop up that show up after you click on button
    //3 types:
    //regular(ok),
    //confirm(ok and cancel),
    // prompt(enter text) and select ok and cancel

    @Test
    public void testJavaScriptAlert(){
    driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //Alert interface from Selenium is used to deal with alerts
        //your driver object can switchTo the alert and take action on it
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        //driver first need to switch to the alert box since it's not part of html
        //using switchTo() method followed by alert() method
        //.alert() method return a type alert from selenium
        //and it has 4 methods
        //accept()  ==> click ok button
        //dismiss()===>click on cancel button
        //sendKeys(yourText)===> Enter text into the prompt

        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        // Alert alertObj= driver.switchTo().alert();
         //   alertObj.accept();

        //todo: click for JS confirm ALERT

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        System.out.println("driver.switchTo().alert() = " + driver.switchTo().alert().getText());
       //  driver.switchTo().alert().dismiss();//this will click on dismiss button on confirmation page
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        //this is how we can a=enter text into prompt
         driver.switchTo().alert().sendKeys("Hello");
         driver.switchTo().alert().accept();//click ok
        System.out.println("end");
    }



}
