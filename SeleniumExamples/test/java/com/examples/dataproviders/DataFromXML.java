package com.examples.dataproviders;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/7/2015.
 */
public class DataFromXML {



    //Parameters from XML
    @Test
    @Parameters({"username","password"})
    public void testUserLogin(String username, String password){
        System.out.println(" " + username);
        System.out.println(" " + password);
    }


    //Optional parameters
    @Test
    @Parameters({"username","password"})
    public void testUserLoginWithOptionalParameters(@Optional("Admin2") String username2, String password){
        System.out.println(" " + username2);
        System.out.println(" " + password);
    }


}
