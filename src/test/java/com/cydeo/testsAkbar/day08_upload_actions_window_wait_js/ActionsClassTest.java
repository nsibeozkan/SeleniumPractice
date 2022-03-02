package com.cydeo.testsAkbar.day08_upload_actions_window_wait_js;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ActionsClassTest extends TestBase {


    @Test
    public void testHoverAction() {
        // //img[]
        //====>  (//div[@class='figure']/img)[1]
        driver.get("http://practice.cybertekschool.com/hovers");
        //locate first image and hover over to the image and verify User Profile 1 displayed
        WebElement img1Elm= driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        //todo create instance of Actions class by passing driver object
        //its coming from here import org.openqa.selenium.interactions.Actions;

        Actions actions=new Actions(driver);
        actions.moveToElement(img1Elm).perform();
        BrowserUtil.waitFor(3);

      //verify  user profile  1 displayed with text
        WebElement firstProfileElm= driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue(firstProfileElm.isDisplayed());

        // second profile
        WebElement img2Elm= driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
       actions.moveToElement(img2Elm).perform();
        BrowserUtil.waitFor(3);

      //  WebElement secondProfileElm= driver.findElement(By.xpath("//h5[.='name: user2']"));
       // assertTrue(secondProfileElm.isDisplayed());

        //perform these action in sequence
        //hover over to 1st image,pause second,then second image pause 2 second
        //then hover over to 1 st image again,pause 2 second tehn second image pause 2 second

          actions.moveToElement(img1Elm).pause(2000)
                  .moveToElement(img2Elm).pause(2000)
                   .moveToElement(img1Elm).pause(2000)
                    .moveToElement(img2Elm).pause(2000)
                     .perform();

          //todo  homework==> get a List<WebElement> containing those 3 images.iterate over the list to hover over and verify the title
/* //solution(mine)
        List<WebElement> userProfiles=driver.findElements(By.xpath("//div[@id='content']"));
        List<String> textOfProfile=new ArrayList<>();
        for (WebElement profile : userProfiles) {
            Actions action1=new Actions(driver);
            actions.moveToElement(profile).perform();}
*/




    }


    @Test
    public void testDragAndDrop() {
       driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");


    }
}


