package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HP_LP3065Page extends Utility {

    By hpDesktopText = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By deliveryDate = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By datePicker = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By allDates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By addToCartText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String getHPDesktopText()
    {
        return getTextFromElement(hpDesktopText);
    }

    public void selectDeliveryDate()
    {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(deliveryDate);
        while(true)
        {
            String monthAndYear1 = getTextFromElement(monthAndYear);
            String arr[] = monthAndYear1.split(" ");
            String mon = arr[0] ;
            String yer = arr[1];
            if(mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year))
            {
                break;
            }
            else
            {
                clickOnElement(datePicker);
            }


        }
        List<WebElement> allDates1 = driver.findElements(allDates);
        for(WebElement dateList:allDates1)
        {
            if(dateList.getText().equalsIgnoreCase(date))
            {
                dateList.click();
                break;
            }
        }



    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
    }

    public String getAddToCartText()
    {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
    }
}
