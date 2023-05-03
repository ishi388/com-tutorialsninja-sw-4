package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    //Desktop Shopping
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");

    By modelText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    //LaptopAndNoteBookPage
    //2.9
    By macBookShoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    //2.10
    By macBookText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    //2.11
    By QTY = By.xpath("//input[contains(@name, 'quantity')]");
    //2.12
    By updateMacBook= By.xpath("//button[contains(@data-original-title, 'Update')]");
    //2.13
    By updateTabText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    //change currency
    By currencyButton = By.xpath("//span[contains(text(),'Currency')]");
    By sterlingPound = By.xpath("//ul[@class = 'dropdown-menu']/li");
    //2.14
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutButton =By.xpath("//a[@class='btn btn-primary']");


    public String getShoppingCartText()
    {
        return getTextFromElement(shoppingCartText);
    }

    public String getProductNameText()
    {
        return getTextFromElement(productNameText);
    }

    public String getDeliveryDateText()
    {
        return getTextFromElement(deliveryDateText);
    }

    public String getModelText()
    {
        return getTextFromElement(modelText);
    }

    public String gettotalText()
    {
        return getTextFromElement(totalText);
    }
    //NotebookAndLaptop
    //2.9
    public String getTextMacbookAddToCart(){
        return getTextFromElement(macBookShoppingCartText);
    }
    //2.10
    public String getMacBookText(){
        return getTextFromElement(macBookText);
    }
    //2.11
    public void updateQuantity(String NewQTY){
        driver.findElement(QTY).clear();
        sendTextToElement(QTY, NewQTY);
    }
    //2.12
    public void clickOnUpdateTab(){
        clickOnElement(updateMacBook);
    }
    //2.13
    public String getUpdateQTYText(){
        return getTextFromElement(updateTabText);
    }
    //2.14
    public void changeCurrency(String text){
        clickOnElement(currencyButton);
        selectByContainsTextFromListOfElements(sterlingPound,text);
    }
    public String getMacBookTotalText(){
        return  getTextFromElement(verifyTotal);
    }
    public  void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }

}
