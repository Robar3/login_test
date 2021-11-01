package com.robar3.mirapolis.pageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthorisationPage {

    private By isLoginPage = By.xpath("//div[contains(text(),'Обучайте, контролируйте результаты')]");
    private By loginField =By.name("user");
    private By passwordField =By.name("password");
    private By loginButton =By.id("button_submit_login_form");


    public void login(String login,String password){
        $(isLoginPage).shouldBe(Condition.visible);
        $(loginButton).shouldBe(Condition.visible);
        $(loginField).sendKeys(login);
        $(passwordField).sendKeys(password);
        $(loginButton).click();
    }
}
