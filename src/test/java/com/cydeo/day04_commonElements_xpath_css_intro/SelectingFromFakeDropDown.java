package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        //the only way that Select class we learned work is,if the element tag is select
        //identify the fake dropdown ,its actually a link
        WebElement fakeDropDownElm= driver.findElement(By.id("dropdownMenuLink"));
        fakeDropDownElm.click();
        // and "select"  the option ====its actually another link
        //identify option Google and click on it
          driver.findElement(By.linkText("Google")).click();





    }
}
