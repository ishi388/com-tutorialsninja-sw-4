package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    //2.16
    By checkoutText= By.xpath("//h1[normalize-space()='Checkout']");
    //2.17
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    //2.18
    By guestCheckOut = By.xpath("//input[@value='guest']");
    //2.19
    By continueButton= By.xpath("//input[@id='button-account']");
    //2.20
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.name("telephone");
    By address = By.name("address_1");
    By city = By.name("city");
    By postcode = By.name("postcode");
    By country = By.xpath("//select[@id='input-payment-country']");
    By state = By.xpath("//select[@id='input-payment-zone']");

    By continueGuestButton = By.xpath("//input[@id='button-guest']");
    By addComments = By.xpath("//textarea[@name='comment']");
    By termsAndCondition = By.xpath("//input[@name='agree']");
    By termsAndConditionContinueButton = By.xpath("//input[@id='button-payment-method']");
    By termsAndConditionContinueButtonText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");



    public String getCheckoutText()
    {
        return  getTextFromElement(checkoutText);
    }

    public String getNewCustomerText()
    {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOut()
    {
        clickOnElement(guestCheckOut);
    }
    public void clickOnContinueButton()
    {
        clickOnElement(continueButton);
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
    public void enterAddress(String Address){
        sendTextToElement(address,Address);
    }
    public void enterCity(String City){
        sendTextToElement(city,City);
    }

    public void enterPostcode(String Postcode){
        sendTextToElement(postcode,Postcode);
    }

    public void selectCountry(String Country){
        selectByVisibleTextFromDropDown(country,Country);
    }
    public void selectState(String State){
        selectByVisibleTextFromDropDown(state,State);
    }

    public void clickOnGuestCheckoutContinueButton(){
        clickOnElement(continueGuestButton);
    }

    public void enterCommentsAboutYourOrder(String comment){
        sendTextToElement(addComments,comment);
    }
    public void clickOnTermsAndCondition(){
        clickOnElement(termsAndCondition);
    }

    public void clickOnTermsAndConditionButton(){
        clickOnElement(termsAndConditionContinueButton);
    }

    public String getTermsANdConditionText(){
        return getTextFromElement(termsAndConditionContinueButtonText);
    }

}
