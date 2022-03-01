package com.cydeo.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement googleSearch= driver.findElement(By.name("q"));
        googleSearch.sendKeys("selenium"+ Keys.ENTER);

        System.out.println("driver.findElement(By.className(\"Wt5Tfe\")).getText() = "
                + driver.findElement(By.className("Wt5Tfe")).getText());

    }
}
