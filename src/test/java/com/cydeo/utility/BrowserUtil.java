package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {
    //A method to pause the thread certain seconds
    //@param seconds

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    //todo this method will check for visibility of  element  the given time
    // locator ==>by.id or by.xpath or by.whatever
    //second ===>to toe wait
    //return true if the element is found within the time and visible,false if not
    //todo METHOD

         public static boolean checkVisibilityOfElement(By locator , int timeToWait){
         boolean result=false;
         WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWait);

          try {
              wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
              //IF ABOVE LINE does not throw exception we will come to this line and below
          result=true;
          }catch (TimeoutException e){
               // System.out.println("The error message is= " + e.getMessage());
               System.out.println("WE DID NOT SEE ERROR MESSAGE ELEMENT");
          }
          return result;
         }






}
