package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Desktops")
    WebElement deskTopLink;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement deskTopText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    WebElement notebookLink;

    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement noteBookText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a")
    WebElement software;

    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement softwareText;


    public void clickOnDeskToplink() {
        Reporter.log("clicking on desktoplink " + deskTopLink.toString() + "<br>");
        clickOnElement(deskTopLink);
        log.info("Click on deskTop  link : " + deskTopLink.toString());
    }

    public void clickOnNoteBookLink() {
        Reporter.log("click on noteBook Link " + notebookLink.toString() + "<br>");
        clickOnElement(notebookLink);
        log.info("Click on noteBook  link : " + notebookLink.toString());

    }

    public void clickOnSoftWareLink() {
        Reporter.log("click on softWare Link " + software.toString() + "<br>");
        clickOnElement(software);
        log.info("Click on Software  link : " + software.toString());

    }

    public String verifyDeskTopText() {
        Reporter.log("verify deskTop Text " + deskTopText.toString() + "<br>");
        log.info("verify deskTop text : " + deskTopText.toString());
        return getTextFromElement(deskTopText);
    }

    public String verifyNoteBookText() {
        Reporter.log("verify NoteBook Text " + noteBookText.toString() + "<br>");
        log.info("verify NoteBook : " + noteBookText.toString());
        return getTextFromElement(noteBookText);
    }

    public String verifySoftwareText() {
        Reporter.log("verify software Text " + softwareText.toString() + "<br>");
        log.info("verify software text : " + softwareText.toString());
        return getTextFromElement(softwareText);
    }

}
