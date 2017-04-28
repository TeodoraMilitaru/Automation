package com.features;

import com.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void log_in_test(){
        loginSteps.navigate_to_trello();
        loginSteps.set_credentials();
        loginSteps.click_on_login();
        loginSteps.verify_logged_in();
    }
}
