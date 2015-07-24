package login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by janesh on 7/3/2015.
 */
public class HomePage {

    private  WebDriver  webDriver;

    public HomePage(WebDriver webDriver){
        this.webDriver= webDriver;
    }


    @FindBy(id = "welcome")
    private WebElement lnkWelcome;

    @FindBy(linkText = "Logout")
    private WebElement lnkLogout;


    public void clickWelocmeLink(){
        lnkWelcome.click();
    }


    public LoginPage clickLogoutLink(){
        lnkLogout.click();
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        return loginPage;
    }


    public String getTitle(){
        return webDriver.getTitle();
    }

    public String getCurrentURL(){
        return webDriver.getCurrentUrl();
    }





}

