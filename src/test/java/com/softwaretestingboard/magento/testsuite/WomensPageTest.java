package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomensPageTest extends BaseTest {

        HomePage homepage = new HomePage();
        WomenPage womenPage = new WomenPage();

    @BeforeMethod
    public void inIt(){
        homepage =new HomePage();
        womenPage =new WomenPage();
    }
        @Test(groups = {"sanity"})
        public void verifyTheSortByProductNameFilter() throws InterruptedException {

            homepage.mouseHoverOnWomenMenu();
            homepage.mouseHoverOnTops();
            homepage.clickOnJackets();
            Assert.assertEquals(womenPage.productListAfterSorting(), womenPage.productListBeforeSorting());
        }


        @Test(groups = {"smoke","regression"})
        public void verifyTheSortByPriceFilter() throws InterruptedException {
            homepage.mouseHoverOnWomenMenu();
            homepage.mouseHoverOnTops();
            homepage.clickOnJackets();

            Assert.assertEquals(womenPage.priceListAfterSorting(), womenPage.priceListBeforeSorting());
        }


    }
