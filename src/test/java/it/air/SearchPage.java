package it.air;

import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 * User: Aruna Rajapaksha
 */

public class SearchPage extends Base {

    //Elements
    By searchBox = By.name("q");
    By searchButton = By.id("gbqfb");
    By imageLink = By.cssSelector("a.q.qs");



    public void doSearch(JSONObject data) throws Exception {

        driver.get("https://www.google.com/");
        clearAndType(searchBox, data.getString("SEARCH_STRING"));
        click(searchButton);
        click(imageLink);
    }
}

