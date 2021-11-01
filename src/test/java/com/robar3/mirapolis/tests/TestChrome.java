package com.robar3.mirapolis.tests;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class TestChrome extends LoggedIn{

    @BeforeClass
    public static void setUpOpera() {
        Configuration.browser = "chrome";
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
    }
}
