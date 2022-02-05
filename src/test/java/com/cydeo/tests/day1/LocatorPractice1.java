package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice1 {
    public static void main(String[] args) throws InterruptedException {

         WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://practice.cydeo.com");

        WebElement abTesting=driver.findElement(By.linkText("A/B Testing"));
          abTesting.click();

         String actualTitle= driver.getTitle();
         String expectedTitle="No A/B Test";
     if(actualTitle.equals(expectedTitle)){
         System.out.println("PASS");
     }else{
         System.out.println("FAIL");
     }
       Thread.sleep(3000);
        driver.navigate().back();
        actualTitle= driver.getTitle();
       String expectedTitle2="Practice";

       if(expectedTitle2.equals(actualTitle)){
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
       }






    }




}
