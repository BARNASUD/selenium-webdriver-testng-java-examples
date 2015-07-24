package com.orangehrm.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by janesh on 7/12/2015.
 */
public class LandingPage {


    @FindBy(id="welcome")
    private WebElement lnkWelcome;


    @FindBy(linkText = "Logout")
    private WebElement lnkLogout;


    public String getWelcomeMessage(){
        return lnkWelcome.getText();
    }

    public void clickWelcome(){
        lnkWelcome.click();
    }


    public void clickLogout(){
        lnkLogout.click();
    }




}
