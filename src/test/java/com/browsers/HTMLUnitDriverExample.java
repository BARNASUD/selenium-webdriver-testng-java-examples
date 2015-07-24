package com.browsers;

import com.util.CONSTANTS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import java.util.WeakHashMap;

/**
 * Created by janesh on 7/12/2015.
 */
public class HTMLUnitDriverExample {

    @Test
    public void testHTMLUnitDriver(){

        //Headless driver
        WebDriver driver = new HtmlUnitDriver();
        driver.get(CONSTANTS.BASE_URL);
        System.out.println("Current Title " + driver.getTitle());
    }




}
