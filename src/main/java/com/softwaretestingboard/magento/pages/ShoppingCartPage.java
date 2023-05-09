package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    // Verify the text ‘Shopping Cart.'

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyTextShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyProductQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()'][normalize-space()='$135.00']")
    WebElement verifyProductPrice;

    @CacheLookup
    @FindBy(xpath = "//button[@class='action update']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement newProductPrice;


    public String verifyTextShoppingCart() {
        CustomListeners.test.log(Status.PASS,"Get text from  Shopping Cart");
        return getTextFromElement(verifyTextShoppingCart);
    }

    public String verifyTheProductName() {
        CustomListeners.test.log(Status.PASS,"Verify the product name "+productName);
        return getTextFromElement(productName);
    }

    public String verifyTheProductSize() {
        CustomListeners.test.log(Status.PASS,"Get teh Product Size " + productSize );
        return getTextFromElement(productSize);
    }

    public String verifyTheProductNameColour() {
        CustomListeners.test.log(Status.PASS,"Verify the Product colour name");
        return getTextFromElement(productColour);
    }

    public String verifyTheBagProductName() {
        CustomListeners.test.log(Status.PASS,"Get text from  Product name");
        return getTextFromElement(verifyProductName);
    }


    public String verifyTheProductQuantity() throws InterruptedException {
        Thread.sleep(3000);
        CustomListeners.test.log(Status.PASS,"Verify product quantity");
        return getAttributeValueFromElement(verifyProductQuantity);
    }


    public String verifyTheProductPrice() {
        CustomListeners.test.log(Status.PASS,"Verify product price");
        return getTextFromElement(verifyProductPrice);
    }


    public void changeShoppingCartQuantity(String qnty) throws InterruptedException{
        Thread.sleep(5000);
        //CustomListeners.test.log(Status.PASS,"Change quantity to " + changeQuantity  );
        sendTextToElement(changeQuantity, qnty);
    }


    public void updateShoppingCartButton() {
        CustomListeners.test.log(Status.PASS,"Clicking on Shopping cart Button");
        clickOnElement(shoppingCartButton);
    }


    public String verifyTheFinalProductPrice() throws InterruptedException {
        Thread.sleep(2000);
        CustomListeners.test.log(Status.PASS,"Verify Final product price");
        return getTextFromElement(newProductPrice);
    }


}