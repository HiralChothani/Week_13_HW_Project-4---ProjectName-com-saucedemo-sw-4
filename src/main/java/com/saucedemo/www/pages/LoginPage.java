package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By text = By.xpath("//span[@class='title']");
    By productNumber = By.xpath("//a/div");

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyText() {
        return getTextFromElement(text);
    }

    public int actualNumberOfProductDisplayed() {
        List<WebElement> product = driver.findElements(productNumber);
        return product.size();
    }

}
