package com.steps.serenity;


import com.pages.HomePage;
import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void navigate_to_trello(){
        loginPage.open();
    }

    @Step
    public void set_credentials(){
        loginPage.setUserNameField();
        loginPage.setPasswordField();
    }

    @Step
    public void click_on_login(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verify_logged_in(){
        homePage.verifyLoggedIn();
    }
}
