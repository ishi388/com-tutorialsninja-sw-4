package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By topMenu =By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    By desktop = By.linkText("Desktops");
    By laptopAndNoteBook =By.linkText("Laptops & Notebooks");
    By components =By.linkText("Components");



    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenu);
        }

    }


    public void mouseHoverOnDesktop(){
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverOnLaptopAndNotebooks(){
        mouseHoverToElementAndClick(laptopAndNoteBook);
    }

    public void mouseHoverOnComponents(){
        mouseHoverToElementAndClick(components);
    }

    public void clickOnShowAllDesktopMenu(String menu){
        selectMenu(menu);
    }

    public void clickOnShowAllLaptops(String menu){
        selectMenu(menu);
    }

    public void clickOnShowAllComponents(String menu){
        selectMenu(menu);
    }
}
