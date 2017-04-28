package com.steps.serenity;


import com.pages.BoardPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CreateBoardSteps extends ScenarioSteps{

    LoginPage loginPage;
    HomePage homePage;
    CreateBoardSteps createNewBoard;
    BoardPage boardPage;


    @Step
    public void log_in(){
        loginPage.open();
        loginPage.setUserNameField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();
        homePage.verifyLoggedIn();
    }

    @Step
    public void create_new_board(){
        homePage.clickAddBoard();
        homePage.clickCreateBoard();
        homePage.boardNewTitle();
        homePage.clickCreate();
    }

    @Step
    public void add_list() {
        boardPage.addList();
        boardPage.saveList();

    }

    @Step
    public void add_card() {
        boardPage.addCard();
        boardPage.addCardText();
        boardPage.addSaveCard();
    }

    @Step
    public void add_new_list() {
        boardPage.addNewList();
        boardPage.saveNewList();
    }

    @Step
    public void drag_and_drop() {
        boardPage.setDragAndDrop();
    }





}
