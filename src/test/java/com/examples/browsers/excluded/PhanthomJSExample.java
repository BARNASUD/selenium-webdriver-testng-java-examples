package com.examples.browsers.excluded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;

/**
 * Created by janesh on 7/18/2015.
 */
public class PhanthomJSExample {

    public static void main(String[] args) {
        File file = new File("E:\\PTL\\selenium\\June2015\\OrangeHRM\\install\\drivers\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        System.out.printf("test ");
        System.out.println("current URL "+ driver.getCurrentUrl());

    }


}



