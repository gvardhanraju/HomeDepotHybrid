package pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HeavyDutyToolsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HeavyDutyTools {
	WebDriverHelper helper;
	ExtentTest test;
	
	public HeavyDutyTools(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
    /*
     * a. Method Name: scrollToFooter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll to the end of the page
     * d. Return Type: void
     * e. Parameters: 
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
     * a. Method Name: clickOnHuskyBrand
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnHuskyBrand() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.huskyBrandBtn, 5);
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
     * a. Method Name: clickOnToolChest
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnToolChest() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.toolChestBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Tool Chest", test, HeavyDutyToolsLocators.toolChestBtn);
			helper.clickOnElement(HeavyDutyToolsLocators.toolChestBtn);
			LoggerHandler.info("Clicked on Tool Chest");
			test.log(Status.PASS, "Clicked on Tool Chest");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Tool Chest");
			LoggerHandler.error("Failed to click on Tool Chest");
			test.log(Status.FAIL, "Failed to click on Tool Chest");
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
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
    /*
     * a. Method Name: clickOnShopNow
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnShopNow() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.shopNowBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Shop Now", test, HeavyDutyToolsLocators.shopNowBtn);
			helper.clickOnElement(HeavyDutyToolsLocators.shopNowBtn);
			LoggerHandler.info("Clicked on Shop Now");
			test.log(Status.PASS, "Clicked on Shop Now");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Shop Now");
			LoggerHandler.error("Failed to click on Shop Now");
			test.log(Status.FAIL, "Failed to click on Shop Now");
		}
	}
	
    /*
     * a. Method Name: clickOnGradeDropdown
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnGradeDropdown() {
		try {
			helper.scrollToElement(HeavyDutyToolsLocators.gradeDropdownBy);
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.gradeDropdownBy, 10);
			Reporter.attachHighlightedScreenshotToReport("Grade Dropdown", test, HeavyDutyToolsLocators.gradeDropdownBy);
			helper.javascriptClick(HeavyDutyToolsLocators.gradeDropdownBy);
			LoggerHandler.info("Clicked on Grade Dropdown");
			test.log(Status.PASS, "Clicked on Grade Dropdown");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Grade Dropdown");
			LoggerHandler.error("Failed to click on Grade Dropdown");
			test.log(Status.FAIL, "Failed to click on Grade Dropdown");
		}
	}
	
    /*
     * a. Method Name: clickOnHeavyDuty
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnHeavyDuty() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.heavtyDutyOption, 10);
			Reporter.attachHighlightedScreenshotToReport("Heavy Duty", test, HeavyDutyToolsLocators.heavtyDutyOption);
			helper.clickOnElement(HeavyDutyToolsLocators.heavtyDutyOption);
			LoggerHandler.info("Clicked on Heavy Duty");
			test.log(Status.PASS, "Clicked on Heavy Duty");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Heavy Duty");
			LoggerHandler.error("Failed to click on Heavy Duty");
			test.log(Status.FAIL, "Failed to click on Heavy Duty");
		}
	}
	
    /*
     * a. Method Name: clickOnApplyBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnApplyBtn() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.applyNowBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Apply Button", test, HeavyDutyToolsLocators.applyNowBtn);
			helper.clickOnElement(HeavyDutyToolsLocators.applyNowBtn);
			LoggerHandler.info("Clicked on Apply Now");
			test.log(Status.PASS, "Clicked on Apply Now");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Apply Now");
			LoggerHandler.error("Failed to click on Apply Now");
			test.log(Status.FAIL, "Failed to click on Apply Now");
		}
	}
	
	/*
     * a. Method Name: verifyHuskyToolChestsLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyHuskyToolChestsLabel() {
		try {
			helper.waitForElementToBeVisible(HeavyDutyToolsLocators.huskyToolsChestsLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Husky Tool Chests", test, HeavyDutyToolsLocators.huskyToolsChestsLabel);
			String actualValueString = helper.getText(HeavyDutyToolsLocators.huskyToolsChestsLabel);
			Assert.assertTrue(actualValueString.contains("HUSKY"));
			LoggerHandler.info("Verified HUSKY TOOL CHESTS header label");
			test.log(Status.PASS, "Verified HUSKY TOOL CHESTS header label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify HUSKY TOOL CHESTS header label");
			LoggerHandler.error("Failed to verify HUSKY TOOL CHESTS header label");
			test.log(Status.FAIL, "Failed to verify HUSKY TOOL CHESTS header label");
		}
	}
	
	/*
     * a. Method Name: heavyDutyToolsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void heavyDutyToolsTestcase() {
		scrollToFooter();
		clickOnHuskyBrand();
		clickOnToolChest();
		scroll(0, 200);
		clickOnShopNow();
		clickOnGradeDropdown();
		clickOnHeavyDuty();
		clickOnApplyBtn();
		verifyHuskyToolChestsLabel();
	}
}
