package com.examples.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by janesh on 7/22/2015.
 */
public class FirefoxBrowser {


    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get(CONSTANTS.BASE_URL);

        driver.manage().window().maximize();

        driver.close();
    }
}
