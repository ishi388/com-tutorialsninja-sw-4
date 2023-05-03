package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {



    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By productFilter = By.xpath("//h4//a");
    By filterName = By.id("input-sort");
    By hpDesktop = By.xpath("//a[contains(text(),'HP LP3065')]");


    public String getDesktopText() {
        return getTextFromElement(desktopsText);
    }

    public ArrayList<String> getProductNameList1() {
        List<WebElement> beforeFilterProductNameList = driver.findElements(productFilter);
        ArrayList<String> beforeFilterProductNameList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductNameList) {
            beforeFilterProductNameList1.add(String.valueOf(list));

        }
        Collections.sort(beforeFilterProductNameList1);
        Collections.reverse(beforeFilterProductNameList1);
        return beforeFilterProductNameList1;
    }

    public void selectNameZtoAFromSort(String filter) {
        waitUntilVisibilityOfElementLocated(filterName, 30);
        selectByVisibleTextFromDropDown(filterName, filter);
    }

    public ArrayList<String> getProductNameList2() {
        List<WebElement> afterFilterProductNameList = driver.findElements(productFilter);
        ArrayList<String> afterFilterProductNameList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductNameList) {
            afterFilterProductNameList1.add(String.valueOf(list1));
        }
        //Collections.sort();
        return afterFilterProductNameList1;
    }

    public void selectNameAtoZFromSort(String filter) {
        waitUntilVisibilityOfElementLocated(filterName, 30);
        selectByVisibleTextFromDropDown(filterName, filter);
    }

    public void clickOnHPLP3065() {
        clickOnElement(hpDesktop);
    }
}
