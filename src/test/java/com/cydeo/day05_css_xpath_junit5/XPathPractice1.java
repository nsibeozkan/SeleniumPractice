package com.cydeo.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate 2 elements using xpath selector
        //  todo; second way===>     //h2[.='Forgot Password']

        WebElement forgetPasswordHeader= driver.findElement(By.xpath("//div[@id='content']/div/h2"));
        System.out.println("forgetPasswordHeader.getText() = " + forgetPasswordHeader.getText());


            WebElement emailBox= driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
           emailBox.sendKeys("someone@somewhere.com");
           //todo: second way===> //button[@id='form_submit' and @class='radius']

           WebElement retrieveBtn= driver.findElement(By.xpath("//button[@id='form_submit']/i"));
             retrieveBtn.click();

            //use xpath to  identify confirmation message
            //Your e-mail's been sent!
            //1.way===> //h4[@name='confirmation_message']
            //2,way===>  ////h4[text()="Your e-mail's been sent!"]
            //3 way===> //h4[@name='confirmation_message' and  text()="Your e-mail's been sent!"]





         //todo second way===> //h4[@name='confirmation_message' and text()='Your e-mail's been sent!']
        // WebElement confirmationMessage=driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        WebElement confirmationMessage=driver.findElement(By.xpath("//h4[@name='confirmation_message' and  text()=\"Your e-mail's been sent!\"]"));





         // WebElement confirmationMessage=driver.findElement(By.xpath("//div[@id='content']/h4"));
        // WebElement confirmationMessage=driver.findElement(By.cssSelector("div#content h4"));

          //todo xpath uses with   "start-with" or contains
         // WebElement confirmationMessage=driver.findElement(By.xpath("//h4[starts-with(@name,'con')]"));
         //  WebElement confirmationMessage=driver.findElement(By.xpath("//h4[contains(@name,'confir')]"));

        System.out.println("confirmationMessage.getText() = " + confirmationMessage.getText());


    }

}
