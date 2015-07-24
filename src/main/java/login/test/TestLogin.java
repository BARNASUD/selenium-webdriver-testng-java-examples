package login.test;

import login.page.HomePage;
import login.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/3/2015.
 */
public class TestLogin {

    WebDriver webDriver;
    String BASE_URL = "http://opensource.demo.orangehrm.com/";


    @BeforeClass
    public void beforeClass(){
        webDriver = new FirefoxDriver();
        webDriver.get(BASE_URL);
    }


    @AfterClass
    public void afterClass(){
        webDriver.close();
    }


    @Test
    public void testValidUserLogin(){
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        HomePage homePage = loginPage.validUserLogin("Admin", "admin");
        homePage.clickWelocmeLink();
        loginPage = homePage.clickLogoutLink();
        Assert.assertEquals(loginPage.getCurrentURL(), BASE_URL, "URL in the login page is incorrect");
    }




}
