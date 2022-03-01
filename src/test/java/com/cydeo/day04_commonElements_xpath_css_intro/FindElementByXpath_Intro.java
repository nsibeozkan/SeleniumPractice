package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXpath_Intro {
    public static void main(String[] args) {
        //inspect element--> right click-->copy--> copy full xpath
        // html/body/div/div[2]/div/div/div/h1/span
        // xpath can be used to navigate through elements and attributes in a html document
        // This known as absolute
        //starting from root element(html) till the element you ara looking for
        //using above full xpath to identify the element and get the text

        // TODO:RELATIVE XPATH;

        //     //h1/span---this is known as relative xpath, it starts with double forward slash"//"


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
       //using above full(absolute) xpath to identify the element and get the text
        WebElement headerSpan= driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        // ToDO: USE RELATIVE PATH
        //    //h1/span : start looking for the element with h1 whoever parents or grandparents are
     //find direct child with span tag
      WebElement headerSpan2= driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());


        //providing attributes in xpath
        //elementTag[@attributeName='attribute value']
        //if you have more than one
        //elementTag[@attributeName='attribute value' and @attribute2Name='attribute2 value']
        // TODO   //input[@name='checkbox1'and @type ='checkbox']
            //click on checkboxes link to go to checkbox page using xpath
           driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

           //identify header ,1 st checkbox using xpath
        WebElement header= driver.findElement(By.xpath("//h3[text()='Checkboxes']"));

        System.out.println("header.getText() = " + header.getText());


        WebElement firstCheckbox= driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("firstCheckbox.isSelected() = " + firstCheckbox.isSelected());


        //TODO: ONEMLI!!! PARENT KULLANARAK TANIMLADIM CHILDAN INDEXINI VERDIM
     //WebElement checkBoxes=driver.findElement(By.xpath("//ul[@ class='list-group']/li[7]"));
        //System.out.println("checkBoxes.getText() = " + checkBoxes.getText());
        //checkBoxes.click();

        //you have option to provide index
        //  //someElement[indexGoesHere]
        // you can also provide use text()xpath function
        //TODO;  //elementTag[text()='text value goes in it']
//h3              //h3[text()='Checkboxes']
        // TODO//  //*[@id='box1']


        driver.quit();

    }
}
