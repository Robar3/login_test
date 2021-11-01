package com.robar3.mirapolis.tests;

import com.robar3.mirapolis.pageObject.AuthorisationPage;
import com.robar3.mirapolis.pageObject.MainPage;
import org.junit.Test;


public class LoggedIn {

    private String login="fominaelena";
    private String password="1P73BP4Z";

    AuthorisationPage authPage = new AuthorisationPage();
    MainPage mainPage = new MainPage();

    @Test
    public void logIn(){
        authPage.login(login,password);
        mainPage.loggedAsElena();
    }

}