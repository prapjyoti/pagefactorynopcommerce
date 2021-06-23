package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginBtn;

    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)")
    WebElement errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welComeStore;

    public void enterEmailId(String email) {
        Reporter.log("Entering email address : " + email + " to email field : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + password + " to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        log.info("Clicking on login button : " + loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + welcomeText.toString() + "<br>");
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }


    public String verifyGetErrorMessage() {
        Reporter.log("Getting error text from : " + errorMessage.toString() + "<br>");
        log.info("Getting error text from : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogOutButton() {
        Reporter.log("click  on log out  : " + logOut.toString() + "<br>");
        clickOnElement(logOut);
        log.info("click on log out button : " + logOut.toString());
    }

    public String verifyWelcomeToOurStore() {
        Reporter.log("verify welcome store text : " + welComeStore.toString() + "<br>");
        log.info("verify welcome store from : " + welComeStore.toString());
        return getTextFromElement(welComeStore);
    }

}
