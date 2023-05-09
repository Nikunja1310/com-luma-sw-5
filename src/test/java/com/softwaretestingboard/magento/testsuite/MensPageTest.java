package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.*;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MensPageTest extends BaseTest {
    HomePage homepage = new HomePage();
    MenPage menpage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homepage = new HomePage();
        menpage = new MenPage();
        shoppingCart = new ShoppingCartPage();
    }

    @Test(groups = {"smoke"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.mouseHoverOnMenMenu();
        homepage.mouseHoverOnBottom();
        homepage.clickOnPants();
        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menpage.pantSize();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menpage.pantColour();
        menpage.addToCart();
        Assert.assertEquals(menpage.verifyAddedItemToTheShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menpage.clickOnShoppingCartInMessage();
        Assert.assertEquals(shoppingCart.verifyTextShoppingCart(), "Shopping Cart");
        Assert.assertEquals(shoppingCart.verifyTheProductName(), "Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.verifyTheProductSize(), "32");
        Assert.assertEquals(shoppingCart.verifyTheProductNameColour(), "Black");
    }


}