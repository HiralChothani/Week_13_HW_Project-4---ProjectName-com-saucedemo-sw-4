package com.saucedemo.www.utilities;

import com.saucedemo.www.browserfactory.ManageBrowser;
import org.openqa.selenium.By;

public class Utility extends ManageBrowser {

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by){
      return driver.findElement(by).getText();

    }
}
