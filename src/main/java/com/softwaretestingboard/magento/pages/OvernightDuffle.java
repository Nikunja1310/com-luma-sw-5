package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OvernightDuffle extends Utility {

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


    public String verifyTheTextOvernightDuffle() {
        CustomListeners.test.log(Status.PASS,"Get Text from Overnight Duffle");
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeBagQuantity(String qnty) {
        sendTextToElement(bagQuantity,qnty );
        CustomListeners.test.log(Status.PASS,"Sending bag quantity" + qnty);
    }


    public void clickOnAddToCartButton() {
        mouseHoverToElementAndClick(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on Add to Cart Button");
    }


    public String verifyTextYouAdded_ProductNameMessage() {
        CustomListeners.test.log(Status.PASS,"Get Product text");
        return getTextFromElement(youAdded_ProductTextMessage);
    }

    public void clickOnShoppingCartInToMessage() {
        CustomListeners.test.log(Status.PASS,"Click on Shopping cart");
        clickOnElement(shoppingCart);
    }


}