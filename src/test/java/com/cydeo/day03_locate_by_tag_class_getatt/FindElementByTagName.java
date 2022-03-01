package com.cydeo.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
         driver.get("http://practice.cybertekschool.com/");
       //identfy first element with tag name "a"
        WebElement firstElement= driver.findElement(By.tagName("a"));
        String value=firstElement.getText();
        System.out.println("value = " + value);
        List<WebElement> allATagElements=driver.findElements(By.tagName("a"));
        System.out.println("allATagElements.size() = " + allATagElements.size());

        String thirdElement= allATagElements.get(3).getText();
        System.out.println("thirdElement = " + thirdElement);

        //iterate over this list ,get the text of the link and get attribute and print them out
        for (WebElement aTagElement : allATagElements) {
            System.out.println("aTagElement.getText() = " + aTagElement.getText());
            System.out.println("aTagElement.getAttribute(\"href\") = " + aTagElement.getAttribute("href"));
        }

       //get first element with<h1> tag and get the text out of it(
        // you can use span for this task because child element that hold same text
          WebElement header= driver.findElement(By.tagName("h1"));
         System.out.println("header.getText() = " + header.getText());


    }




}
