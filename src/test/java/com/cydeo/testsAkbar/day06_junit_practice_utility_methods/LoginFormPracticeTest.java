package com.cydeo.testsAkbar.day06_junit_practice_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class LoginFormPracticeTest {

    WebDriver driver;

     @BeforeEach
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
}

      @AfterEach
      public void closeBrowser(){
        driver.quit();
}

@Test
    public void  testLogin(){
         driver.get("http://practice.cybertekschool.com/login");
//h2[.='Login Page']
    WebElement header= driver.findElement(By.xpath("//h2[.='Login Page']"));
    System.out.println("header.getText() = " + header.getText());

    //input[@name='username']

    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");

    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");

//wooden_spoon
   driver.findElement(By.id("wooden_spoon")).click();


   // //div[@id='flash']

  //TODO :1.METHOD
   WebElement successMsg= driver.findElement(By.xpath("//div[@id='flash']"));
   String expectedResult="You logged into a secure area!";
   assertTrue(successMsg.getText().startsWith(expectedResult));

      //   //div[ contains (text(),'You logged into a secure area!')]
     //use isDisplay() method to check an element is displayed on the screen
     //it's only used for an element that you have already identified
     System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

     String xpathStr="//div[ contains (text(),'You logged into a secure area!')]";
     WebElement successMsg2= driver.findElement(By.xpath(xpathStr));
     assertTrue(successMsg2.isDisplayed());

}







}
