package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageWithInvalidCredentials() throws InterruptedException {

        homePage.clickOnLoginLink();
        Thread.sleep(500);
        loginPage.enterEmailId("lolla.paul@yahoo.com");
        loginPage.enterPassword("abc1234");
        Thread.sleep(500);
        loginPage.clickOnLoginButton();
        Thread.sleep(500);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.verifyGetErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = "regression")
    public void verifyUserLoginSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(500);
        registerPage.enterFirstNameField("kelly");
        registerPage.enterListNameField("paul");
        loginPage.enterEmailId("kelly.paul" + randomInt + "@yahoo.com");
        loginPage.enterPassword("abc1234");
        registerPage.confirmedPassword("abc1234");
        registerPage.clickOnRegisterButton();

        loginPage.clickOnLogOutButton();
        Thread.sleep(500);
        homePage.clickOnLoginLink();
        Thread.sleep(500);
        loginPage.enterEmailId("kelly.paul" + randomInt + "@yahoo.com");
        loginPage.enterPassword("abc1234");
        //Thread.sleep(500);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String expectedMessage = "Welcome to our store";
        String actualMessage = loginPage.verifyWelcomeToOurStore();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}

