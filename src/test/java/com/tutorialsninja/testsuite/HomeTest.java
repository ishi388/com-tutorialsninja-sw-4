package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNotebookPage= new LaptopAndNotebookPage();
    ComponentPage componentPage = new ComponentPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnDesktop();
        homePage.clickOnShowAllDesktopMenu("Show AllDesktops");
        Assert.assertEquals(desktopPage.getDesktopText(),"Desktops");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopAndNotebookPageSuccessfully(){
        homePage.mouseHoverOnLaptopAndNotebooks();
        homePage.clickOnShowAllLaptops("Show AllLaptops & Notebooks");
        Assert.assertEquals(laptopAndNotebookPage.getLaptopAndNotebookText(),"Laptops & Notebooks");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents("Show AllComponents");
        Assert.assertEquals(componentPage.getTextComponent(),"Components");




    }
}
