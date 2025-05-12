package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CorporateReponsibilityLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CorporateResponsibility {
	WebDriverHelper helper;
	ExtentTest test;
	
	public CorporateResponsibility(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
	 /*
     * a. Method Name: clickOnCoporateResponsibility
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnCoporateResponsibility() {
		try {
			helper.waitForElementToBeVisible(CorporateReponsibilityLocators.corporateReponsibilityBtn, 3);
			Reporter.attachHighlightedScreenshotToReport("Corporate Responsibility", test, CorporateReponsibilityLocators.corporateReponsibilityBtn);
			helper.clickOnElement(CorporateReponsibilityLocators.corporateReponsibilityBtn);
			LoggerHandler.info("Clicked on Corporate Reponsibility");
			test.log(Status.PASS, "Clicked on Corporate Reponsibility");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Corporate Reponsibility");
			LoggerHandler.error("Failed to click on Corporate Reponsibility");
			test.log(Status.FAIL, "Failed to click on Corporate Reponsibility");
		}
	}
	
	 /*
     * a. Method Name: hoverOverLivingOurValues
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Hover over an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void hoverOverLivingOurValues() {
		try {
			helper.waitForElementToBeVisible(CorporateReponsibilityLocators.livingOurValues, 3);
			Reporter.attachHighlightedScreenshotToReport("Living Our Values", test, CorporateReponsibilityLocators.livingOurValues);
			helper.hoverOverElement(CorporateReponsibilityLocators.livingOurValues);
			LoggerHandler.info("Hovered over Living Our Values");
			test.log(Status.PASS, "Hovered over Living Our Values");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to hover over Living Our Values");
			LoggerHandler.error("Failed to hover over Living Our Values");
			test.log(Status.FAIL, "Failed to hover over Living Our Values");
		}
	}
	
	 /*
     * a. Method Name: clickOnCoporateResponsibility
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnWeAreTHD() {
		try {
			helper.waitForElementToBeVisible(CorporateReponsibilityLocators.weAreTHDBy, 3);
			Reporter.attachHighlightedScreenshotToReport("WeAreTHD", test, CorporateReponsibilityLocators.weAreTHDBy);
			helper.clickOnElement(CorporateReponsibilityLocators.weAreTHDBy);
			LoggerHandler.info("Clicked on WeAreTHD");
			test.log(Status.PASS, "Clicked on WeAreTHD");
		} catch (Exception e) {
			Screenshot.errorScreenShot(null);
			LoggerHandler.error("Failed to click on WeAreTHD");
			test.log(Status.FAIL, "Failed to click on WeAreTHD");
		}
	}
	
	 /*
     * a. Method Name: scrollToFooter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll to the end of the page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void scrollToFooter() {
		try {
			helper.scrollToEnd();
			LoggerHandler.info("Scrolled to the footer");
			test.log(Status.PASS, "Scrolled to the footer");
		} catch (Exception e) {
			LoggerHandler.error("Failed to scroll to the footer");
			test.log(Status.FAIL, "Failed to scroll to the footer");
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
			Thread.sleep(1000);
			LoggerHandler.info("Scroll down the page");
			test.log(Status.PASS, "Scroll down the page");
		} catch (Exception e) {
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
	 /*
     * a. Method Name: clickOnAboutUs
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnAboutUs() {
		try {
			helper.waitForElementToBeVisible(CorporateReponsibilityLocators.aboutUs, 3);
			Reporter.attachHighlightedScreenshotToReport("About Us", test, CorporateReponsibilityLocators.aboutUs);
			helper.clickOnElement(CorporateReponsibilityLocators.aboutUs);
			LoggerHandler.info("Clicked on About Us");
			test.log(Status.PASS, "Clicked on About Us");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on About Us");
			LoggerHandler.error("Failed to click on About Us");
			test.log(Status.FAIL, "Failed to click on About Us");
		}
	}
	
	 /*
     * a. Method Name: verifyMorals
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyMorals() {
		try {
			helper.waitForElementToBeVisible(CorporateReponsibilityLocators.moralsMessage, 5);
			Reporter.attachHighlightedScreenshotToReport("Moral Message", test, CorporateReponsibilityLocators.moralsMessage);
			String actualValueString = helper.getText(CorporateReponsibilityLocators.moralsMessage);
			Assert.assertTrue(actualValueString.contains("BUILT"));
			LoggerHandler.info("Verified Moral Message");
			test.log(Status.PASS, "Verified Moral Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Moral Message");
			LoggerHandler.error("Failed to verify Moral Message");
			test.log(Status.FAIL, "Failed to verify Moral Message");
		}
	}
	
	 /*
     * a. Method Name: corporateResponsibiltyTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void corporateResponsibiltyTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnCoporateResponsibility();
		hoverOverLivingOurValues();
		clickOnWeAreTHD();
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnAboutUs();
		scroll(0, 500);
		verifyMorals();
	}
}
