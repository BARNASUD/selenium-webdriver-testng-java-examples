package com.orangehrm.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

/**
 * Created by janesh on 7/5/2015.
 */
public class HelloSelenium {

    public static void main(String[] args) {
        System.out.println("Hello Selenium !");


        //Open the browser
        WebDriver driver = new FirefoxDriver();




        // Go to the web site (go to login screen)
       // driver.get("http://opensource.demo.orangehrm.com/");
       driver.navigate().to("http://opensource.demo.orangehrm.com/");



        //driver.navigate().back(); click back button of the browse
        //driver.navigate().refresh();  to click refresh button of the browser





        // Interact with the page (Fill the user name and password. Click login button)\\\

        //Type user name
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");


        //Type password
        driver.findElement(By.id("txtPassword")).sendKeys("admin");





        //Click submit button
        driver.findElement(By.id("btnLogin")).click();



        // Verify the page



        //Close the browser
       // driver.close();
        driver.quit();




    }


}
