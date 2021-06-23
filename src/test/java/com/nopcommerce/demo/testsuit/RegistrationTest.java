package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "smoke"})
    public void verifyUserNavigateToRegisterPage() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(500);
        String expectedRegisterText = "Register";
        String actualRegisterText = registerPage.verifyRegisterMessage();
        Assert.assertEquals(actualRegisterText, expectedRegisterText);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageOfFirstNameRequiredAsEmptyField() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registerPage.clickOnRegisterButton();
        String actualMessage = "First name is required.";
        String expectedMessage = registerPage.verifyFirstNameRequiredMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"regression"})
    public void verifyUserSuccessfullyRegister() throws InterruptedException {

        homePage.clickOnRegisterLink();
        registerPage.enterFirstNameField("kelly");
        registerPage.enterListNameField("paul");
        loginPage.enterEmailId("kelly.paul" + randomInt + "@yahoo.com");
        loginPage.enterPassword("abc1234");
        registerPage.confirmedPassword("abc1234");
        registerPage.clickOnRegisterButton();
        Thread.sleep(500);
        String actualMessage = "Your registration completed";
        String expectedMessage = registerPage.verifyRegistrationSuccessfully();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
