package com.cydeo.testsAkbar.day08_upload_actions_window_wait_js;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowTest extends TestBase {

    //selenium see window or tab with no difference
    //everything tab is new window for Selenium
    @Test
    public void testWindowOrTab() throws InterruptedException {
        driver.get("http://www.cybertekschool.com/windows");


       //save windowHandle of this tab into currentHandle variable
        String currentHandle=driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        //try to  use  getWindowsHandles() method and print it out
        Set<String> allHandles=driver.getWindowHandles();
        System.out.println("windowHandles.size() = " + allHandles.size());
        System.out.println("allHandles = " + allHandles);

        //click on the click link to generate new tab \window
      //Thread.sleep(2000);
   // WebElement clickHere= driver.findElement(By.xpath("//a[@href='/windows/new']"));
   //  clickHere.click();


    }




}
