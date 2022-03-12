package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderUtil {

    // create a method to openWebOrderApp

  // simply navigate to WebOrderApp

    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }


    public static void login(){

        //enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //click login button
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(String username,String password ){

        //enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        //enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        //click login button
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

//check for login error message is visible or not ,by calling the BrowserUtil method we created
// return true  if error message displayed,false if not
public static boolean loginErrorMsgVisible(){
    boolean elementFound=    BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"),2);

    return elementFound;
   }





}
