package com.robar3.mirapolis.pageObject;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class AuthorisationPage {

    private By fieldWithTextOnLoginPage = By.cssSelector("div[class=\"mira-page-login-right-side-content-user-info\"]");
    private By loginField =By.name("user");
    private By passwordField =By.name("password");
    private By loginButton =By.id("button_submit_login_form");
    private By forgotPasswordButton = By.cssSelector("a[class='mira-default-login-page-link']");
    private By showPasswordButton = By.id("show_password");
    private By unVisiblePassword = By.xpath("//input[@name='password' and @type='password']");
    private By visiblePassword = By.xpath("//input[@name='password' and @type='text']");

    public void isLoginPage(String realTextOnLoginPage){
        String textOnLoginPage = $(fieldWithTextOnLoginPage).shouldBe(Condition.visible).getText();
        Assert.assertEquals(textOnLoginPage,realTextOnLoginPage);
    }
    public void login(String login,String password){
        $(loginButton).shouldBe(Condition.visible);
        $(loginField).sendKeys(login);
        $(passwordField).sendKeys(password);
        $(loginButton).click();
    }
    public void forgotPasswordClick(){
        $(forgotPasswordButton).click();
    }

    public void incorrectPassword(String login,String password,String textIncorrectPasswordMessage){
        WebDriver driver = getWebDriver();
        login(login,password);
        String incorrectPasswordMessage =driver.switchTo().alert().getText();
        Assert.assertEquals(incorrectPasswordMessage,textIncorrectPasswordMessage);
        driver.switchTo().alert().dismiss();
    }

    public void clickButtonShowPassword(){
        $(showPasswordButton).shouldBe(Condition.visible).click();
    }

    public void changeFieldPasswordToText(){
        boolean elementOnPage=true;
       try {
           $(unVisiblePassword);
       }catch (NoSuchElementException e){
           elementOnPage = false;
       }
       Assert.assertTrue(elementOnPage);
       clickButtonShowPassword();
        try {
            $(visiblePassword);
        }catch (NoSuchElementException e){
            elementOnPage = false;
        }
        Assert.assertTrue(elementOnPage);
    }
}
