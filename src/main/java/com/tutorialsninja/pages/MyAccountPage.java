package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By AccountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    By logoutContinue = By.xpath("//a[contains(text(),'Continue')]");


    //   By registerLink = By.xpath("");
    // By loginLink = By.xpath("");

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(AccountOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(AccountOption);
        }
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnRegisterOption(String selectRegister) {
        selectMyAccountOptions(selectRegister);
    }

    public void clickOnLoginOption(String selectLogin) {
        selectMyAccountOptions(selectLogin);
    }

    public void clickOnLogOut(String selectLogOut) {
        selectMyAccountOptions(selectLogOut);
    }

    public String getAccountLogOutText(){
        return getTextFromElement(accountLogoutText);
    }

    public void clickOnAccountContinueButton() {
        clickOnElement(logoutContinue);
    }
}
