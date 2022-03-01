package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingAndSelectingMultiDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

      // TODO: identify  language multi select dropdown
        WebElement langDropDownElm= driver.findElement(By.name("Languages"));

         //TODO:Wrap it using Select class so we can use easy methods
        Select langSelectObj=new Select(langDropDownElm) ;
        //TODO: call all available methods
          System.out.println("langSelectObj.isMultiple() = " + langSelectObj.isMultiple());
         langSelectObj.selectByIndex(2);
         langSelectObj.selectByValue("c");
         langSelectObj.selectByVisibleText("Java");
         //TODO: !!!at this moment 3 options are selected at the same time!!!!

        //NOW DESELECT
        langSelectObj.deselectByIndex(2);
        langSelectObj.deselectByValue("c");
        langSelectObj.deselectByVisibleText("Java");

        //deselect all
        langSelectObj.deselectAll();



    }
}
