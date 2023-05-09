package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    WebElement jacketsNameListBeforeSorting;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'])[1]")
    WebElement filterProductName;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    By jacketsNameListAfterSorting;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    By jacketsPriceListBeforeSorting;


    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'])[1]")
    WebElement filterPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    WebElement jacketsPriceListAfterSorting;

    public List<String> productListBeforeSorting() {
        List<WebElement> jacketsElementsList = (List<WebElement>) jacketsNameListBeforeSorting;
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);

        return jacketsNameListBefore;
    }

    public List<String> productListAfterSorting() throws InterruptedException {
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        Thread.sleep(1000);
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        Reporter.log("After sorting " + jacketsNameListAfter.toString());
        CustomListeners.test.log(Status.PASS, "Product List after sorting ");
        return jacketsNameListAfter;
    }
    // *****************************************  Price  ***************************************************************************//

    public List<Double> priceListBeforeSorting() {
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListBeforeSorting);
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        Collections.sort(jacketsPriceListBefore);
        return jacketsPriceListBefore;
    }


    public List<Double> priceListAfterSorting() throws InterruptedException {
        selectByVisibleTextFromDropDown(filterPrice, "Price");
        Thread.sleep(1000);
        List<WebElement> jacketsPriceElementList = (List<WebElement>) jacketsPriceListAfterSorting;
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        Reporter.log("After sorting " + jacketsPriceListAfter.toString());
        CustomListeners.test.log(Status.PASS, "Product List after sorting ");
        return jacketsPriceListAfter;
    }

}