package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;
//this class is meant to be super class
//to provide to set up and closing browser
//for it's subclasses
//now you can try to replace driver with
//todo Driver.getDriver() so it can be same driver everywhere whenever you use

      public abstract class TestBase {
         protected WebDriver driver;
    //setting up all driver stuff here directly in @BeforeEach method

           @BeforeEach
         public void setupWebDriver(){
      //  WebDriverManager.chromedriver().setup();
       // driver=new ChromeDriver();
       // driver.manage().window().maximize();
       //  driver= WebDriverFactory.getDriver("chrome");
         //todo ayni driver kullanmak icin Singletonla uretigimiz driveri buraya assign ettik
         driver=Driver.getDriver();//Driver classi buraya assign ettik
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser(){
        //quit browser +make it null, so we can get new one when ask for it again
        Driver.closeBrowser();
    }
}
