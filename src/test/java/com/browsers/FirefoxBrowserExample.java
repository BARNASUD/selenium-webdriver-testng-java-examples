package com.browsers;

import com.util.CONSTANTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/12/2015.
 */
public class FirefoxBrowserExample {



    String BASE_URL= CONSTANTS.BASE_URL;


    @Test
    public void testFirefoxBrowser() throws  Exception{
        //Create an instance of the browser
        WebDriver driver = new FirefoxDriver();
        driver.get(BASE_URL);
        Thread.sleep(5000); //Introduce a delay before closing the browser
        driver.quit();

    }





}


