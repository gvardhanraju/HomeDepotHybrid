package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PrivacyPolicyLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PrivacyPolicy {
	WebDriverHelper helper;
	ExtentTest test;
	
	public PrivacyPolicy(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
	/*
     * a. Method Name: clickOnMyStore
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnMyStore() {
		try {
			helper.waitForElementToBeVisible(PrivacyPolicyLocators.myStoreBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("My Store", test, PrivacyPolicyLocators.myStoreBtn);
			helper.clickOnElement(PrivacyPolicyLocators.myStoreBtn);
			LoggerHandler.info("Clicked on My Store on the navigation bar");
			test.log(Status.PASS, "Clicked on My Store on the navigation bar");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on My Store on the navigation bars");
			LoggerHandler.error("Failed to click on My Store on the navigation bars");
			test.log(Status.FAIL, "Failed to click on My Store on the navigation bar");
		}
	}
	
	/*
     * a. Method Name: clickOnWorkshops
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnWorkshops() {
		try {
			helper.waitForElementToBeVisible(PrivacyPolicyLocators.workshops, 10);
			Reporter.attachHighlightedScreenshotToReport("Workshops", test, PrivacyPolicyLocators.workshops);
			helper.clickOnElement(PrivacyPolicyLocators.workshops);
			LoggerHandler.info("Clicked on Workshops");
			test.log(Status.PASS, "Clicked on Workshops");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Workshops");
			LoggerHandler.error("Failed to click on Workshops");
			test.log(Status.FAIL, "Failed to click on Workshops");
		}
	}
	
	/*
     * a. Method Name: clickOnLearnMore
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnLearnMore() {
		try {
			helper.waitForElementToBeVisible(PrivacyPolicyLocators.learnMoreBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Learn More", test, PrivacyPolicyLocators.learnMoreBtn);
			helper.windowHandler(PrivacyPolicyLocators.learnMoreBtn);
			LoggerHandler.info("Clicked on Learn More");
			test.log(Status.PASS, "Clicked on Learn More");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Learn More");
			LoggerHandler.error("Failed to click on Learn More");
			test.log(Status.FAIL, "Failed to click on Learn More");
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
     * a. Method Name: verifyInfoLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyInfoLabel() {
		try {
			String actualValueString = helper.getText(PrivacyPolicyLocators.infoLabel);
			Reporter.attachHighlightedScreenshotToReport("Can’t find what you’re looking for?", test, PrivacyPolicyLocators.infoLabel);
			Assert.assertTrue(actualValueString.contains("Can"));
			LoggerHandler.info("Verified Can’t find what you’re looking for? message");
			test.log(Status.PASS, "Verified Can’t find what you’re looking for? message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Can’t find what you’re looking for? message");
			LoggerHandler.error("Failed to verify Can’t find what you’re looking for? message");
			test.log(Status.FAIL, "Failed to verify Can’t find what you’re looking for? message");
		}
	}
	
	/*
     * a. Method Name: clickOnPrivacyPolicy
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnPrivacyPolicy() {
		try {
			helper.waitForElementToBeVisible(PrivacyPolicyLocators.privacyPolicy, 10);
			Reporter.attachHighlightedScreenshotToReport("Privacy Policy", test, PrivacyPolicyLocators.privacyPolicy);
			helper.clickOnElement(PrivacyPolicyLocators.privacyPolicy);
			LoggerHandler.info("Clicked on Privacy Policy");
			test.log(Status.PASS, "Clicked on Privacy Policy");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Privacy Policy");
			LoggerHandler.error("Failed to click on Privacy Policy");
			test.log(Status.FAIL, "Failed to click on Privacy Policy");
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
     * a. Method Name: privacyPolicyTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void privacyPolicyTestcase() {
		clickOnMyStore();
		scroll(0, 200);
		scroll(0, 200);
		clickOnWorkshops();
		scroll(0, 200);
		scroll(0, 200);
		scroll(0, 200);
		clickOnLearnMore();
		scrollToFooter();
		verifyInfoLabel();
		clickOnPrivacyPolicy();
	}
}
