package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HeavyDutyToolsLocators;
import uistore.MobileWorkBenchesLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MobileWorkBenches {
	WebDriverHelper helper;
	ExtentTest test;
	
	public MobileWorkBenches(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
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
     * a. Method Name: clickOnMobileWorkBenches
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnMobileWorkBenches() {
		try {
			helper.waitForElementToBeVisible(MobileWorkBenchesLocators.mobileWorkBenchesBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Mobile Work Benches", test, MobileWorkBenchesLocators.mobileWorkBenchesBtn);
			helper.clickOnElement(MobileWorkBenchesLocators.mobileWorkBenchesBtn);
			LoggerHandler.info("Clicked on Mobile Work Benches");
			test.log(Status.PASS, "Clicked on Mobile Work Benches");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Mobile Work Benches");
			LoggerHandler.error("Failed to click on Mobile Work Benches");
			test.log(Status.FAIL, "Failed to click on Mobile Work Benches");
		}
	}
	
	/*
     * a. Method Name: clickOnBlackColorFilter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnBlackColorFilter() {
		try {
			helper.waitForElementToBeVisible(MobileWorkBenchesLocators.blackColor, 10);
			Reporter.attachHighlightedScreenshotToReport("Black Color Filter", test, MobileWorkBenchesLocators.blackColor);
			helper.clickOnElement(MobileWorkBenchesLocators.blackColor);
			LoggerHandler.info("Clicked on Black Color Filter");
			test.log(Status.PASS, "Clicked on Black Color Filter");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Black Color Filter");
			LoggerHandler.error("Failed to click on Black Color Filter");
			test.log(Status.FAIL, "Failed to click on Black Color Filter");
		}
	}
	
	 /*
     * a. Method Name: verifyNewAccount
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyBlackHuskyMobileWorkBenchesLabel() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.huskyToolsChestsLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Black Husky Label", test, HeavyDutyToolsLocators.huskyToolsChestsLabel);
			String actualValueString = helper.getText(HeavyDutyToolsLocators.huskyToolsChestsLabel);
			Assert.assertTrue(actualValueString.contains("BLACK HUSKY"));
			LoggerHandler.info("Verified BLACK HUSKY MOBILE WORKBENCHES header label");
			test.log(Status.PASS, "Verified BLACK HUSKY MOBILE WORKBENCHES header label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify BLACK HUSKY MOBILE WORKBENCHES header label");
			LoggerHandler.error("Failed to verify BLACK HUSKY MOBILE WORKBENCHES header label");
			test.log(Status.FAIL, "Failed to verify BLACK HUSKY MOBILE WORKBENCHES header label");
		}
	}
	
	/*
     * a. Method Name: mobileWorkBenchesTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void mobileWorkBenchesTestcase() {
		scrollToFooter();
		clickOnHuskyBrand();
		clickOnMobileWorkBenches();
		clickOnBlackColorFilter();
		verifyBlackHuskyMobileWorkBenchesLabel();
	}
}
