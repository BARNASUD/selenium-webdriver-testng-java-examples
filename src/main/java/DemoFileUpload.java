import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by janesh on 7/1/2015.
 */
public class DemoFileUpload {


    public static void main(String[] args) {

        String baseURL = "http://enterprise.demo.orangehrmlive.com/";

        WebDriver webDriver = new FirefoxDriver();
        userLogin(baseURL, webDriver);


        webDriver.findElement(By.id("menu_pim_addEmployee")).click();
        webDriver.findElement(By.name("firstName")).sendKeys("FirstName");
        webDriver.findElement(By.name("lastName")).sendKeys("LastName");
        webDriver.findElement(By.name("photofile")).sendKeys("E:\\PTL\\selenium\\June2015\\OrangeHRM\\screens\\OrangeHomePage.png");
        webDriver.findElement(By.name("chkLogin")).click();
        webDriver.findElement(By.name("user_name")).sendKeys("userName");
        webDriver.findElement(By.name("user_password")).sendKeys("password");
        webDriver.findElement(By.name("re_password")).sendKeys("password");
        new Select(webDriver.findElement(By.name("status"))).selectByVisibleText("Disabled");

        webDriver.findElement(By.id("btnSave")).click();

        webDriver.findElement(By.id("welcome")).click();
        webDriver.findElement(By.linkText("Logout")).click();


        System.out.println("Hello Selenium ");
        webDriver.quit();

    }

    private static void userLogin(String baseURL, WebDriver webDriver) {
        webDriver.get(baseURL);
        webDriver.findElement(By.id("txtUsername")).clear();
        webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
        webDriver.findElement(By.id("txtPassword")).clear();
        webDriver.findElement(By.id("txtPassword")).sendKeys("admin");

        webDriver.findElement(By.id("btnLogin")).submit();
    }
}
