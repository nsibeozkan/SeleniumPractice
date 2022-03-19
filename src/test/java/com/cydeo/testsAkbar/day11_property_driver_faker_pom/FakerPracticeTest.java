package com.cydeo.testsAkbar.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest {

    @Test
   public  void testPrintFakeData() {
        Faker faker=new Faker();
     //todo  syntax==>   faker.YourCategory.WhateverAvailable();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

      //fake book title
        System.out.println("faker.book().title() = " + faker.book().title());
        
           //fake phone number
        System.out.println("faker.phoneNumber().cellPhone() = " + faker.phoneNumber().cellPhone());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

      //what if you want random numbers in  specific format like phone number
        System.out.println("faker.bothify(\"###-###=####\") = " + faker.bothify("###-###=####"));


        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());


    }
}
