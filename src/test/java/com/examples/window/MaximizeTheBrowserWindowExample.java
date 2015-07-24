package com.examples.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by janesh on 7/6/2015.
 */
public class MaximizeTheBrowserWindowExample {


    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.quit();
    }


}
