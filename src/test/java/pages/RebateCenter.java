package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RebateCenterLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class RebateCenter {
	WebDriverHelper helper;
	ExtentTest test;
	
	public RebateCenter(ExtentTest test) {
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
			Screenshot.errorScreenShot("Failed to scroll down the page");
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
			helper.waitForElementToBeVisible(RebateCenterLocators.ecoActionsBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Eco Actions", test, RebateCenterLocators.ecoActionsBtn);
			helper.clickOnElement(RebateCenterLocators.ecoActionsBtn);
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
			helper.waitForElementToBeVisible(RebateCenterLocators.popUp, 10);
			Reporter.attachHighlightedScreenshotToReport("X Pop up", test, null);
			helper.clickOnElement(RebateCenterLocators.popUp);
			LoggerHandler.info("Clicked on X to close pop up");
			test.log(Status.PASS, "Clicked on X to close pop up");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on X to close pop up");
			LoggerHandler.error("Failed to click on X to close pop up");
			test.log(Status.FAIL, "Failed to click on X to close pop up");
		}
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
     * a. Method Name: clickOnRebateCenter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnRebateCenter() {
		try {
			helper.waitForElementToBeVisible(RebateCenterLocators.rebateCenter, 10);
			Reporter.attachHighlightedScreenshotToReport("Rebate Center", test, RebateCenterLocators.rebateCenter);
			helper.windowHandler(RebateCenterLocators.rebateCenter);
			LoggerHandler.info("Clicked on Rebate Center");
			test.log(Status.PASS, "Clicked on Rebate Center");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Rebate Center");
			LoggerHandler.error("Failed to click on Rebate Center");
			test.log(Status.FAIL, "Failed to click on Rebate Center");
		}
	}
	
	/*
     * a. Method Name: clickOnHomeBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnHomeBtn() {
		try {
			helper.waitForElementToBeVisible(RebateCenterLocators.homeBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Home button", test, RebateCenterLocators.homeBtn);
			helper.clickOnElement(RebateCenterLocators.homeBtn);
			LoggerHandler.info("Clicked on Home button");
			test.log(Status.PASS, "Clicked on Home button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Home button");
			LoggerHandler.error("Failed to click on Home button");
			test.log(Status.FAIL, "Failed to click on Home button");
		}
	}
	
	/*
     * a. Method Name: navigateBack
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Navigate back to the page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void navigateBack() {
		try {
			helper.navigateBack();
			LoggerHandler.info("Navigated to previous page");
			test.log(Status.PASS, "Navigated to previous page");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to navigate to previous page");
			LoggerHandler.error("Failed to navigate to previous page");
			test.log(Status.FAIL, "Failed to navigate to previous page");
		}
	}
	
	/*
     * a. Method Name: verifyRebateCenterLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyRebateCenterLabel() {
		try {
			helper.waitForElementToBeVisible(RebateCenterLocators.rebateCenterLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Rebate Label", test, RebateCenterLocators.rebateCenterLabel);
			String actualValueString = helper.getText(RebateCenterLocators.rebateCenterLabel);
			Assert.assertTrue(actualValueString.contains("Rebate"));
			LoggerHandler.info("Verified Rebate Label");
			test.log(Status.PASS, "Verified Rebate Label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Rebate Label");
			LoggerHandler.error("Failed to verify Rebate Label");
			test.log(Status.FAIL, "Failed to verify Rebate Label");
		}
	}
	
	/*
     * a. Method Name: rebateCenterTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void rebateCenterTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnEcoActions();
		closePopUp();
		scrollToFooter();
		clickOnRebateCenter();
		clickOnHomeBtn();
		navigateBack();
		verifyRebateCenterLabel();
	}
}
