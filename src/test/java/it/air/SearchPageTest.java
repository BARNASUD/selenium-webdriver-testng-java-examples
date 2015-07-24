package it.air;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.testng.annotations.*;

/**
 * User: Aruna Rajapaksha
 */

public class SearchPageTest extends Base {

    private static final Logger logger = Logger.getLogger(SearchPageTest.class);

    SearchPage searchPage;

    @BeforeClass
    public void beforeClass() throws Exception {
        searchPage = new SearchPage();
        logger.info("BeforeClass");
    }

    @AfterClass
    public void afterClass() throws Exception {
        logger.info("AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
        logger.info("BeforeMethod");
        verificationErrors.setLength(0);
    }

    @AfterMethod
    public void afterMethod() throws Exception {
        logger.info("AfterMethod");
    }

    @Test(dataProvider = "SearchData", dataProviderClass = TestData.class)
    public void testGoogle(JSONObject data) throws Exception {
        searchPage.doSearch(data);
        verifyErrors();
    }
}