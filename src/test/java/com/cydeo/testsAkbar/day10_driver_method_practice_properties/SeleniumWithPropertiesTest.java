package com.cydeo.testsAkbar.day10_driver_method_practice_properties;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import com.cydeo.utility.TestBase;
import com.cydeo.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
   public  void testWebOrderLogin() {
        String url=ConfigReader.read("weborder_url");
        String username=ConfigReader.read("weborder_username");
        String password=ConfigReader.read("weborder_password");
      //navigate by passing value you got from properties file
        Driver.getDriver().get(url);
        //if you want to directly use the returned value instead of saving it
       // Driver.getDriver().get(ConfigReader.read("url"));
        WebOrderUtil.login(username,password);



    }
}
