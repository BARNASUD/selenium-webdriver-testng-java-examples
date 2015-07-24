package com.orangehrm.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by janesh on 7/12/2015.
 */
public class LoginPage {

    @FindBy(name = "txtUsername")
    private WebElement txtUsername;

    @FindBy(name = "txtPassword")
    private WebElement txtPassword;

    @FindBy(name = "Submit")
    private WebElement btnSubmit;

    @FindBy(id="spanMessage")
    private WebElement lblMessage;


    //Create the methods/interactions
    public void typeUserName(String userName){
        txtUsername.sendKeys(userName);
    }

    public void clearUsername(){
        txtUsername.clear();
    }
    public void typePassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clearPassword(){
        txtPassword.clear();
    }

    public void submitlogin(){
        //btnSubmit.click();
        btnSubmit.submit();
    }


    public String getMessage(){
        return lblMessage.getText();
    }



















































}
