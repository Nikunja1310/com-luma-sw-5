package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnPantSize;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement pantColour;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement clickOnAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddedToShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCart;


    public void pantSize() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(hoverOnPantSize);
        mouseHoverToElementAndClick(clickOnPantSize);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Pant Size and click on Pant size" );
    }

    public void pantColour() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(pantColour);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Pant Colour and click");
    }

    public void addToCart() throws InterruptedException {
        mouseHoverToElement(hoverOnAddToCartButton);
        mouseHoverToElementAndClick(clickOnAddToCartButton);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Add to Cart Button " + clickOnAddToCartButton );
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        CustomListeners.test.log(Status.PASS,"Getting Text from Added to Shopping cart" );
        return getTextFromElement(verifyAddedToShoppingCart);
    }

    public void clickOnShoppingCartInMessage() {
        mouseHoverToElementAndClick(clickOnShoppingCart);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Shopping cart and Click" );
    }

}