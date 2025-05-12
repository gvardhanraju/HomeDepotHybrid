package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.GiftCardsLocators;
import uistore.LogInFuntionalityLocators;
import uistore.ManageCardsLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class GiftCards {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public GiftCards(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
	/*
     * a. Method Name: clickOnGiftCardsBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnGiftCardsBtn() {
		try {
			helper.waitForElementToBeVisible(GiftCardsLocators.giftCardsBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Gift Cards", test, GiftCardsLocators.giftCardsBtn);
			helper.clickOnElement(GiftCardsLocators.giftCardsBtn);
			LoggerHandler.info("Clicked on Gift Cards");
			test.log(Status.PASS, "Clicked on Gift Cards");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Gift Cards");
			LoggerHandler.error("Failed to click on Gift Cards");
			test.log(Status.FAIL, "Failed to click on Gift Cards");
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
     * a. Method Name: clickOnGetStarted
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnGetStarted() {
		try {
			helper.waitForElementToBeVisible(GiftCardsLocators.getStartedBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Get Started", test, GiftCardsLocators.getStartedBtn);
			helper.clickOnElement(GiftCardsLocators.getStartedBtn);
			LoggerHandler.info("Clicked on Get Started");
			test.log(Status.PASS, "Clicked on Get Started");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Get Started");
			LoggerHandler.error("Failed to click on Get Started");
			test.log(Status.FAIL, "Failed to click on Get Started");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 2, 0);
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			helper.sendData(LogInFuntionalityLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	 /*
     * a. Method Name: clickOnEmailInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnEmailInputField() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Input Field", test, LogInFuntionalityLocators.emailInputField);
			helper.clickOnElement(LogInFuntionalityLocators.emailInputField);
			LoggerHandler.info("Clicked on Email input field");
			test.log(Status.PASS, "Clicked on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Email input field");
			LoggerHandler.error("Failed to click on Email input field");
			test.log(Status.FAIL, "Failed to click on Email input field");
		}
	}
	
	/*
     * a. Method Name: clickOnEmailLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnEmailLabel() {
		try {
			helper.waitForElementToBeVisible(ManageCardsLocators.emailAddressLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Label", test, ManageCardsLocators.emailAddressLabel);
			helper.clickOnElement(ManageCardsLocators.emailAddressLabel);
			LoggerHandler.info("Clicked on Email label");
			test.log(Status.PASS, "Clicked on Email label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Email label");
			LoggerHandler.error("Failed to click on Email label");
			test.log(Status.FAIL, "Failed to click on Email label");
		}
	}
	
	/*
     * a. Method Name: verifyUsernameStatusErrorMessage
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyUsernameStatusErrorMessage() {
		try {
			helper.waitForElementToBeVisible(ManageCardsLocators.usernameStatusMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Username Error Message", test, ManageCardsLocators.usernameStatusMessage);
			String actualValueString = helper.getText(ManageCardsLocators.usernameStatusMessage);
			Assert.assertTrue(actualValueString.contains("provide"));
			LoggerHandler.info("Verified Username Status Error Message");
			test.log(Status.PASS, "Verified Username Status Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Username Status Error Message");
			LoggerHandler.error("Failed to verify Username Status Error Message");
			test.log(Status.FAIL, "Failed to verify Username Status Error Message");
		}
	}
	
	/*
     * a. Method Name: clearEmailInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clears an input value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clearEmailInputField() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			helper.javascriptValueClear(LogInFuntionalityLocators.emailInputField);
			LoggerHandler.info("Cleared email input field");
			test.log(Status.PASS, "Cleared email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot(excelPath);
			LoggerHandler.error("Failed to clear email input field");
			test.log(Status.FAIL, "Failed to clear email input field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 3, 0);
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			helper.sendData(LogInFuntionalityLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: clickOnGiftCardsBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnContinueBtn() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.continueBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Continue Button", test, LogInFuntionalityLocators.continueBtn);
			helper.clickOnElement(LogInFuntionalityLocators.continueBtn);
			LoggerHandler.info("Clicked on Continue button");
			test.log(Status.PASS, "Clicked on Continue button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Continue button");
			LoggerHandler.error("Failed to click on Continue button");
			test.log(Status.FAIL, "Failed to click on Continue button");
		}
	}
	
	/*
     * a. Method Name: verifyNewAccount
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyNewAccount() {
		try {
			helper.waitForElementToBeVisible(ManageCardsLocators.createNewAccountLabel, 10);
			Reporter.attachHighlightedScreenshotToReport("Create a New Account using", test, ManageCardsLocators.createNewAccountLabel);
			String actualValueString = helper.getText(ManageCardsLocators.createNewAccountLabel);
			Assert.assertTrue(actualValueString.contains("New Account using"));
			LoggerHandler.info("Verified Create a New Account using");
			test.log(Status.PASS, "Verified Create a New Account using");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Create a New Account using");
			LoggerHandler.error("Failed to verify Create a New Account using");
			test.log(Status.FAIL, "Failed to verify Create a New Account using");
		}
	}
	
	
	/*
     * a. Method Name: corporateResponsibiltyTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void giftCardsTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnGiftCardsBtn();
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnGetStarted();
		clickOnEmailInputField();
		clickOnEmailLabel();
		enterInvalidEmail();
		verifyUsernameStatusErrorMessage();
		clickOnEmailInputField();
		clearEmailInputField();
		enterValidEmail();
		clickOnContinueBtn();
		verifyNewAccount();
	}
}
