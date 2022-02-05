package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoUrl {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        String currentURL= driver.getCurrentUrl();
        System.out.println(currentURL);

         if(currentURL.contains("cydeo")){
             System.out.println("Test Passed");

         }else{
             System.out.println("Test Failed");
         }

       String currentTitle=driver.getTitle();

         if(currentTitle.equalsIgnoreCase("Practice")){
             System.out.println("PASSED");
         }else{
             System.out.println("FAILED");
         }

    driver.close();


    }




}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 */