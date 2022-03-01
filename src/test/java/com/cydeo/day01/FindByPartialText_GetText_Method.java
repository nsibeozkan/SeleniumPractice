package com.cydeo.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetText_Method {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/");
        //identify the link using partial link Text then get the full text out
        String abText=driver.findElement(By.linkText("Disappearing Elements")).getText();
        System.out.println(abText);

        WebElement alink= driver.findElement(By.partialLinkText("A"));
        System.out.println("alink.getText() = " + alink.getText());


        driver.quit();

    }


}
