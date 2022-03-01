package com.cydeo.testsAkbar.day07_iframe;

import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest  extends TestBase {

    @Test
     public void testSimpleIFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

        //locate the<p. element inside iframe
        //first we need to switch to the iframe
        //todo===> by index
         //index starts "0" in here because it is java methods
        // 1===>way===>  driver.switchTo().frame(0);
         //todo 2.way---> by name or id
          //2.way===> driver.switchTo().frame("mce_0_ifr");

        //todo: 3 way==>by passing iframe WebElement object;
        //locate the iframe element by it's title value using xpath
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
        //we use css selector * it contains "text"  ^===> for starts with
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title^='Rich']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title*='Text']")));

        WebElement pTagInsideFrame= driver.findElement(By.tagName("p"));
        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());


        //click on the Home link on top of element
        //todo 2 way to get out of frame
        //todo first=>jump one level out of frame
       //todo 1.way===> driver.switchTo().parentFrame();


         //todo second==> jump main parent frame
        // 2.way===>driver.switchTo().defaultContent();
          driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();

        



    }



}
