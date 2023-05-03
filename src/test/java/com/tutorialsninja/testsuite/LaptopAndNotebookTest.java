package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class LaptopAndNotebookTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopAndNotebookPage lPage = new LaptopAndNotebookPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage= new CheckoutPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully()
    {
        homePage.mouseHoverOnLaptopAndNotebooks();
        homePage.clickOnShowAllLaptops("Show AllLaptops & Notebooks");
        lPage.selectSortByPriceHighToLow("Price (High > Low)");
        Assert.assertEquals(lPage.getProductPriceListHighToLow(),lPage.getProductPriceList());


    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully()
    {     //2.1
        homePage.mouseHoverOnLaptopAndNotebooks();
        //2.2
        homePage.clickOnShowAllLaptops("Show AllLaptops & Notebooks");
        //2.3
        lPage.selectSortByPriceHighToLow("Price (High > Low)");
        //2.4
        lPage.clickOnMacBook();
        //2.5
        // macBookPage.getMacBookText();
        //2.5
        Assert.assertEquals(macBookPage.getMacBookText(),"MacBook");
        //2.6
        macBookPage.clickOnAddToCart();
        //2.7
        Assert.assertEquals(macBookPage.getAddToCartText().substring(0,54),"Success: You have added MacBook to your shopping cart!");
        //2.8
        macBookPage.clickOnShoppingCart();
        //2.9

        Assert.assertEquals(shoppingCartPage.getTextMacbookAddToCart().substring(0,13),"Shopping Cart");
        //2.10
        Assert.assertEquals(shoppingCartPage.getMacBookText(),"MacBook");
        //2.11
        shoppingCartPage.updateQuantity("2");
        //2.12
        shoppingCartPage.clickOnUpdateTab();
        //2.13
        Assert.assertEquals(shoppingCartPage.getUpdateQTYText().substring(0,46),"Success: You have modified your shopping cart!");
        //2.14
        shoppingCartPage.changeCurrency("£Pound Sterling");
        Assert.assertEquals(shoppingCartPage.getMacBookTotalText(),"£737.45");
        //2.15
        shoppingCartPage.clickOnCheckoutButton();
        //2.16
        Assert.assertEquals(checkoutPage.getCheckoutText(),"Checkout");
        //2.17
        Assert.assertEquals(checkoutPage.getNewCustomerText(),"New Customer");
        //2.18
        checkoutPage.clickOnGuestCheckOut();
        //2.19
        checkoutPage.clickOnContinueButton();
        //2.20
        checkoutPage.enterFirstName("Ishit");
        checkoutPage.enterLastName("Malhotra");
        checkoutPage.enterEmail("immalhotra12@gmail.com");
        checkoutPage.enterTelephoneNumber("1234567890");
        checkoutPage.enterAddress("Brampton Road");
        checkoutPage.enterCity("London");
        checkoutPage.enterPostcode("NW9 9BU");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.selectState("London");
        checkoutPage.clickOnGuestCheckoutContinueButton();
        checkoutPage.enterCommentsAboutYourOrder("Order Placed Successfully!");
        checkoutPage.clickOnTermsAndCondition();
        checkoutPage.clickOnTermsAndConditionButton();
        Assert.assertEquals(checkoutPage.getTermsANdConditionText().substring(0,33),"Warning: Payment method required!");





    }
}
