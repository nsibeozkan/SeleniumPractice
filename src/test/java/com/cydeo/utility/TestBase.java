package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;
//this class is meant to be super class
//to provide to set up and closing browser
//for it's subclasses
      public abstract class TestBase {
      protected WebDriver driver;
    //setting up all driver stuff here directly in @BeforeEach method

    @BeforeEach
    public void setup(){
      //  WebDriverManager.chromedriver().setup();
       // driver=new ChromeDriver();
       // driver.manage().window().maximize();
       driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
