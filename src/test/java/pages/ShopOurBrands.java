package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ShopOurBrandsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ShopOurBrands {
	WebDriverHelper helper;
	ExtentTest test;
	
	public ShopOurBrands(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
	/*
     * a. Method Name: scrollToFooter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll the page by the value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void scrollToFooter() {
		try {
			helper.scrollToEnd();
			LoggerHandler.info("Scrolled to the footer");
			test.log(Status.PASS, "Scrolled to the footer");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to scroll to the footer");
			LoggerHandler.error("Failed to scroll to the footer");
			test.log(Status.FAIL, "Failed to scroll to the footer");
		}
	}
	
	/*
     * a. Method Name: clickOnShopOurBrands
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnShopOurBrands() {
		try {
			helper.waitForElementToBeVisible(ShopOurBrandsLocators.shopOurBrandsLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Shop our Brands", test, ShopOurBrandsLocators.shopOurBrandsLabel);
			helper.javascriptClick(ShopOurBrandsLocators.shopOurBrandsLabel);
			LoggerHandler.info("Clicked on Shop our Brands");
			test.log(Status.PASS, "Clicked on Shop our Brands");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Shop our Brands");
			LoggerHandler.error("Failed to click on Shop our Brands");
			test.log(Status.FAIL, "Failed to click on Shop our Brands");
		}
	}
	
	/*
     * a. Method Name: clickOnAnvilBrand
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnAnvilBrand() {
		try {
			helper.waitForElementToBeVisible(ShopOurBrandsLocators.anvilBrand, 10);
			Reporter.attachHighlightedScreenshotToReport("Anvil Brand", test, ShopOurBrandsLocators.anvilBrand);
			helper.javascriptClick(ShopOurBrandsLocators.anvilBrand);
			LoggerHandler.info("Clicked on Anvil Brand");
			test.log(Status.PASS, "Clicked on Anvil Brand");
		} catch (Exception e) {
			Screenshot.captureScreenShot("Failed to click on Anvil Brand");
			LoggerHandler.error("Failed to click on Anvil Brand");
			test.log(Status.FAIL, "Failed to click on Anvil Brand");
		}
	}
	
	/*
     * a. Method Name: scroll
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll the page by the value
     * d. Return Type: void
     * e. Parameters: 
     *      - int x: Number of pixels to scroll Horizontally
     *      - int y: Number of pixels to scroll Veritically
     */
	public void scroll(int x, int y) {
		try {
			helper.scrollByValue(x, y);
			LoggerHandler.info("Scroll down the page");
			test.log(Status.PASS, "Scroll down the page");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to scroll down the page");
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
	/*
     * a. Method Name: clickOnSortByDropdown
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSortByDropdown() {
		try {
			helper.waitForElementToBeVisible(ShopOurBrandsLocators.sortBy, 10);
			Reporter.attachHighlightedScreenshotToReport("Sort by Dropdown", test, ShopOurBrandsLocators.sortBy);
			helper.clickOnElement(ShopOurBrandsLocators.sortBy);
			LoggerHandler.info("Clicked on Sort By dropdown");
			test.log(Status.PASS, "Clicked on Sort By dropdown");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Sort By dropdown");
			LoggerHandler.error("Failed to click on Sort By dropdown");
			test.log(Status.FAIL, "Failed to click on Sort By dropdown");
		}
	}
	
	/*
     * a. Method Name: selectPriceLowToHigh
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void selectPriceLowToHigh() {
		try {
			helper.waitForElementToBeVisible(ShopOurBrandsLocators.priceLowToHigh, 10);
			Reporter.attachHighlightedScreenshotToReport("Price Low to High", test, ShopOurBrandsLocators.priceLowToHigh);
			helper.javascriptClick(ShopOurBrandsLocators.priceLowToHigh);
			LoggerHandler.info("Clicked on Price Low to High");
			test.log(Status.PASS, "Clicked on Price Low to High");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Price Low to High");
			LoggerHandler.error("Failed to click on Price Low to High");
			test.log(Status.FAIL, "Failed to click on Price Low to High");
		}
	}
	
	/*
     * a. Method Name: verifyPriceLowToHighLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyPriceLowToHighLabel() {
		try {
			helper.waitForElementToBeVisible(ShopOurBrandsLocators.priceLowToHighLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Low to High Label", test, ShopOurBrandsLocators.priceLowToHighLabel);
			String actualValueString = helper.getText(ShopOurBrandsLocators.priceLowToHighLabel);
			Assert.assertTrue(actualValueString.contains("Low to High"));
			LoggerHandler.info("Verified Price Low to High Label");
			test.log(Status.PASS, "Verified Price Low to High Label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Price Low to High Label");
			LoggerHandler.error("Failed to verify Price Low to High Label");
			test.log(Status.FAIL, "Failed to verify Price Low to High Label");
		}
	}
	
	
	/*
     * a. Method Name: shopOurBrandsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void shopOurBrandsTestcase() {
		scrollToFooter();
		clickOnShopOurBrands();
		clickOnAnvilBrand();
		scroll(0, 200);
		clickOnSortByDropdown();
		selectPriceLowToHigh();
		verifyPriceLowToHighLabel();
	}
}
