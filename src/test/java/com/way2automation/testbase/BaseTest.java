package com.way2automation.testbase;

import com.way2automation.propertyreader.PropertyReader;
import com.way2automation.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()

    {
        closeBrowser();
    }

}
