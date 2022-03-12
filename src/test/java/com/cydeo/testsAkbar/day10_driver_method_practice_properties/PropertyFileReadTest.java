package com.cydeo.testsAkbar.day10_driver_method_practice_properties;

import com.cydeo.utility.ConfigReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws IOException {
        //todo 1-> open  a connection to the file using FileInputStream object
        FileInputStream in=new FileInputStream("config.properties");

       //todo 2-> create empty Properties Object
        Properties myProperty=new Properties();

        //todo 3=>Load the FileInputStream into Properties Object
        myProperty.load(in);

        //close the connection by calling close method of FileInputStream object
        in.close();

        // todo 4-->now Actually read from the properties file using key
        String helloValue=myProperty.getProperty("hello");


        //read the value of my "message" in config.properties
        System.out.println("myProperty.getProperty(\"message\") = " + myProperty.getProperty("message"));


    }

   @Test
   public void testReadWithTryCatch(){

       try {
           //this throw FileNotFoundException
           FileInputStream in = new FileInputStream("config.properties");
           Properties properties=new Properties();
           properties.load(in);
           //this throw IOException,it's parent of FileNotFoundException
           in.close();

           System.out.println("properties.getProperty(\"hello\") = " + properties.getProperty("hello"));
       } catch (IOException e) {
           e.printStackTrace();
       }








   }

@Test
    public void testReadingUsingUtilityClass(){
    System.out.println("ConfigReader.read(\"weborder_url\") = " + ConfigReader.read("weborder_url"));
    System.out.println("ConfigReader.read(\"weborder_username\") = " + ConfigReader.read("weborder_username"));

}





}
