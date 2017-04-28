package com.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://trello.com/")
public class HomePage extends PageObject {

    @FindBy(className = "member-initials")
    private WebElementFacade memberInitialsSpan;

    @FindBy(css = ".header-btn-icon.icon-lg.icon-add.light")
    private WebElementFacade addNewBordButton;

    @FindBy(className = "js-new-board")
    private WebElementFacade createBoard;

    @FindBy(id = "boardNewTitle")
    private WebElementFacade addTitle;

    @FindBy(css = ".primary.wide.js-submit")
    private WebElementFacade createButton;





    public void verifyLoggedIn() {
        memberInitialsSpan.shouldContainText("F");
    }

    public void clickAddBoard() {
        waitFor(addNewBordButton);
        clickOn(addNewBordButton);
    }

    public void clickCreateBoard() {
        waitFor(createBoard);
        clickOn(createBoard);
    }

    public void boardNewTitle() {
        waitFor(addTitle);
        typeInto(addTitle, "Teo's");
    }

    public void clickCreate() {
        clickOn(createButton);
    }


}
