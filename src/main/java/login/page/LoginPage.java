package login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by janesh on 7/3/2015.
 */
public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //TODO Fine useful coding best practices for Selenium

    @FindBy(name = "txtUsername")
    private WebElement txtUsername;

    @FindBy(name = "txtPassword")
    private WebElement txtPassword;

    @FindBy(name = "Submit")
    private WebElement btnSubmit;


    public void typeUserName(String userName) {
        txtUsername.sendKeys(userName);
    }

    public void clearUserName() {
        txtUsername.clear();
    }


    public void clearPassword() {
        txtPassword.clear();
    }

    public void typePassword(String password) {
        txtPassword.sendKeys(password);
    }


    public void clickSubmit() {
        btnSubmit.click();
    }

    public String getCurrentURL(){
        return webDriver.getCurrentUrl();
    }


    public HomePage validUserLogin(String userName, String password) {
        typeUserName(userName);
        typePassword(password);
        clickSubmit();
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        return homePage;

    }


}
