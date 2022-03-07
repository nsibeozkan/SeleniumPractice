package com.cydeo.testsAkbar.day09_explicy_wait_singleton_properties;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import com.cydeo.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest extends TestBase {

    @Test
   public  void testLogin() {
      driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
/*
       //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       //enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //click login button
       driver.findElement(By.id("ctl00_MainContent_login_button")).click();
*/
        WebOrderUtility.login(driver);
        BrowserUtil.waitFor(3);


        //todo create a class called WebOrderUtility
        //create a static void method to login(username,password) accept  2 string for username password
    }
}
