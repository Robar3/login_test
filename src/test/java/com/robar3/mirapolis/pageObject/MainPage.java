package com.robar3.mirapolis.pageObject;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private By loginFromElenaFomina =  By.cssSelector("div[class=\"avatar-full-name\"]");


    public void loggedAsElena(String realUserName){
       String userName = $(loginFromElenaFomina).shouldBe(Condition.visible).getText();
        Assert.assertEquals(userName,realUserName);
    }

}
