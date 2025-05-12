package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CarbonEmissionsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CarbonEmissions {
	WebDriverHelper helper;
	ExtentTest test;
	
	public CarbonEmissions(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
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
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
	 /*
     * a. Method Name: clickOnEcoActions
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnEcoActions() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.ecoActionsBtn, 3);
			Reporter.attachHighlightedScreenshotToReport("Eco Actions", test, CarbonEmissionsLocators.ecoActionsBtn);
			helper.clickOnElement(CarbonEmissionsLocators.ecoActionsBtn);
			LoggerHandler.info("Clicked on Eco Actions");
			test.log(Status.PASS, "Clicked on Eco Actions");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Eco Actions");
			LoggerHandler.error("Failed to click on Eco Actions");
			test.log(Status.FAIL, "Failed to click on Eco Actions");
		}
	}
	
	 /*
     * a. Method Name: closePopUp
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void closePopUp() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.popUp, 3);
			Reporter.attachHighlightedScreenshotToReport("Close Pop up", test, CarbonEmissionsLocators.popUp);
			helper.clickOnElement(CarbonEmissionsLocators.popUp);
			LoggerHandler.info("Clicked on X to close pop up");
			test.log(Status.PASS, "Clicked on X to close pop up");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on X to close pop up");
			LoggerHandler.error("Failed to click on X to close pop up");
			test.log(Status.FAIL, "Failed to click on X to close pop up");
		}
	}
	
	 /*
     * a. Method Name: hoverOverOurPillars
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Hover over an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void hoverOverOurPillars() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.ourPillars, 3);
			Reporter.attachHighlightedScreenshotToReport("Our Pillars", test, CarbonEmissionsLocators.ourPillars);
			helper.hoverOverElement(CarbonEmissionsLocators.ourPillars);
			LoggerHandler.info("Hovered over Our Pillars");
			test.log(Status.PASS, "Hovered over Our Pillars");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to hovered over Our Pillars");
			LoggerHandler.error("Failed to hovered over Our Pillars");
			test.log(Status.FAIL, "Failed to hovered over Our Pillars");
		}
	}
	
	 /*
     * a. Method Name: clickOnCarbonEmissions
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnCarbonEmissions() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.carbonEmissions, 3);
			Reporter.attachHighlightedScreenshotToReport("Carbon Emissions", test, CarbonEmissionsLocators.carbonEmissions);
			helper.clickOnElement(CarbonEmissionsLocators.carbonEmissions);
			LoggerHandler.info("Clicked on Carbon Emissions");
			test.log(Status.PASS, "Clicked on Carbon Emissions");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Carbon Emissions");
			LoggerHandler.error("Failed to click on Carbon Emissions");
			test.log(Status.FAIL, "Failed to click on Carbon Emissions");
		}
	}
	
	 /*
     * a. Method Name: clickOnCarbonEmissionsProducts
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnCarbonEmissionsProducts() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.carbonEmissionsProducts, 3);
			Reporter.attachHighlightedScreenshotToReport("Carbon Emission Products", test, CarbonEmissionsLocators.carbonEmissionsProducts);
			helper.clickOnElement(CarbonEmissionsLocators.carbonEmissionsProducts);
			LoggerHandler.info("Clicked on Carbon Emissions Products");
			test.log(Status.PASS, "Clicked on Carbon Emissions Products");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Carbon Emissions Products");
			LoggerHandler.error("Failed to click on Carbon Emissions Products");
			test.log(Status.FAIL, "Failed to click on Carbon Emissions Products");
		}
	}
	
	 /*
     * a. Method Name: verifyProductIndexLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyProductIndexLabel() {
		try {
			helper.waitForElementToBeVisible(CarbonEmissionsLocators.productIndexLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Product Index", test, CarbonEmissionsLocators.productIndexLabel);
			String actualValueString = helper.getText(CarbonEmissionsLocators.productIndexLabel);
			Assert.assertTrue(actualValueString.contains("Product"));
			LoggerHandler.info("Verified Product Index Label");
			test.log(Status.PASS, "Verified Product Index Label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Product Index Label");
			LoggerHandler.error("Failed to verify Product Index Label");
			test.log(Status.FAIL, "Failed to verify Product Index Label");
		}
	}
	
	 /*
     * a. Method Name: carbonEmissionsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void carbonEmissionsTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnEcoActions();
		closePopUp();
		hoverOverOurPillars();
		clickOnCarbonEmissions();
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnCarbonEmissionsProducts();
		verifyProductIndexLabel();
	}
}
