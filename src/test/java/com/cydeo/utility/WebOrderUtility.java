package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {


    public static void login(WebDriver driverParam){

        //enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //click login button
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driverParam,String userName,String password){

        //enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        //enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);

        //click login button
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

     public static void logout(WebDriver driverParam){
        //logout link has id
         driverParam.findElement(By.id("ctl00_logout")).click();

     }


     public static boolean isAtOrderPage(WebDriver driverParam){
         boolean result=false;
         //locator for the header element of all order page
          ////h2[normalize-space(.)='List of All Orders']
         try{
         WebElement header=driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
             System.out.println("ELEMENT WAS IDENTIFIED");
             System.out.println("header.isDisplayed() = " + header.isDisplayed());
             result= true;
         }catch (NoSuchElementException e){
             System.out.println("NO SUCH ELEMENT! you are not at the right page");
         }
        return result;
         //  System.out.println("header.isDisplayed() = " + header.isDisplayed());
      }

      //so now we have Driver class that generate Single WebDRiver instance
      // we can use it anywhere here in this method
       //without passing the WebDriver as parameter


    }