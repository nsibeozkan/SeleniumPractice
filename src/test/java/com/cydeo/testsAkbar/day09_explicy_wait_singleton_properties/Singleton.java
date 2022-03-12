package com.cydeo.testsAkbar.day09_explicy_wait_singleton_properties;

import org.junit.jupiter.api.Test;
//todo   we want this class to generate one object
//   we want to block creation of more than one object
/*
*Singleton is a design pattern to have a class only generate one object
* In order to achieve Singleton pattern
* 1.private Constructor
* 2.private static field with data type same as class
* 3.public getter method for private field
*      to check if you have already created object
*       if not---->create object for the first time
*       if yes--->just use existing object




*/
public class Singleton {
   // static String word="my only value";
     //variable obj
     private  static Singleton obj;

     private Singleton(){
      }

   public static Singleton getObj(){
          //if obj was not give value
        //the create object and give value
          if(obj==null){
               System.out.println("Object has not been yet,creating one now");
               obj=new Singleton();
          return obj;
    }else{
               System.out.println("You already have object,use that existing object");
               return obj;
          }

     }




}
