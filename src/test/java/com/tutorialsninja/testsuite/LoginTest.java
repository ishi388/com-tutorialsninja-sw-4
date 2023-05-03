package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage= new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLoginOption("Login");
        loginPage.enterEmail("immalhotra12@gmail.com");
        loginPage.enterPassword("imMalhotra12");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLoginTextSuccessfully(),"My Account");
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLogOut("Logout");
        Assert.assertEquals(myAccountPage.getAccountLogOutText(),"Account Logout");
        myAccountPage.clickOnAccountContinueButton();


    }

}
