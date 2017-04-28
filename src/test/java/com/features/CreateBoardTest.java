package com.features;


import com.steps.serenity.CreateBoardSteps;
import com.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateBoardTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private CreateBoardSteps createBoardSteps;


    @Test
    public void create_board_test(){
        createBoardSteps.log_in();
        createBoardSteps.create_new_board();
        createBoardSteps.add_list();
        createBoardSteps.add_card();
        createBoardSteps.add_new_list();
        createBoardSteps.drag_and_drop();


    }





}
