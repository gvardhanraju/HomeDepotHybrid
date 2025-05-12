package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HeavyDutyToolsLocators;
import uistore.RollingToolBoxesLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class RollingToolBoxes {
	WebDriverHelper helper;
	ExtentTest test;
	
	public RollingToolBoxes(ExtentTest test) {
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
     * a. Method Name: clickOnHuskyBrand
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnHuskyBrand() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.huskyBrandBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Husky Brand", test, HeavyDutyToolsLocators.huskyBrandBtn);
			helper.clickOnElement(HeavyDutyToolsLocators.huskyBrandBtn);
			LoggerHandler.info("Clicked on Husky Brand");
			test.log(Status.PASS, "Clicked on Husky Brand");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Husky Brand");
			LoggerHandler.error("Failed to click on Husky Brand");
			test.log(Status.FAIL, "Failed to click on Husky Brand");
		}
	}
	
	/*
     * a. Method Name: clickOnRollingToolBoxes
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnRollingToolBoxes() {
		try {
			helper.waitForElementToBeVisible(RollingToolBoxesLocators.rollingTool, 10);
			Reporter.attachHighlightedScreenshotToReport("Rolling Tool Boxes", test, RollingToolBoxesLocators.rollingTool);
			helper.clickOnElement(RollingToolBoxesLocators.rollingTool);
			LoggerHandler.info("Clicked on Rolling Tool Boxes");
			test.log(Status.PASS, "Clicked on Rolling Tool Boxes");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Rolling Tool Boxes");
			LoggerHandler.error("Failed to click on Rolling Tool Boxes");
			test.log(Status.FAIL, "Failed to click on Rolling Tool Boxes");
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
     * a. Method Name: clickOnBrand
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnBrand() {
		try {
			helper.waitForElementToBeVisible(RollingToolBoxesLocators.brand, 10);
			Reporter.attachHighlightedScreenshotToReport("Brand Category", test, RollingToolBoxesLocators.brand);
			helper.clickOnElement(RollingToolBoxesLocators.brand);
			LoggerHandler.info("Clicked on Brand Category");
			test.log(Status.PASS, "Clicked on Brand Category");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Brand Category");
			LoggerHandler.error("Failed to click on Brand Category");
			test.log(Status.FAIL, "Failed to click on Brand Category");
		}
	}
	
	/*
     * a. Method Name: clickOnRidgidBrand
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnRidgidBrand() {
		try {
			helper.waitForElementToBeVisible(RollingToolBoxesLocators.ridgidBrand, 10);
			Reporter.attachHighlightedScreenshotToReport("Ridgid Brand", test, null);
			helper.clickOnElement(RollingToolBoxesLocators.ridgidBrand);
			LoggerHandler.info("Clicked on Ridgid Brand");
			test.log(Status.PASS, "Clicked on Ridgid Brand");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Ridgid Brand");
			LoggerHandler.error("Failed to click on Ridgid Brand");
			test.log(Status.FAIL, "Failed to click on Ridgid Brand");
		}
	}
	
	/*
     * a. Method Name: clickOnUpdate
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnUpdate() {
		try {
			helper.waitForElementToBeVisible(RollingToolBoxesLocators.updateBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Update button", test, RollingToolBoxesLocators.updateBtn);
			helper.clickOnElement(RollingToolBoxesLocators.updateBtn);
			LoggerHandler.info("Clicked on Update button");
			test.log(Status.PASS, "Clicked on Update button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Update button");
			LoggerHandler.error("Failed to click on Update button");
			test.log(Status.FAIL, "Failed to click on Update button");
		}
	}
	
	/*
     * a. Method Name: verifyPageUrl
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the title of the page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyPageUrl() {
		try {
			String actualValueString = helper.getTitle();
			Assert.assertTrue(actualValueString.contains("Rolling Tool Box"));
			LoggerHandler.info("Verified Rolling Tool Box page title");
			test.log(Status.PASS, "Verified Rolling Tool Box page title");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Rolling Tool Box page title");
			LoggerHandler.error("Failed to verify Rolling Tool Box page title");
			test.log(Status.FAIL, "Failed to verify Rolling Tool Box page title");
		}
	}
	
	/*
     * a. Method Name: rollingToolBoxesTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void rollingToolBoxesTestcase() {
		scrollToFooter();
		clickOnHuskyBrand();
		clickOnRollingToolBoxes();
		scroll(0, 200);
		clickOnBrand();
		clickOnRidgidBrand();
		verifyPageUrl();
	}
}
