package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

         driver.navigate().back();
         Thread.sleep(3000);

         driver.navigate().forward();
          Thread.sleep(3000);

          driver.navigate().refresh();
          Thread.sleep(3000);


        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        String title= driver.getTitle();
        System.out.println("title = " + title);

        driver.quit();



    }
}
