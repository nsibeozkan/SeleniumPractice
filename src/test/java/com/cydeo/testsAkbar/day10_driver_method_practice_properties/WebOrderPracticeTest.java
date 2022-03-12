package com.cydeo.testsAkbar.day10_driver_method_practice_properties;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import com.cydeo.utility.TestBase;
import com.cydeo.utility.WebOrderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice() {
        WebOrderUtil.openWebOrderApp();
        //assert the page title "WebOrder Login" to ensure you are at the login page
       // Driver.getDriver().getTitle(); same as below in test
         //driver.getTitle();
         assertEquals("Web Orders Login",driver.getTitle());

         // WebOrderUtil.login();
         WebOrderUtil.login("Tester","test");



    }


    @Test
    public void testInvalidCredentials() {
    WebOrderUtil.openWebOrderApp();
    WebOrderUtil.login("abc","efg");

       //locate error message element
        //with its text and id
       //  xpath===>      //span[@id='ctl00_MainContent_status']
       //   xpath===>       //span[.='Invalid Login or Password.']
       // WebElement errorMsgElm=driver.findElement(By.xpath("//span[.='Invalid Login or Password.']"));
        //assertTrue(errorMsgElm.isDisplayed());

        //   WebDriverWait wait=new WebDriverWait(Driver.getDriver(),2);
         //check of the visibility of the  errorMsgElm in 2 seconds
          //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='uInvalid Login or Password.']")));
         // }catch (TimeoutException e){
           // System.out.println("The error message is= " + e.getMessage());
           // System.out.println("WE DID NOT SEE ERROR MESSAGE ELEMENT");
          // }
         // check for element exists using the browser util we just created

        //boolean elementFound=BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"),2);

        //wrap above code into method inside WebOrderUtil
        //loginErrorMsgVisible method that the return above line
          assertTrue(WebOrderUtil.loginErrorMsgVisible());

    }


    @Test
    public void testClearInputBox() {
    WebOrderUtil.openWebOrderApp();
       WebElement usernameField= driver.findElement(By.id("ctl00_MainContent_username"));
     usernameField.sendKeys("arttyus;lhjkl;'");

       //todo 1. way---->
        // usernameField.clear();//remove anything inside input element
       //todo 2.way-->you can use the action class to COMMAND(CTRL)+A AND PRESS BACKSPACE TO delete
            //Actions actions=new Actions(Driver.getDriver());
           // actions.keyDown(Keys.COMMAND).sendKeys(usernameField,"A").keyUp(Keys.COMMAND)
             //   .sendKeys(Keys.BACK_SPACE).perform();

            //TODO 3.WAY--->
        //You can use javascript code
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value=''",usernameField);



    }



    @Test
    public void demonstratingBrowserCloseIssue(){
        WebOrderUtil.openWebOrderApp();
       // Driver.getDriver().quit();
        Driver.getDriver().get("https://www.google.com");
    }
}
