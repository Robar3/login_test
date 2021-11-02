package com.robar3.mirapolis.pageObject;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecoveryPasswordPage {
    private By textEnterTitleAndPassword = By.cssSelector("div[class='forgot-password-label']");
    private By buttonSend = By.cssSelector("button[type=\"submit\"]");


    public void checkRecoveryPage(String correctText){
        String textOnPage = $(textEnterTitleAndPassword).shouldBe(Condition.visible).getText();
        $(buttonSend).shouldBe(Condition.visible);
        Assert.assertEquals(textOnPage, correctText);
    }
}
