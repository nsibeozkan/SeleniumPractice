package com.cydeo.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    driver.get("http://practice.cybertekschool.com/forgot_password");
        //locating two element using css selector
        //  TODO:input[name='email']
        //    form input[name='email']
        //   form#forgot_password input[name='email']
        //    #forgot_password input[name='email]

        WebElement emailBox= driver.findElement(By.cssSelector("input[name='email']"));
       emailBox.sendKeys("someone@somewhere.com");
       //     button#form_submit.radius
        //  #form_submit
        // button#form_submit
        //button[id='form_submit'][class='radius']
        Thread.sleep(1000);

         WebElement retrieveButton= driver.findElement(By.cssSelector("button#form_submit.radius"));
          retrieveButton.click();

          Thread.sleep(1000);

          //TODO;   h4[name='confirmation_message']
        //      div > h4[name='confirmation_message']
        //      div#content > h4[name='confirmation_message']--->Parenttan direk childi isaret ediyor
        //identify the success message and print out the text
       String  headerText= driver.findElement(By.cssSelector("h4[name='confirmation_message']")).getText();
        System.out.println(headerText);

        driver.quit();

    }




}
