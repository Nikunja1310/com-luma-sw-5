package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDuffle;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    ShoppingCartPage shoppingcartPage = new ShoppingCartPage();
    OvernightDuffle overnightDuffle = new OvernightDuffle();

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homePage = new HomePage();
        gearPage = new GearPage();
        shoppingcartPage = new ShoppingCartPage();
        overnightDuffle = new OvernightDuffle();

    }

    @Test(groups = {"sanity"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnBagProductName();
        // Verify the text ‘Overnight Duffle’
        softAssert(overnightDuffle.verifyTheTextOvernightDuffle(), "Overnight Duffle","Text not matched");
        // Change Qty 3
        overnightDuffle.changeBagQuantity("3");
        // Click on ‘Add to Cart’ Button.
        overnightDuffle.clickOnAddToCartButton();
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        softAssert(overnightDuffle.verifyTextYouAdded_ProductNameMessage(), "You added Overnight Duffle to your shopping cart.","Text not verified");
        // Click on Product Name ‘Overnight Duffle’
        overnightDuffle.clickOnShoppingCartInToMessage();
        // Verify the product name ‘Overnight Duffle’
        softAssert(shoppingcartPage.verifyTheBagProductName(), "Overnight Duffle","Product name not verified");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingcartPage.verifyTheProductQuantity(), "3");

        // Verify the product price ‘$135.00’
        softAssert(shoppingcartPage.verifyTheProductPrice(), "$135.00","Not matching");
        // Change Qty to ‘5’
        shoppingcartPage.changeShoppingCartQuantity("5");
        // Click on ‘Update Shopping Cart’ button
        shoppingcartPage.updateShoppingCartButton();
        // Verify the product price ‘$225.00’
        softAssert(shoppingcartPage.verifyTheFinalProductPrice(), "$225.00","Not matching");

    }


}