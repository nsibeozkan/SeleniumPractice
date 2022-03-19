package com.cydeo.testsAkbar.day11_property_driver_faker_pom;

import com.cydeo.pages.WAllOrdersPage;
import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WLoginPage;
import com.cydeo.pages.WOrderPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import com.cydeo.utility.TestBase;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderPOM_Test extends TestBase {


    @Test
  public  void testWithPOM_For_Login() {
      //    Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WLoginPage loginPage=new WLoginPage();
        loginPage.goTo();
        // loginPage.userNameField.sendKeys("Tester");
        // loginPage.passwordField.sendKeys("test");
        //loginPage.loginButton.click();

       // TODO 1 WAY===>
         loginPage.login("abc","test");
        //2.WAY===>
        //loginPage.login(ConfigReader.read("weborder_username"),ConfigReader.read("weborder_password"));

        assertTrue( loginPage.loginErrorMsgPresent());

    }


   @Test
    public void testAllOrderPage(){
        WLoginPage loginPage=new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester","test");
         //here we logged in
        // now we are at all order pages
        WAllOrdersPage allOrdersPage =new WAllOrdersPage();
        //assert the header element is displayed
         assertTrue(allOrdersPage.header.isDisplayed());

         allOrdersPage.checkAllButton.click();
         BrowserUtil.waitFor(2);

         allOrdersPage.unCheckAllButton.click();
         BrowserUtil.waitFor(2);

         //print out the size of headerCells
         System.out.println("allOrdersPage.headerCells.size() = " + allOrdersPage.headerCells.size());
         assertEquals(13,allOrdersPage.headerCells.size());

   }




  @Test
    public void testCommonArea(){
      WLoginPage loginPage=new WLoginPage();
      loginPage.goTo();
      loginPage.login("Tester","test");
      WCommonArea commonArea =new WCommonArea();

      commonArea.orderTab.click();
      BrowserUtil.waitFor(2);

      commonArea.viewAllProductTab.click();
      BrowserUtil.waitFor(2);

      commonArea.viewAllOrderTab.click();
      BrowserUtil.waitFor(2);

      commonArea.logoutLink.click();
      BrowserUtil.waitFor(2);
  }


   @Test
    public void testOrderFlow(){
         WLoginPage loginPage=new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester","test");


        WCommonArea commonArea =new WCommonArea();
        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);

       //place order with information
       WOrderPage orderPage=new WOrderPage();
        Faker faker=new Faker();
       orderPage.quantityBox.sendKeys(Keys.BACK_SPACE+"10");
       orderPage.calculateButton.click();

       orderPage.customerNameBox.sendKeys(faker.name().fullName());
       orderPage.streetBox.sendKeys(faker.address().streetAddress());
       orderPage.cityBox.sendKeys(faker.address().cityName());
       orderPage.stateBox.sendKeys(faker.address().state());
       orderPage.zipBox.sendKeys(faker.numerify("#####"));

        orderPage.visaRadioButton.click();
        orderPage.cardNumber.sendKeys(faker.numerify("##################"));
        orderPage.cardDate.sendKeys(faker.numerify("0#/0#"));

        orderPage.processButton.click();

         assertTrue(orderPage.successMsg.isDisplayed());

   }








}
