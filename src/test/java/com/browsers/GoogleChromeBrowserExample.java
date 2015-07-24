package com.browsers;

import com.util.CONSTANTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/12/2015.
 */
public class GoogleChromeBrowserExample {


    @Test
    public void testGoogleChromeBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get(CONSTANTS.BASE_URL);

    }
}
