package com.cydeo.testsAkbar.day08_upload_actions_window_wait_js;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
         BrowserUtil.waitFor(2);

         WebElement smallCircle=driver.findElement(By.id("draggable"));
         WebElement biggerCircle=driver.findElement(By.id("droptarget"));
         //todo dragAndDrop method of Actions class,accept 2 webElement and drop first one into second one
         Actions actions=new Actions(driver);
         actions.dragAndDrop(smallCircle,biggerCircle).perform();
        BrowserUtil.waitFor(2);
        //verify the big circle text has changed to "you did great it";


        assertEquals("You did great!",biggerCircle.getText());


    }

    //as long as you can hold down to SHIFT and type smthing
    //then release the shift and perform the action
    //that's all we need
         @Test
    public void testKeyboardAction(){
       //navigate to google.com
             //hold down shift enter text"I love selenium"
             //release the shift
             //enter text "I love Selenium"
             //hold down the command on mac control on windows and enter "A"
             //RELEASE THE COMMAND OR CONTROL
             //then hit backspace to delete
      driver.get("https://www.google.com");
         //locate searchBox using name value"q"
           WebElement searchBox= driver.findElement(By.name("q"));
           //CREATE ACTIONS object
             Actions actions=new Actions(driver);
             //KEYDOWN METHOD FOR HOLDING down to certain modifier key like control ,SHIFT AND so
//keyup method for releasing what you are holding down to
             //Sendkeys method of Actions Class is for pressing key that provided
             //pause method of Actions class is for pausing in between actions in milliseconds

            //THIS IS MORE THAN ENOUGH
          /*   actions.keyDown(Keys.SHIFT).sendKeys("i love Selenium")
                     .pause(2000).keyUp(Keys.SHIFT)
                     .sendKeys(" i love selenium").pause(2000)
                     .keyDown(Keys.COMMAND).sendKeys("A").perform();
*/



         actions.keyDown(Keys.SHIFT).sendKeys("i love Selenium")
        .pause(2000).keyUp(Keys.SHIFT)
        .sendKeys(" i love selenium").pause(2000)
        .keyDown(Keys.COMMAND).sendKeys("A")//todo command +A om mac will select all text
        // .keyDown(Keys.CONTROL).sendKeys("A")//control+a windows will select all text.keyUp(Keys.COMMAND).pause(2000)
        .sendKeys(Keys.BACK_SPACE)

        .perform();




    }
         @Test
       public void testDoubleClick(){
       //navigate "https://www.w3schools.com/jsref/tryit.asp?filename=trjisref_ondblclick
      //double click on paragraph
           //then assert the new paragraph with text"Hello world " displayed right under
      driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
     BrowserUtil.waitFor(2);
      //both of the elements are under iframe with id "iframeResult",so switch to into frame
             driver.switchTo().frame("iframeResult");
             WebElement pElm1= driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
          Actions actions=new Actions(driver);
          actions.doubleClick(pElm1).perform();//this is how to double click
           BrowserUtil.waitFor(2);

      //todo :go ahead and assert the hello world showed up
             WebElement  afterClickMessage= driver.findElement(By.xpath("//p[.='Hello World']"));

             System.out.println("afterClickMessage.getText() = " + afterClickMessage.getText());
             assertEquals("Hello World",afterClickMessage.getText());

       }


    @Test
     public void testRightClick() {
     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        //locate the yellow  area// css selector= div[oncontextmenu='myFunction()']
       //first we have iframe
        driver.switchTo().frame("iframeResult");
        WebElement yellowArea= driver.findElement(By.cssSelector("div[oncontextmenu='myFunction()']"));

        //right=click on that area usiNG ACTIONS class method
        //Todo right click means "ContentClick"
         Actions actions=new Actions(driver);
         actions.contextClick(yellowArea).perform();
         BrowserUtil.waitFor(2);

        //close alert that showed up after
         driver.switchTo().alert().accept();
        BrowserUtil.waitFor(1);









    }





}


