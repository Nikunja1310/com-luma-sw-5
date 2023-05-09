package com.softwaretestingboard.magento.testbase;


import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*
 * Created by Niks
 * */
public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod(alwaysRun = true)
    public void setup(){
        selectBrowser(browser);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();

    }
}