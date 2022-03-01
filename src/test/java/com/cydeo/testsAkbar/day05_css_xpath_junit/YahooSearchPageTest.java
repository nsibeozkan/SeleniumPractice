package com.cydeo.testsAkbar.day05_css_xpath_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {
    WebDriver driver;
    @BeforeAll
   public  static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

@BeforeEach
public void setUpWebDriver(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://search.yahoo.com/");
}



@Test
    public void testYahooSearchPageTitle(){
    //test YAHOO SEARCH HOMEPAGE
   // title:"Yahoo Search - Web Search"

    String expectedTitle="Yahoo Search - Web Search";
     String actualTitle=driver.getTitle();

       //quit driver here, because we already saved the title
        // driver.quit();

         //do static import, so you can do this
        //import static org.junit.jupiter.api.Assertions.*;
        assertEquals(expectedTitle,actualTitle);


}
   @Test
   public void testYahooSearchResultPageTitle(){

        //IDENTIFY searchBox and selenium  and hit enter
     driver.findElement(By.xpath("//div[@id='sbq-wrap']/input")).sendKeys("Selenium"+ Keys.ENTER);

   // String expectedTitleStartWith="Selenium";
    String actualTitle= driver.getTitle();


    assertTrue(actualTitle.startsWith("Selenium"));





   }

@AfterEach
    public void closeBrowser(){
        driver.quit();
}

@AfterAll
    public static void tearDown(){
    System.out.println("@AfterAll ,nothing to do here");
}






}
