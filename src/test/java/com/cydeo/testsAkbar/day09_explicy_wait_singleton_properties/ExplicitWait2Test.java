package com.cydeo.testsAkbar.day09_explicy_wait_singleton_properties;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWait2Test extends TestBase {


    @Test
   public  void testWaitUntilElementIntractable() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //elementToBeClickable(By locator)
        // elementToBeClickable(WebElement element)
        //an expectation for checking an element is visible and enabled such that you can click it
      // click on enable button and wait until the  input box is enabled(clickable)

         WebElement inputField= driver.findElement(By.cssSelector("form#input-example >input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        driver.findElement(By.xpath("//button[.='Enable']")).click();
        WebDriverWait wait=new WebDriverWait(driver,7);
          //this will  wait for 7 second max for input element located by css selector
        //enable,interactive,visible

          wait.until(elementToBeClickable(inputField));
          // enter something into the input filed
         inputField.sendKeys("Hello World");
        BrowserUtil.waitFor(5);


    }
}
