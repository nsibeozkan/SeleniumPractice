package com.cydeo.testsAkbar.day09_explicy_wait_singleton_properties;

import com.cydeo.utility.Driver;
import org.junit.jupiter.api.Test;

public class SingletonPractice {
    @Test
    public void testSingleton(){
      //  Singleton s1=new Singleton();
      //  s1.word="abc";


       // Singleton s2=new Singleton();
      //   s2.word="efg";
       Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        /*
        //Object has not been yet,creating one now
        //You already have object,use that existing object
        //You already have object,use that existing object
        //You already have object,use that existing object
        //You already have object,use that existing object
        */


    }




    @Test
    public void testOutDriverUtilityClass(){
        Driver.getDriver().get("https://google.com");
          //Driver.getDriver();
          // Driver.getDriver();
          //Driver.getDriver();
    }
}
