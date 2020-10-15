package com.cybertek.tests.day13_po_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest_SB {
    LoginPage loginPage;

    @Test(description = "entering incorrect username")
    public void negative_login_test1(){

        String url = ConfigurationReader.getProperty("smartbearUrl");

        Driver.getDriver().get(url);

        LoginPage loginPage= new LoginPage();

        loginPage.usernameInput.sendKeys("asdfafa");

        loginPage.passwordInput.sendKeys("test");

        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"error message is not displayed, verification failed");


    }

    @Test (description = "using login method for negative test")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = "wrongusername";
        String password = ConfigurationReader.getProperty("smartbear_password");

        loginPage.login(username, password);

        //assert true that error message is displayed on the page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");



    }



}
