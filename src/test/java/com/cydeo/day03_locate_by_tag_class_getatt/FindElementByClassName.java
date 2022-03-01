package com.cydeo.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
          //locator classname
        WebElement elm1= driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        //identify  first li element with class name list-group-item
        WebElement firstItem=driver.findElement(By.className("list-group-item"));
        System.out.println("firstItem.getText() = " + firstItem.getText());


        //identify all li elements with class name-group-item;
        List<WebElement> allLiTagElements=driver.findElements(By.className("list-group-item"));
        //get the size()
        System.out.println("allLiTagElements.size() = " + allLiTagElements.size());
        //iterate over all the elements and get the text of each element
        for (WebElement eachLiElement : allLiTagElements) {
            System.out.println("eachLiElement.getText() = " + eachLiElement.getText());

        }


        driver.quit();
    }





}
