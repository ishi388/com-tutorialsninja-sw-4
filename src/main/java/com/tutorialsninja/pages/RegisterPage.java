package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register Account')]");

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");

    By subscribeRadioButton = By.xpath("//fieldset[3]//input");

    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    By accountCreatedMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

    By accountCreatedContinueButton= By.xpath("//a[normalize-space()='Continue']");






    public String getRegisterText(){
        return getTextFromElement(registerText);
    }


    public void enterFirstName(String firstname){
        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastName,lastname);
    }

    public void enterEmail(String Email){
        sendTextToElement(email,Email);
    }

    public void enterTelephoneNumber(String Telephone){
        sendTextToElement(telephone,Telephone);
    }
    public void enterPassword(String Password){
        sendTextToElement(password,Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        sendTextToElement(confirmPassword,ConfirmPassword);
    }

    public void clickOnSubscribeRadioButton(){
        clickOnElement(subscribeRadioButton);
    }

    public void checkPrivacyPolicyCheckBox(){
        clickOnElement(privacyPolicy);
    }

    public void ClickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public String accountCreatedMessageText(){
        return  getTextFromElement(accountCreatedMessage);
    }
    public void ClickOnAccountCreatedContinueButton(){
        clickOnElement(accountCreatedContinueButton);
    }

}
