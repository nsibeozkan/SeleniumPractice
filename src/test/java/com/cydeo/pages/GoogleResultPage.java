package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {

   public GoogleResultPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }


    @FindBy(id="result-stats")
    private WebElement searchResultCount;

   @FindBy(xpath="//h3[@class='LC20lb MBeuO DKV0Md']")
    private List<WebElement> resultLinks;


/**
 * Get the text of result element that contains search result
 * @return the text of search Result Count ELEMENT
 */

  public  String getResultCountText(){
      return searchResultCount.getText();
  }

    /**
     * @return print out the text of all the resulting link
     */


  public void printOfSearchResultLinks(){
      System.out.println(resultLinks.size());

      for (WebElement eachLinkElm : resultLinks) {
          //remove empty text with if statement
          //if(eachLinkElm.getText().isEmpty()){
          //    continue;
          //}
          System.out.println(eachLinkElm.getText());

      }
  }






}
