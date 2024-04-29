package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class browsersetup{
    public WebDriver browser;

    @BeforeSuite
    public void browserset() {
        browser =new FirefoxDriver();
    }

    @AfterSuite
    public void quitbrowser(){
        browser.quit();
    }
    public WebElement getElement(By locator){
        return browser.findElement(locator);
    }

    public void writeOnElement(By locator, String text ){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public Boolean displayStatus(By locator){
        return getElement(locator).isDisplayed();
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }
}