package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials () {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        String expectedMessage1 = "Welcome";
        String actualMessage1 = loginPage.verifyTextDisplay().substring(0,7);
        Assert.assertEquals(actualMessage1,expectedMessage1,"");

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully () {
        loginPage.clickOnForgotPassword();
        String expectedMessage2 = "Forgot Your Password?";
        String actualMessage2 = loginPage.verifyTextForgotPassword();
        Assert.assertEquals(actualMessage2,expectedMessage2,"");


    }

}
