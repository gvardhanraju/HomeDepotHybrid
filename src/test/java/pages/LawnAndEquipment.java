package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LawnAndEquipmentLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LawnAndEquipment {
	WebDriverHelper helper;
	ExtentTest test;
	
	public LawnAndEquipment(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
    /*
     * a. Method Name: clickOnMyStore
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnMyStore() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.myStoreBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("My Store", test, LawnAndEquipmentLocators.myStoreBtn);
			helper.clickOnElement(LawnAndEquipmentLocators.myStoreBtn);
			LoggerHandler.info("Clicked on My Store on the navigation bar");
			test.log(Status.PASS, "Clicked on My Store on the navigation bar");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on My Store on the navigation bars");
			LoggerHandler.error("Failed to click on My Store on the navigation bars");
			test.log(Status.FAIL, "Failed to click on My Store on the navigation bar");
		}
	}
	
    /*
     * a. Method Name: clickOnCurbsides
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnCurbsides() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.curbside, 10);
			Reporter.attachHighlightedScreenshotToReport("Curbside", test, LawnAndEquipmentLocators.curbside);
			helper.clickOnElement(LawnAndEquipmentLocators.curbside);
			LoggerHandler.info("Clicked on Curbside");
			test.log(Status.PASS, "Clicked on Curbside");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Curbside");
			LoggerHandler.error("Failed to click on Curbside");
			test.log(Status.FAIL, "Failed to click on Curbside");
		}
	}
	
    /*
     * a. Method Name: scroll
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll to the end of the page
     * d. Return Type: void
     * e. Parameters: 
     */
	public void scroll(int x, int y) {
		try {
			helper.scrollByValue(x, y);
			LoggerHandler.info("Scroll down the page");
			test.log(Status.PASS, "Scroll down the page");
		} catch (Exception e) {
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
    /*
     * a. Method Name: clickonLearnMore
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickonLearnMore() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.learnMore, 10);
			Reporter.attachHighlightedScreenshotToReport("Learn More", test, LawnAndEquipmentLocators.learnMore);
			helper.clickOnElement(LawnAndEquipmentLocators.learnMore);
			LoggerHandler.info("Clicked on Learn More");
			test.log(Status.PASS, "Clicked on Learn More");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Learn More");
			LoggerHandler.error("Failed to click on Learn More");
			test.log(Status.FAIL, "Failed to click on Learn More");
		}
	}
	
	
    /*
     * a. Method Name: clickOnRentals
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnRentals() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.rentals, 10);
			Reporter.attachHighlightedScreenshotToReport("Rentals", test, LawnAndEquipmentLocators.rentals);
			helper.clickOnElement(LawnAndEquipmentLocators.rentals);
			LoggerHandler.info("Clicked on Rentals");
			test.log(Status.PASS, "Clicked on Rentals");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Rentals");
			LoggerHandler.error("Failed to click on Rentals");
			test.log(Status.FAIL, "Failed to click on Rentals");
		}
	}
	
    /*
     * a. Method Name: clickOnRentNow
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnRentNow() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.rentNowBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Rent Now", test, LawnAndEquipmentLocators.lawnEquipmentLabel);
			helper.clickOnElement(LawnAndEquipmentLocators.rentNowBtn);
			LoggerHandler.info("Clicked on Rent Now Button");
			test.log(Status.PASS, "Clicked on Rent Now Button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Rent Now Button");
			LoggerHandler.error("Failed to click on Rent Now Button");
			test.log(Status.FAIL, "Failed to click on Rent Now Button");
		}
	}
	
	/*
     * a. Method Name: verifyInfoLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyInfoLabel() {
		try {
			helper.waitForElementToBeVisible(LawnAndEquipmentLocators.lawnEquipmentLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Lawn & Garden", test, LawnAndEquipmentLocators.lawnEquipmentLabel);
			String actualValueString = helper.getText(LawnAndEquipmentLocators.lawnEquipmentLabel);
			Assert.assertTrue(actualValueString.contains("LAWN"));
			LoggerHandler.info("Verified Lawn & Garden Equipment Rental header label");
			test.log(Status.PASS, "Verified Lawn & Garden Equipment Rental header label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Lawn & Garden Equipment Rental header label");
			LoggerHandler.error("Failed to verify Lawn & Garden Equipment Rental header label");
			test.log(Status.FAIL, "Failed to verify Lawn & Garden Equipment Rental header label");
		}
	}
	
	/*
     * a. Method Name: lawnAndEquipmentTestcse
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void lawnAndEquipmentTestcse() {
		clickOnMyStore();
		clickOnCurbsides();
		scroll(0, 200);
		scroll(0, 200);
		clickonLearnMore();
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnRentals();
		scroll(0, 200);
		scroll(0, 200);
		clickOnRentNow();
		verifyInfoLabel();
	}
	
}
