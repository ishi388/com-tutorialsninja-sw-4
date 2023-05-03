package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {

    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart =By.xpath("//button[@id='button-cart']");
    By getAddToCartText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    //2.6 Verify text macbook
    public String getMacBookText(){
        return getTextFromElement(macBookText);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String getAddToCartText(){
        return getTextFromElement(getAddToCartText);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }

}
