package com.orangehrm.selenium.tests;

import com.orangehrm.selenium.pages.LandingPage;
import com.orangehrm.selenium.pages.LoginPage;
import com.util.CONSTANTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/12/2015.
 */
public class TestLogin {

    private WebDriver webDriver;
    private LoginPage loginPage;

    @BeforeTest
    public void beforeTest() {
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }


    @AfterTest
    public void afterTest(){
        webDriver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        webDriver.get(CONSTANTS.BASE_URL);
        loginPage = PageFactory.initElements(webDriver, LoginPage.class);
    }

    @Test
    public void testBlankUserNameAndBlankPassword() {
        loginPage.clearPassword();
        loginPage.clearUsername();
        loginPage.submitlogin();
        Assert.assertEquals(loginPage.getMessage(), "Username cannot be empty", "Error message is not correct");
    }


    @Test
    public void testBlankUserName() {
        loginPage.clearUsername();
        loginPage.typePassword("Admin");
        loginPage.submitlogin();
        Assert.assertEquals(loginPage.getMessage(), "Username cannot be empty", "Error message is not correct");
    }


    @Test
    public void testBlankPassword(){
        loginPage.typeUserName("Admin");
        loginPage.clearPassword();
        loginPage.submitlogin();
        Assert.assertEquals(loginPage.getMessage(), "Password cannot be empty", "Error message is not correct");
    }


    @Test
    public void testValidUserNameAndInvalidPassword(){
        loginPage.typeUserName("Admin");
        loginPage.typePassword("invalid12");
        loginPage.submitlogin();
        Assert.assertEquals(loginPage.getMessage(), "Invalid credentials", "Error message is not correct");
    }



    @Test
    public void testInvalidUserNameAndValidPassword(){
        loginPage.typeUserName("Admin12");
        loginPage.typePassword("admin");
        loginPage.submitlogin();
        Assert.assertEquals(loginPage.getMessage(), "Invalid credentials", "Error message is not correct");
    }


    @Test
    public void testValidUserLogin(){
        loginPage.typeUserName("Admin");
        loginPage.typePassword("admin");
        loginPage.submitlogin();
        LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
        Assert.assertEquals(landingPage.getWelcomeMessage(), "Welcome Admin");
        landingPage.clickWelcome();
        landingPage.clickLogout();
    }





}
