package it.air;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

/**
 * User: Aruna Rajapaksha
 */

public class TestData {

    private static final Logger logger = Logger.getLogger(TestData.class);

    @DataProvider(name = "SearchData")
    public static Object[][] dataAdmin() throws Exception {
        logger.debug("Initializing Search Data");
        return Base.getExcelToJson("Search");
    }
}