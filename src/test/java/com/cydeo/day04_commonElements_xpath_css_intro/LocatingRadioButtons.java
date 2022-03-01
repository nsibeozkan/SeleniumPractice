package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButtons {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
   //radio button can be checked and usually come in group
        //That's only attribute special about the element
        //We can use additional method called isSelected() to determine if it's checked.
        //
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        //blue radiobutton
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());//nothing will happen because its already selected
       blueRadio.click();//nothing will happen because its already selected

       WebElement redButton= driver.findElement(By.id("red"));
        System.out.println(" before click redButton.isSelected() = " + redButton.isSelected());

        Thread.sleep(3000);

        redButton.click();//this will click to check radio button
        System.out.println(" after Click redButton.isSelected() = " + redButton.isSelected());

        System.out.println(" after red click blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement greenRadio = driver.findElement(By.id("green"));
        greenRadio.click();//nothing will happen because it is disabled
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());

        //Any element can use isEnable() method to check whether element is disabled or not
        //one can not take any action on disable element
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        List<WebElement> allColorRadios = driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());

        //click on the third radio button;
        allColorRadios.get(2).click();

        //loop over all the elements to print there:id  attribute, isSelected,isDisabled
        //allRadioRadios.iter and hi enter and  give a name each
        for (WebElement eachColorRadio : allColorRadios) {
            System.out.println("eachColorRadio.getAttribute(\"id\") = " + eachColorRadio.getAttribute("id"));
            System.out.println("eachColorRadio.isSelected() = " + eachColorRadio.isSelected());
            System.out.println("eachColorRadio.isEnabled() = " + eachColorRadio.isEnabled());
            System.out.println("=========================");
        }

        driver.quit();

    }


}
