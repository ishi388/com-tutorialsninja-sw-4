package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By registerCustomerText= By.xpath("//h2[contains(text(),'Returning Customer')]");
    //   By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By password = By.id("input-password");

    By loginButton = By.xpath("//input[@value='Login']");

    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");



    public String  getReturningCustomerText(){
        return  getTextFromElement(registerCustomerText);
    }


    public void enterEmail(String Email){
        sendTextToElement(email,Email);
    }
    public void enterPassword(String Password){
        sendTextToElement(password,Password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String  getLoginTextSuccessfully(){
        return  getTextFromElement(myAccountText);
    }
}
