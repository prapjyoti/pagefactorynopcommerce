package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(linkText = "Computers")
    WebElement computer;

    @FindBy(linkText = "Electronics")
    WebElement electronics;

    @FindBy(linkText = "Apparel")
    WebElement apparel;

    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloads;

    @FindBy(linkText = "Books")
    WebElement books;

    @FindBy(linkText = "Jewelry")
    WebElement jewelry;

    @FindBy(linkText = "Gift Cards")
    WebElement giftCards;

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on login link : " + registerLink.toString());
    }

    public void mouseHoverOnComputerLink() {
        Reporter.log("clicking on Computer link " + computer.toString() + "<br>");
        mouseHoverToElement(computer);
        log.info("Clicking on computer link : " + computer.toString());
    }

    public void clickOnElectronicsLink() {
        Reporter.log("clicking on Electronics link " + electronics.toString() + "<br>");
        clickOnElement(electronics);
        log.info("Clicking on electronics link : " + electronics.toString());
    }

    public void clickOnApparelLink() {
        Reporter.log("clicking on Apparel link " + apparel.toString() + "<br>");
        clickOnElement(apparel);
        log.info("Clicking on apparel link : " + apparel.toString());
    }

    public void clickOnDigitalDownloadLink() {
        Reporter.log("clicking on Digital downloads link " + digitalDownloads.toString() + "<br>");
        clickOnElement(digitalDownloads);
        log.info("Clicking on digitalDownloads link : " + digitalDownloads.toString());
    }

    public void clickOnBooksLink() {
        Reporter.log("clicking on Books link " + books.toString() + "<br>");
        clickOnElement(books);
        log.info("Clicking on books link : " + books.toString());
    }

    public void clickOnJewelryLink() {
        Reporter.log("clicking on Jewelry link " + jewelry.toString() + "<br>");
        clickOnElement(jewelry);
        log.info("Clicking on jewelry link : " + jewelry.toString());
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on Gift cards link " + giftCards.toString() + "<br>");
        clickOnElement(giftCards);
        log.info("Clicking on giftCards link : " + giftCards.toString());
    }

}
