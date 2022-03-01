package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDownList {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

  driver.get("http://practice.cybertekschool.com/dropdown");
       //TODO:identify  the YEAR  dropdown
        WebElement yearDropDownElm= driver.findElement(By.id("year"));

       //TODO:Wrap it using Select class so we can use easy methods
        Select yearSelectObj = new Select(yearDropDownElm);
        //TODO: SELECT items in 3 different types
        //TODO:select  3rd item
        yearSelectObj.selectByIndex(2);
        Thread.sleep(2000);
         //TODO:Select item with value attribute 2019
        yearSelectObj.selectByValue("2000");
        //Select item with visible Text 1990
        Thread.sleep(2000);
        yearSelectObj.selectByVisibleText("1990");
        Thread.sleep(2000);
        //it will throw exception if you have wrong option
        //yearSelectObj.selectByVisibleText("Bla Bla");

          //TODO:identify  the month  dropdown
          WebElement monthDropDownElm=driver.findElement(By.id("month"));

          //TODO:Wrap it using Select class so we can use easy methods
          Select monthSelectObj =new Select(monthDropDownElm);

           //TODO: SELECT items in 3 different types
            //select 4rd item
          monthSelectObj.selectByIndex(4);
          Thread.sleep(1000);
          monthSelectObj.selectByValue("7");
        Thread.sleep(1000);
          monthSelectObj.selectByVisibleText("December");
        Thread.sleep(1000);

driver.quit();


    }




}
