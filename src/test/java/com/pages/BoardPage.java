package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


@DefaultUrl("https://trello.com/")
public class BoardPage extends PageObject{

    //WebDriver driver=new FirefoxDriver();


    @FindBy(className = "list-name-input")
    private WebElementFacade addList;

    @FindBy(className = "primary")
    private WebElementFacade saveButton;

    @FindBy(className = "open-card-composer")
    private WebElementFacade addCardButton;

    @FindBy(className = "list-card-composer-textarea")
    private WebElementFacade addCardText;

    @FindBy(css = ".primary.confirm.mod-compact.js-add-card")
    private WebElementFacade saveCard;

    @FindBy(className = "list-name-input")
    private WebElementFacade addNewList;

    @FindBy(css = ".primary.mod-list-add-button.js-save-edit")
    private WebElementFacade saveNewListButton;

    @FindBy(className = "list-card-title")
    private WebElementFacade card;

    @FindBy(xpath = "//textarea[contains(.,'Lista Noua')]")
    private WebElementFacade aDouaLista;



    public void addList() {
        waitFor(addList);
        typeInto(addList, "Lista");
    }

    public void saveList() {

        clickOn(saveButton);
    }

    public void addCard() {

        clickOn(addCardButton);
    }

    public void addCardText() {
        waitFor(addCardText);
        typeInto(addCardText, "First Card");
    }

    public void addSaveCard() {

        clickOn(saveCard);
    }

    public void addNewList() {
        waitFor(addNewList);
        typeInto(addNewList, "Lista Noua");
    }

    public void saveNewList() {

        clickOn(saveNewListButton);
    }

    public void setDragAndDrop() {

        Actions builder = new Actions(getDriver());

        Action dragAndDrop = builder.clickAndHold(card)
                .moveToElement(aDouaLista)
                .release(card)
                .build();

        dragAndDrop.perform();

        (new Actions(getDriver())).dragAndDrop(card, aDouaLista).perform();

    }





    /*public void dragAndDrop() {

        WebElement element = driver.findElement(By.xpath("//[@class='list-card-details']"));

        WebElement target = driver.findElement(By.xpath("//[@css='.list-card-title.js-card-name']"));

        (new Actions(driver)).dragAndDrop(element, target).perform();
    }*/


}
