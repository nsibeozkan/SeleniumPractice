package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

    private static WebDriver obj;
    /**
    *return obj with only one Webdriver instance
    *same Webdriver if exists,new one if null
     */
    public static WebDriver getDriver(){
        //read the browser type you want to launch from properties file
        String browserName=ConfigReader.read("browser");
        if(obj==null){
            //according to browser type set up driver correctly

            switch (browserName) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj=new FirefoxDriver();
                    break;
                default:
                    obj=null;
                    System.out.println("UNKNOWN BROWSER TYPE!!!"+browserName);
            }
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
