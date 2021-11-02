package com.robar3.mirapolis.tests;

import com.robar3.mirapolis.pageObject.AuthorisationPage;
import com.robar3.mirapolis.pageObject.MainPage;
import com.robar3.mirapolis.pageObject.RecoveryPasswordPage;
import org.junit.Test;


public class LoggedIn {

    private String textOnLoginPage = "Обучайте, контролируйте результаты, мотивируйте сотрудников, используя лучшие практики лидеров рынка.";
    private String textOnRecoveryPassPage = "Для восстановления введите Ваш логин или email";
    private String textIncorrectPasswordMessage = "Неверные данные для авторизации.";
    private String textIncorrectLoginMessage = "Неверные данные для авторизации";
    private String realUserName = "Фомина Елена Сергеевна";
    private String login="fominaelena";
    private String password = System.getenv("PassOne");
    private String incorrectLogin = "asdqwe";
    private String incorrectPassword = "";
    AuthorisationPage authPage = new AuthorisationPage();
    MainPage mainPage = new MainPage();
    RecoveryPasswordPage recoveryPasswordPage = new RecoveryPasswordPage();

    @Test
    public void logIn(){
        authPage.isLoginPage(textOnLoginPage);
        authPage.login(login,password);
        mainPage.loggedAsElena(realUserName);

    }
    @Test
    public void forgotPassword(){
       authPage.forgotPasswordClick();
       recoveryPasswordPage.checkRecoveryPage(textOnRecoveryPassPage);
    }
    @Test
    public void incorrectPassword(){
       authPage.incorrectPassword(login,incorrectPassword,textIncorrectPasswordMessage);
    }
    @Test
    public void incorrectLogin(){
       authPage.incorrectPassword(incorrectLogin,password,textIncorrectLoginMessage);
    }
    @Test
    public void buttonShowPassword(){
     authPage.changeFieldPasswordToText();
    }

}
