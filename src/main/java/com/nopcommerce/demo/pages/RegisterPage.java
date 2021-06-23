package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredText;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmedPassword;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessfully;


    public String verifyRegisterMessage() {
        Reporter.log("Navigate Register Page: " + registerText.toString() + "<br>");
        log.info("Getting text from : " + registerText.toString());
        return getTextFromElement(registerText);

    }

    public void clickOnRegisterButton() {
        Reporter.log("Click Register Button: " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
        log.info("Click on register button : " + registerButton.toString());
    }

    public void confirmedPassword(String password) {
        Reporter.log("Entering password : " + password + " to  confirmed password field : " + confirmedPassword.toString() + "<br>");
        sendTextToElement(confirmedPassword, password);
        log.info("Entering  confirmed password : " + password + " to confirmed password field : " + confirmedPassword.toString());
    }

    public String verifyFirstNameRequiredMessage() {
        Reporter.log("First Name is Required: " + firstNameRequiredText.toString() + "<br>");
        log.info("Getting text from : " + firstNameRequiredText.toString());
        return getTextFromElement(firstNameRequiredText);

    }

    public void enterFirstNameField(String name) {
        Reporter.log("Enter first name : " + firstName + " to  first name field : " + firstName.toString() + "<br>");
        sendTextToElement(firstName, name);
        log.info("Entering  confirmed password : " + firstName + " to first name  field : " + firstName.toString());
    }


    public void enterListNameField(String name) {
        Reporter.log("Enter last name : " + lastName + " to  last name field : " + lastName.toString() + "<br>");
        sendTextToElement(lastName, name);
        log.info("Enter  last name password : " + lastName + " to Last Name field : " + lastName.toString());

    }

    public String verifyRegistrationSuccessfully() {
        Reporter.log("verify Registration Successfully : " + registerSuccessfully.toString() + "<br>");
        log.info("Enter  last name password : " + registerSuccessfully.toString());
        return getTextFromElement(registerSuccessfully);


    }
}




