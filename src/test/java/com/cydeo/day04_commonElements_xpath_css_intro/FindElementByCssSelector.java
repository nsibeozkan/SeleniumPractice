package com.cydeo.day04_commonElements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https:search.yahoo.com/");

        //TODO:Identify search box using css selector
        //try different way, by id,by name
        //WebElement searhBox= driver.findElement(By.cssSelector("#yschsp"));
       // WebElement searchBox= driver.findElement(By.cssSelector("input[name='p']"));
           WebElement searchBox= driver.findElement(By.cssSelector("input[id='yschsp']"));
       // WebElement searchBox= driver.findElement(By.cssSelector("input[name='p'][type='text']"));

        Thread.sleep(1000);
        searchBox.sendKeys("CSS Selector");
        Thread.sleep(1000);

        /* kullandigimiz html kod parent bilgilerini kullanarak x button locate ediyoruz.
        <button id="sbq-clear" type="button" class="sbq-x">
        <span class="sprite"></span>//x button attributelari az oldugu icin family attr kullaniyoruz
        </button>
         */
        // the x icon

        WebElement clearButton= driver.findElement(By.cssSelector("button#sbq-clear>span"));
          clearButton.click();
        Thread.sleep(1000);

        searchBox.sendKeys("XPATH");
        Thread.sleep(1000);

       //identify search icon  using csss
        /*
        <span role="button" title="Search" class="ico-syc mag-glass"></span>
         */

         WebElement searchIcon= driver.findElement(By.cssSelector("span[title='Search']"));
        Thread.sleep(1000);
         searchIcon.click();


driver.quit();

    }

}
