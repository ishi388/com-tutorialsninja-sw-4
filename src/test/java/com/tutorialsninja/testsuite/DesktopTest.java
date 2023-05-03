package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HP_LP3065Page;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HP_LP3065Page page = new HP_LP3065Page();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabaticalOrder() {
        homePage.mouseHoverOnDesktop();
        homePage.clickOnShowAllLaptops("Show AllDesktops");
        desktopPage.selectNameZtoAFromSort("Name (Z - A)");
        Assert.assertEquals(desktopPage.getProductNameList1(), desktopPage.getProductNameList2());


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.mouseHoverOnDesktop();
        homePage.clickOnShowAllLaptops("Show AllDesktops");
        desktopPage.selectNameAtoZFromSort("Name (A - Z)");
        desktopPage.clickOnHPLP3065();
        Assert.assertEquals(page.getHPDesktopText(), "HP LP3065");
        page.selectDeliveryDate();
        page.clickOnAddToCart();
        Assert.assertEquals(page.getAddToCartText().substring(0, 56), "Success: You have added HP LP3065 to your shopping cart!");
        page.clickOnShoppingCart();
        Assert.assertEquals(shoppingCart.getShoppingCartText().substring(0, 13), "Shopping Cart");
        Assert.assertEquals(shoppingCart.getProductNameText(), "HP LP3065");
        Assert.assertEquals(shoppingCart.getDeliveryDateText().substring(14, 24), "2023-11-30");
        Assert.assertEquals(shoppingCart.getModelText(), "Product 21");
        Assert.assertEquals(shoppingCart.gettotalText(), "$122.00");
    }
}
