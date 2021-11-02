package com.robar3.mirapolis.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class TestChrome extends LoggedIn{

    @Before
    public void setUpChrome() {
        Configuration.browser = "chrome";
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
    }


    @After
    public void clearCooks(){
        Selenide.clearBrowserCookies();
    }
}
