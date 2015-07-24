import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by janesh on 7/1/2015.
 */
public class DemoUseOfSubmit {


    public static void main(String[] args) {

        String baseURL = "http://enterprise.demo.orangehrmlive.com/";

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get(baseURL);
        webDriver.findElement(By.id("txtUsername")).clear();
        webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
        webDriver.findElement(By.id("txtPassword")).clear();
        webDriver.findElement(By.id("txtPassword")).sendKeys("admin");

        webDriver.findElement(By.id("btnLogin")).submit();

        webDriver.findElement(By.id("welcome")).click();
        webDriver.findElement(By.linkText("Logout")).click();


        System.out.println("Hello Selenium ");
        webDriver.quit();
    }
}
