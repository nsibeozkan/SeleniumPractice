package com.cydeo.testsAkbar.day09_explicy_wait_singleton_properties;

import com.cydeo.utility.TestBase;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWaitTest  extends TestBase {

    @Test
    public void testWaitForTitle() {
      //navigate "http://practice.cybertekschool.com/dynamic_loading"
      driver.get("http://practice.cybertekschool.com/dynamic_loading");

        // click example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        // todo the title will show loading... until certain time
        WebDriverWait wait= new WebDriverWait(driver,6);



        //then we use until method that accept expected conditions
        //ExpectedConditions helper class has a lot of pre_written condition for common scenarios so we don't have t build our own
          //todo first example for explicitWait
         //wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //try different as below
        //wait until the spongebob image visible on screen
        //visibilityOfElementLocated accept locator as parameter
        //so this means wait 6 max until the element located by tagName ("img")
        // is visible on the screen
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));
        // todo we did static import as below so per code can be shorter
        //import static org.openqa.selenium.support.ui.ExpectedConditions.*;
        //todo second way of wait until methods
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));






        System.out.println("END");



    }

    @Test
  public void testByTextToBe() {

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        //click example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait= new WebDriverWait(driver,6);
        WebElement alertArea= driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());
        // wait for the image show up
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));
        // here we had to re-locate the element because
        //the attributes has changed (colors and stuff) ,driver can not find it anymore
        //element is not in the dom any more error.
        //if you dont assign it gives staleElementReference exception
        alertArea= driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());
        //the warning area initially has text of this page is slow wait for 5 seconds
        //after it load the text of that area become Done!
        //This is one of the ExpectedConditions we can use for waiting
       //  wait.until(visibilityOf(driver.findElement(By.xpath("//strong[.='Done!']"))));
    }
}
