package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")

    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJackets;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement menBottoms;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;


    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;


    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement clickOnBags;


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Women's Menu" );
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(womenTops);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Women's Tops" );
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(2000);
        CustomListeners.test.log(Status.PASS,"Click on Jackets" );
        clickOnElement(clickOnJackets);

    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Men's Menu" );
    }

    public void mouseHoverOnBottom() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(menBottoms);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Men's bottom" );
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(clickOnPants);
        CustomListeners.test.log(Status.PASS,"Click on Pants" );
    }

    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Gear menu" );
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(clickOnBags);
        CustomListeners.test.log(Status.PASS,"Click on Bags" );
    }

}