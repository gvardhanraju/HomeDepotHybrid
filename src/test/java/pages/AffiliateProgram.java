package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AffiliateProgramLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AffiliateProgram {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public AffiliateProgram(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
    /*
     * a. Method Name: clickOnAffiliateProgram
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnAffiliateProgram() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.affiliateProgram, 3);
			Reporter.attachHighlightedScreenshotToReport("Affiliate Program", test, AffiliateProgramLocators.affiliateProgram);
			Screenshot.errorScreenShot("Failed to click on Affiliate Program");
			helper.clickOnElement(AffiliateProgramLocators.affiliateProgram);
			LoggerHandler.info("Clicked on Affiliate Program");
			test.log(Status.PASS, "Clicked on Affiliate Program");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Affiliate Program");
			LoggerHandler.error("Failed to click on Affiliate Program");
			test.log(Status.FAIL, "Failed to click on Affiliate Program");
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
			Screenshot.errorScreenShot("");
			LoggerHandler.error("Failed to scroll down the page");
			test.log(Status.FAIL, "Failed to scroll down the page");
		}
	}
	
    /*
     * a. Method Name: clickOnGetStarted
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnGetStarted() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.affiliateHomeProgram, 3);
			Reporter.attachHighlightedScreenshotToReport("Get Started", test, AffiliateProgramLocators.signInBtn);
			helper.windowHandler(AffiliateProgramLocators.affiliateHomeProgram);
			LoggerHandler.info("Clicked on Affiliate Program Get Started");
			test.log(Status.PASS, "Clicked on Affiliate Program Get Started");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Affiliate Program Get Started");
			LoggerHandler.error("Failed to click on Affiliate Program Get Started");
			test.log(Status.FAIL, "Failed to click on Affiliate Program Get Started");
		}
	}
	
    /*
     * a. Method Name: clickOnSignBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSignBtn() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.signInBtn, 3);
			Reporter.attachHighlightedScreenshotToReport("Sign In", test, AffiliateProgramLocators.signInBtn);
			helper.clickOnElement(AffiliateProgramLocators.signInBtn);
			LoggerHandler.info("Clicked on Sign In button");
			test.log(Status.PASS, "Clicked on Sign In button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Sign In button");
			LoggerHandler.error("Failed to click on Sign In button");
			test.log(Status.FAIL, "Failed to click on Sign In button");
		}
	}
	
    /*
     * a. Method Name: clickOnForgotPassword
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnForgotPassword() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.forgotPasswordBtn, 3);
			Reporter.attachHighlightedScreenshotToReport("Affiliate Program", test, AffiliateProgramLocators.forgotPasswordBtn);
			helper.clickOnElement(AffiliateProgramLocators.forgotPasswordBtn);
			LoggerHandler.info("Clicked on Forgot Password button");
			test.log(Status.PASS, "Clicked on Forgot Password button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Forgot Password button");
			LoggerHandler.error("Failed to click on Forgot Password button");
			test.log(Status.FAIL, "Failed to click on Forgot Password button");
		}
	}
	
    /*
     * a. Method Name: enterInvalidEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterInvalidEmail() {
		try {
			String testData = ExcelReader.readData(excelPath, sheetName, 0, 0);
			helper.waitForElementToBeVisible(AffiliateProgramLocators.emailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Input", test, AffiliateProgramLocators.emailInputField);
			helper.sendData(AffiliateProgramLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
    /*
     * a. Method Name: clickOnSubmitBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSubmitBtn() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.submitBtn, 3);
			Reporter.attachHighlightedScreenshotToReport("Submit Button", test, AffiliateProgramLocators.submitBtn);
			helper.clickOnElement(AffiliateProgramLocators.submitBtn);
			LoggerHandler.info("Clicked on Submit button");
			test.log(Status.PASS, "Clicked on Submit button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Submit button");
			LoggerHandler.error("Failed to click on Submit button");
			test.log(Status.FAIL, "Failed to click on Submit button");
		}
	}
	
	
    /*
     * a. Method Name: verifyInvalidEmailErrorMessage
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyInvalidEmailErrorMessage() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.invalidEmailAddress, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Error", test, AffiliateProgramLocators.invalidEmailAddress);
			String actualValueString = helper.getText(AffiliateProgramLocators.invalidEmailAddress);
			Assert.assertTrue(actualValueString.contains("Invalid email"));
			LoggerHandler.info("Verified Invalid Email Error Message");
			test.log(Status.PASS, "Verified Invalid Email Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Invalid Email Error Message");
			LoggerHandler.error("Failed to verify Invalid Email Error Message");
			test.log(Status.FAIL, "Failed to verify Invalid Email Error Message");
		}
	}
	
    /*
     * a. Method Name: enterValidEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterValidEmail() {
		try {
			String testData = ExcelReader.readData(excelPath, sheetName, 1, 0);
			helper.waitForElementToBeVisible(AffiliateProgramLocators.emailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Input", test, AffiliateProgramLocators.emailInputField);
			helper.sendData(AffiliateProgramLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: verifySuccessfullEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifySuccessfullEmail() {
		try {
			helper.waitForElementToBeVisible(AffiliateProgramLocators.sentEmailSuccessfull, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Successfull Message", test, AffiliateProgramLocators.sentEmailSuccessfull);
			String actualValueString = helper.getText(AffiliateProgramLocators.sentEmailSuccessfull);
			Assert.assertTrue(actualValueString.contains("We sent you"));
			LoggerHandler.info("Verified Email successfull Message");
			test.log(Status.PASS, "Verified Email successfull Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Email successfull Message");
			LoggerHandler.error("Failed to verify Email successfull Message");
			test.log(Status.FAIL, "Failed to verify Email successfull Message");
		}
	}
	
	 /*
     * a. Method Name: affiliateProgramTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void affiliateProgramTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnAffiliateProgram();
		scroll(0, 500);
		scroll(0, 500);
		clickOnGetStarted();
		clickOnSignBtn();
		clickOnForgotPassword();
		enterInvalidEmail();
		verifyInvalidEmailErrorMessage();
		enterValidEmail();
		clickOnSubmitBtn();
		verifySuccessfullEmail();
	}
}
