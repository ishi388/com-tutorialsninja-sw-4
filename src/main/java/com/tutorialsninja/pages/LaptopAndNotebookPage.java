package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopAndNotebookPage extends Utility {

    By laptopAndNotebook = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sortByFilter = By.xpath("//select[@id='input-sort']");
    By productPriceList = By.xpath("//p[@class='price']");
    By ProductPriceList1 = By.xpath("//p[@class='price']");

    By macBook = By.linkText("MacBook");




    public String getLaptopAndNotebookText()
    {
        return getTextFromElement(laptopAndNotebook);
    }

    public void selectSortByPriceHighToLow(String visibleText)
    {
        selectByVisibleTextFromDropDown(sortByFilter,visibleText);
    }

    public ArrayList<String> getProductPriceList()
    {
        List<WebElement> beforeFilterProductPriceList = driver.findElements(productPriceList);
        ArrayList<String> beforeFilterProductPriceList1 = new ArrayList<>();
        for(WebElement list:beforeFilterProductPriceList)
        {
            beforeFilterProductPriceList1.add(String.valueOf(list));
        }
        Collections.sort(beforeFilterProductPriceList1);
        Collections.reverse(beforeFilterProductPriceList1);
        return beforeFilterProductPriceList1;
    }

    public ArrayList<String> getProductPriceListHighToLow()
    {
        List<WebElement> afterFilterProductPriceList = driver.findElements(productPriceList);
        ArrayList<String> afterFilterProductPriceList1 = new ArrayList<>();
        for(WebElement list:afterFilterProductPriceList)
        {
            afterFilterProductPriceList1.add(String.valueOf(list));
        }
        return afterFilterProductPriceList1;
    }


    //2.5
    public void clickOnMacBook(){
        clickOnElement(macBook);
    }
}
