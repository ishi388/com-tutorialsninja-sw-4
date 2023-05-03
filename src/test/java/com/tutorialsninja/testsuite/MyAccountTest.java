package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();



    @Test
    public void verifyShouldNavigateToRegisterPageSuccessfully(){
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnRegisterOption("Register");
        Assert.assertEquals(registerPage.getRegisterText(),"Register Account");

    }


    @Test
    public void verifyShouldNavigateToLoginPageSuccessfully(){
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLoginOption("Login");
        Assert.assertEquals(loginPage.getReturningCustomerText(),"Returning Customer");
    }



}
