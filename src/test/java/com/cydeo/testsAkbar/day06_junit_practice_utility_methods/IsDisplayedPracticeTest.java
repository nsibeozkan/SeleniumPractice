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

public class IsDisplayedPracticeTest {

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
    public void testErrorMessage(){
        //navigate to the form page
       //identify the error message exists but not displayed
       //enter text "a" and check the error message displayed

        driver.get("http://practice.cybertekschool.com/registration_form");
        //     small[data-bv-for='firstname'][data-bv-validator='stringLength]
       //      //small[.='first name must be more than 2 and less than 64 characters long']

       //this element exists in html but it's hidden not displayed on the screen
       //it will only display when there is an input validation error like less 2 or more.....
       // so isDisplayed method will return false

       String xpathErrorMsg="//small[.= 'first name must be more than 2 and less than 64 characters long']";
       WebElement stringLengthErrorElement= driver.findElement(By.xpath(xpathErrorMsg));
       System.out.println("stringLengthErrorElement.isDisplayed() = " + stringLengthErrorElement.isDisplayed());
        assertTrue(! stringLengthErrorElement.isDisplayed());
        assertFalse(stringLengthErrorElement.isDisplayed());


       //now we are entering something invalid and it is displayed
       //isDisplayed--->true
       WebElement firstNameField= driver.findElement(By.name("firstname"));
       firstNameField.sendKeys("a");
       System.out.println("stringLengthErrorElement.isDisplayed() = " + stringLengthErrorElement.isDisplayed());
         assertTrue(stringLengthErrorElement.isDisplayed());





    }










}
