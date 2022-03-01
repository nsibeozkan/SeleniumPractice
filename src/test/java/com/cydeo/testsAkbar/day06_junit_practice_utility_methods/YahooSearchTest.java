package com.cydeo.testsAkbar.day06_junit_practice_utility_methods;

import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchTest extends TestBase {

@Test
    public void testYahooSearchHomePage(){
    driver.get("https://search.yahoo.com");
        String expectedTitle="Yahoo Search - Web Search";
        String actualTitle= driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
     }


@Test
    public void testYahooSearchResultPage(){
    driver.get("https://search.yahoo.com");
    driver.findElement(By.name("p")).sendKeys("selenium"+ Keys.ENTER);
    //assert title start with "selenium"

     assertTrue(driver.getTitle().startsWith("selenium"));
}





}
