package com.examples.log4j;

import org.apache.log4j.Logger;

/**
 * Created by janesh on 7/15/2015.
 */
public class Workshop {


    public static void main(String[] args) {


        org.apache.log4j.PropertyConfigurator.configure("E:\\PTL\\selenium\\June2015\\OrangeHRM\\java\\log4j.properties");
        Logger logger = Logger.getLogger("devpinoyLogger");
        logger.debug("This is  a DEBUG");
        logger.info("This is an INFO");

    }
}
