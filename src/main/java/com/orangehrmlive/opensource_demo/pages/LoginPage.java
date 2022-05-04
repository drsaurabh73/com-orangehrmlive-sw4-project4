package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.id("txtUsername");
    By passwordLink = By.name("txtPassword");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By forgotpassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By actualMessage = By.xpath("//a[@id='welcome']");
    By actualMessageforgot = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void enterUserName(String email) {
        sendTextToElement(username, email);
    }
    public void enterPassword(String password) {
        sendTextToElement(passwordLink,password);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyTextDisplay() {
        return getTextFromElement(actualMessage);
    }
public String verifyTextForgotPassword() {
        return getTextFromElement(actualMessageforgot);
}
public void clickOnForgotPassword() {
        clickOnElement(forgotpassword);
}
}
