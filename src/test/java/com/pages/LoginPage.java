package com.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://trello.com/login")
public class LoginPage extends PageObject {

    @FindBy(id = "user")
    private WebElementFacade userNameField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login")
    private WebElementFacade loginButton;


    public void setUserNameField(){
        typeInto(userNameField, "fasttrackITaccount@mailinator.com"); }

    public void setPasswordField(){
        typeInto(passwordField, "Passw0rd.123");
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

}
