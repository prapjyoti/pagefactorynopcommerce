package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserNavigateToDeskTopPageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnDeskToplink();
        Thread.sleep(1000);
        String expecteddesktopText = "Desktops";
        String actualdesktopText = computerPage.verifyDeskTopText();
        Assert.assertEquals(expecteddesktopText, actualdesktopText);

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserNavigateToNoteBookPageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnNoteBookLink();
        //Thread.sleep(1000);
        String expectedMessage = "Notebooks";
        String actualdMessage = computerPage.verifyNoteBookText();
        Assert.assertEquals(actualdMessage, expectedMessage);

    }
//This method fail for screen sort purpose
    @Test(groups = {"regression"})
    public void verifyUserNavigateToSoftwarePageSuccessfully() throws InterruptedException {

        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnSoftWareLink();
        //Thread.sleep(1000);
        String expectedMessage = "Softwar";
        String actualdMessage = computerPage.verifySoftwareText();
        Assert.assertEquals(actualdMessage, expectedMessage);

    }

}
