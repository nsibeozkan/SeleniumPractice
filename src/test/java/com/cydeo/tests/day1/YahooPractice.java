package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.yahoo.com");
       String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

         String currentTitle= driver.getTitle();
        System.out.println(currentTitle);

        if(currentTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        driver.close();
        driver.quit();


    }



}
