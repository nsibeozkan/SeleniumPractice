package com.cydeo.testsAkbar.day12_pom_practice_review;

import com.cydeo.pages.LibLoginPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LibraryTest extends TestBase {


    @Test
     public void testLogin() {
        LibLoginPage loginPage =new LibLoginPage();
        loginPage.goTo();
        loginPage.login("librarian52@library","Sdet2022*");
        BrowserUtil.waitFor(3);
    }







}
