package com.cydeo.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsAttributes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/");
        //get the first link on the page and href attribute
        WebElement firstLink= driver.findElement(By.linkText("A/B Testing"));
        System.out.println("firstLink.getText() = " + firstLink.getText());


        //get href Attribute

        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

  //navigate to google.com and identify the search box and  get some attribute values
        driver.navigate().to("https://www.google.com");

        //identify searcbox
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        System.out.println("searchBox.getAttribute(\"title\") = " + searchBox.getAttribute("title"));
        System.out.println("searchBox.getAttribute(\"type\") = " + searchBox.getAttribute("type"));
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));


        //using value attribute of input text box to extract the text inside
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));


        //identify google search button
        WebElement googleSearch= driver.findElement(By.name("btnK"));
        System.out.println("googleSearch.getAttribute(\"value\") = " + googleSearch.getAttribute("value"));
        System.out.println("googleSearch.getAttribute(\"type\") = " + googleSearch.getAttribute("type"));
        System.out.println("googleSearch.getAttribute(\"class\") = " + googleSearch.getAttribute("class"));
        driver.quit();
    }



}
