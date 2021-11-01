package com.robar3.mirapolis.pageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private By loginFromElenaFomina =  By.cssSelector("div[title='Фомина Елена Сергеевна']");

    public void loggedAsElena(){
        $(loginFromElenaFomina).shouldBe(Condition.visible);
    }
}
