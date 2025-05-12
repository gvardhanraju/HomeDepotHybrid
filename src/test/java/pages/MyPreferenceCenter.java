package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LogInFuntionalityLocators;
import uistore.MyPreferenceCenterLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MyPreferenceCenter {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public MyPreferenceCenter(ExtentTest test) {
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
     * a. Method Name: clickOnMyPreferenceCenter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnMyPreferenceCenter() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.preferenceCenterBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("My Prefernce Center", test, MyPreferenceCenterLocators.preferenceCenterBtn);
			helper.clickOnElement(MyPreferenceCenterLocators.preferenceCenterBtn);
			LoggerHandler.info("Clicked on My Preference Center");
			test.log(Status.PASS, "Clicked on My Preference Center");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on My Preference Center");
			LoggerHandler.error("Failed to click on My Preference Center");
			test.log(Status.FAIL, "Failed to click on My Preference Center");
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
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.emailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Email input Field", test, MyPreferenceCenterLocators.emailInputField);
			helper.clickOnElement(MyPreferenceCenterLocators.emailInputField);
			LoggerHandler.info("Clicked on Email input field");
			test.log(Status.PASS, "Clicked on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Email input field");
			LoggerHandler.error("Failed to click on Email input field");
			test.log(Status.FAIL, "Failed to click on Email input field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 5, 0);
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.emailInputField, 10);
			helper.sendData(MyPreferenceCenterLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
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
	public void clickOnPhoneNumberInput() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.phoneNumberInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Phone Number Input Field", test, MyPreferenceCenterLocators.phoneNumberInputField);
			helper.clickOnElement(MyPreferenceCenterLocators.phoneNumberInputField);
			LoggerHandler.info("Clicked on Phone Number input field");
			test.log(Status.PASS, "Clicked on Phone Number field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Phone Number input field");
			LoggerHandler.error("Failed to click on Phone Number input field");
			test.log(Status.FAIL, "Failed to click on Phone Number input field");
		}
	}
	
	/*
     * a. Method Name: enterPhoneNumber
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterPhoneNumber() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.phoneNumberInputField, 10);
			helper.sendData(MyPreferenceCenterLocators.phoneNumberInputField, "98765410210");
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: verifyEmailErrorMessage
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyEmailErrorMessage() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.emailErrorMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Error Message", test, MyPreferenceCenterLocators.emailErrorMessage);
			String actualValueString = helper.getText(MyPreferenceCenterLocators.emailErrorMessage);
			Assert.assertTrue(actualValueString.contains("Please provide"));
			LoggerHandler.info("Verified Email Error Message");
			test.log(Status.PASS, "Verified Email Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Email Error Message");
			LoggerHandler.error("Failed to verify Email Error Message");
			test.log(Status.FAIL, "Failed to verify Email Error Message");
		}
	}
	
	/*
     * a. Method Name: clickOnEmailInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clearEmailInputField() {
		try {
			helper.javascriptValueClear(LogInFuntionalityLocators.emailInputField);
			LoggerHandler.info("Cleared email input field");
			test.log(Status.PASS, "Cleared email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to clear email input field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 8, 0);
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.emailInputField, 10);
			helper.sendData(MyPreferenceCenterLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: clickOnSearchBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSearchBtn() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.searchBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Search Button", test, MyPreferenceCenterLocators.searchBtn);
			helper.clickOnElement(MyPreferenceCenterLocators.searchBtn);
			LoggerHandler.info("Clicked on Search Button");
			test.log(Status.PASS, "Clicked on Search Button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Search Button");
			LoggerHandler.error("Failed to click on Search Button");
			test.log(Status.FAIL, "Failed to click on Search Button");
		}
	}
	
	/*
     * a. Method Name: verifyMarketingEmails
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyMarketingEmails() {
		try {
			helper.waitForElementToBeVisible(MyPreferenceCenterLocators.marketingEmails, 10);
			Reporter.attachHighlightedScreenshotToReport("Marketing Emails Label", test, MyPreferenceCenterLocators.marketingEmails);
			String actualValueString = helper.getText(MyPreferenceCenterLocators.marketingEmails);
			Assert.assertTrue(actualValueString.contains("Mar"));
			LoggerHandler.info("Verified Marketing Emails Label");
			test.log(Status.PASS, "Verified Marketing Emails Label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Marketing Emails Label");
			LoggerHandler.error("Failed to verify Marketing Emails Label");
			test.log(Status.FAIL, "Failed to verify Marketing Emails Label");
		}
	}
	
	/*
     * a. Method Name: myPreferenceCenterTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void myPreferenceCenterTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnMyPreferenceCenter();
		clickOnEmailInputField();
		enterInvalidEmail();
		clickOnPhoneNumberInput();
		enterPhoneNumber();
		verifyEmailErrorMessage();
		clickOnEmailInputField();
		clearEmailInputField();
		enterValidEmail();
		clickOnSearchBtn();
		verifyMarketingEmails(); 
	}
}
