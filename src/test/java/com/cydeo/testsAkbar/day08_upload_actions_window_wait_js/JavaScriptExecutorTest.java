package com.cydeo.testsAkbar.day08_upload_actions_window_wait_js;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorTest extends TestBase {
    //windows.scrollBy (0,1000)


    @Test
    public void testScrollWholeWindow() {
     //navigate to infinite scroll page

       driver.get("http://practice.cybertekschool.com/infinite_scroll");
      //scroll BY 1000 DOWN,no need for left or right scroll
        //get JavaScriptExecutor reference from driver variable
        //so we can run this is js code windows.scrollBy(0,1000)
        //todo
        BrowserUtil.waitFor(5);
        JavascriptExecutor jse=( JavascriptExecutor)driver;
        //it uses  execute method to run javascript, it can accept parameter
        jse.executeScript("window.scrollBy(0,1000)");

        // scrolling once is not obvious lets loop and scroll 10 times and wait 1 secs

        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,1000)");
            BrowserUtil.waitFor(1);
        }

        BrowserUtil.waitFor(5);








    }


    @Test
    public void testScrollElementIntoView() {
        //navigate
        driver.get("http://practice.cybertekschool.com/large");
        JavascriptExecutor jse=  (JavascriptExecutor) driver;
        //locate cybertekSchoolLink and homeLink

      // todo run javascript to scroll the element into the view
        //theElementIdentified.scrollIntoView(true)
        //in order to pass our element into above method
        // we need to use arguments[specify index here]
        //whatever we pass to executeScript method after javascript code will be argument with index
        //



        //try out passing argument in window.scrollBy(0,1000)
        // I want to pass this 1000 externally when  I call the method
        int myScrollNumber=1000;
         jse.executeScript("window.scrollBy(0,arguments[0])",myScrollNumber  );


     //  now call argument[0].scrollIntoView(true)
        WebElement cydeoSchoolLink= driver.findElement(By.linkText("CYDEO"));
        jse.executeScript("arguments[0].scrollIntoView(true)",cydeoSchoolLink);

        BrowserUtil.waitFor(5);

    }
}
