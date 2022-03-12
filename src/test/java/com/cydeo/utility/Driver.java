package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){}

    private static WebDriver obj;
    /**
    *return obj with only one Webdriver instance
    *same Webdriver if exists,new one if null
     */
    public static WebDriver getDriver(){
        if(obj==null){
            WebDriverManager.chromedriver().setup();
            obj=new ChromeDriver();

           // System.out.println("one and only created for the first time");
            return obj;
        }else{
          //  System.out.println("you have it just use existing one");
            return obj;
        }
    }

/**
 * check if we have webdriver instance or not
 * basically checking if obj is null or not
 * if not null
 * quit browser
 * make it null ,because once quit it can not be use
 */
 //todo quiting the browser and setting the value of
//WebDriver instance to null because you can not re-use already quited driver

     public static void closeBrowser(){

         if(obj!=null){
           obj.quit();
            obj=null;//so when ask for it again,it gives us not quited fresh driver
        }
     }





}
