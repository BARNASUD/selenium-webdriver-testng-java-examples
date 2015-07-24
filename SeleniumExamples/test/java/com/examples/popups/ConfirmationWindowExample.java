package com.examples.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by janesh on 7/8/2015.
 */
public class ConfirmationWindowExample {



    private static   final String BASE_URL="http://jsbin.com/usidix/1";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void testConfirmation(){

        driver.get(BASE_URL);
        driver.findElement(By.xpath("/html/body/input")).click();
        System.out.println("Alert message " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
