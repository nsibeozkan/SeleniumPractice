package com.cydeo.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
       //get all the links  that have partial text A in it
        List<WebElement>  allLinks= driver.findElements(By.partialLinkText("A"));
        System.out.println(allLinks);
        //GET THE SIZE OF THIS LIST SO WE KNOW HOW MANY LINK WITH PARTIAL TEXT A
        System.out.println("allLink.size() = " + allLinks.size());

        //get the third item and get the text
         WebElement thirdItem=allLinks.get(3);
        System.out.println("firstItem.getText() = " + thirdItem.getText());

        //iterate over whole list and print out the text
        for (WebElement eachElement : allLinks) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }




        //close the browser
        driver.quit();

    }
}
