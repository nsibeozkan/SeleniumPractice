package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id="ctl00_MainContent_username")
    public WebElement userNameField;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(css="#ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath="//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;


//now  we need instruct selenium to start looking for element
    //when this constructor is called

    //THIS IS NO ARG CONSTRUCTOR OF THIS CLASS
     public WLoginPage(){
         //PageFactory is a selenium class that support Page Object model
         //and it has method called initElements
         //nce it's called ,it will locate all the element
         //specified using @FindBy annotation with locator
         //initElement accept 2 arguments
         //WebDriver instance and Page class instance(this)means current instance of this class
         PageFactory.initElements(Driver.getDriver(),this);
     }


    /**
     * Create a method to goTo
     * accept no param just navigate to login page
     * use config.properties for url
      */

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("weborder_url"));
    }

    public void login(String username,String password){
        // you can access directly using userNameField or this.
        this.userNameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
    }

/**
 * Check error message is present if wrong credentials provided
 * LoginErrorMessage method simple return the result of isDisplayed method call
 *
 */

    public boolean loginErrorMsgPresent(){
      return  this.errorMsg.isDisplayed();
    }



}
