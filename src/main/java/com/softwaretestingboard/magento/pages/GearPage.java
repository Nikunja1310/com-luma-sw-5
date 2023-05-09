package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement bagProductName;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement textOvernightDuffle;


    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement bagQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAdded_ProductTextMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public void clickOnBagProductName() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Clicking on Login button " + bagProductName.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on Bag Product Name " );
        clickOnElement(bagProductName);

    }
}