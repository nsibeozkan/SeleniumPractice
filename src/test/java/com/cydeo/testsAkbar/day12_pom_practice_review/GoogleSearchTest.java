package com.cydeo.testsAkbar.day12_pom_practice_review;

import com.cydeo.pages.GoogleHomePage;
import com.cydeo.pages.GoogleResultPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchTest extends TestBase {

@Test
    public void testGoogleSearch() {
    GoogleHomePage homePage = new GoogleHomePage();
    homePage.goTo();
    //assert you are at the homepage
    assertTrue(homePage.isAt());


      homePage.searchKeyword("SDET JOB");
      BrowserUtil.waitFor(4);


    //assert the title starts with SDET jOB
      assertTrue(driver.getTitle().startsWith("SDET JOB"));
     //todo ikisi de ayni isi yapar because we have protected Webdriver in TestBase class
    // assertTrue(Driver.getDriver().getTitle().startsWith("SDET JOB"));

    GoogleResultPage resultPage =new GoogleResultPage();
    String resultText=resultPage.getResultCountText();
    System.out.println(resultText);

    resultPage.printOfSearchResultLinks();


}




}
