package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.OrderCancellationLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class OrderCancellation {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public OrderCancellation(ExtentTest test) {
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
     * a. Method Name: clickOnOrderCancellation
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnOrderCancellation() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.orderCancellationBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Order Cancellation", test, OrderCancellationLocators.orderCancellationBtn);
			helper.clickOnElement(OrderCancellationLocators.orderCancellationBtn);
			LoggerHandler.info("Clicked on Order Cancellation");
			test.log(Status.PASS, "Clicked on Order Cancellation");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Order Cancellation");
			LoggerHandler.error("Failed to click on Order Cancellation");
			test.log(Status.FAIL, "Failed to click on Order Cancellation");
		}
	}
	
	/*
     * a. Method Name: clickOnGoBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnGoBtn() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.goBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Go Button", test, OrderCancellationLocators.goBtn);
			helper.clickOnElement(OrderCancellationLocators.goBtn);
			LoggerHandler.info("Clicked on Go Button");
			test.log(Status.PASS, "Clicked on Go Button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Go Button");
			LoggerHandler.error("Failed to click on Go Button");
			test.log(Status.FAIL, "Failed to click on Go Button");
		}
	}
	
	/*
     * a. Method Name: verifyForEmptyInput
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyForEmptyInput() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.requiredErrorMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Required Error Message", test, OrderCancellationLocators.requiredErrorMessage);
			String actualValueString = helper.getText(OrderCancellationLocators.requiredErrorMessage);
			Assert.assertTrue(actualValueString.contains("Req"));
			LoggerHandler.info("Verified Required Error Message");
			test.log(Status.PASS, "Verified Required Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Required Error Message");
			LoggerHandler.error("Failed to verify Required Error Message");
			test.log(Status.FAIL, "Failed to verify Required Error Message");
		}
	}
	
	/*
     * a. Method Name: clickOnGoBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickFooterEmailInputField() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.footerEmailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Footer Email Field", test, OrderCancellationLocators.footerEmailInputField);
			helper.clickOnElement(OrderCancellationLocators.footerEmailInputField);
			LoggerHandler.info("Clicked on Footer Email input field");
			test.log(Status.PASS, "Clicked on Footer Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Footer Email input field");
			LoggerHandler.error("Failed to click on Footer Email input field");
			test.log(Status.FAIL, "Failed to click on Footer Email input field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 9, 0);
			helper.waitForElementToBeVisible(OrderCancellationLocators.footerEmailInputField, 10);
			helper.sendData(OrderCancellationLocators.footerEmailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: verifyForInvalidEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyForInvalidEmail() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.invalidEmailErrorMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Invalid Error Message", test, OrderCancellationLocators.invalidEmailErrorMessage);
			String actualValueString = helper.getText(OrderCancellationLocators.invalidEmailErrorMessage);
			Assert.assertTrue(actualValueString.contains("Invalid"));
			LoggerHandler.info("Verified Invalid email address Error Message");
			test.log(Status.PASS, "Verified Invalid email address Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Invalid email address Error Message");
			LoggerHandler.error("Failed to verify Invalid email address Error Message");
			test.log(Status.FAIL, "Failed to verify Invalid email address Error Message");
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
			helper.javascriptValueClear(OrderCancellationLocators.footerEmailInputField);
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
			String testData = ExcelReader.readData(excelPath, sheetName, 10, 0);
			helper.waitForElementToBeVisible(OrderCancellationLocators.footerEmailInputField, 10);
			helper.sendData(OrderCancellationLocators.footerEmailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
	/*
     * a. Method Name: verifyForValidEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyForValidEmail() {
		try {
			helper.waitForElementToBeVisible(OrderCancellationLocators.unableToSignupErrorMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Unable to signup Error Message", test, OrderCancellationLocators.unableToSignupErrorMessage);
			String actualValueString = helper.getText(OrderCancellationLocators.unableToSignupErrorMessage);
			Assert.assertTrue(actualValueString.contains("Unable"));
			LoggerHandler.info("Verified Unable to signup at this time Error Message");
			test.log(Status.PASS, "Verified Unable to signup at this time Error Message");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Unable to signup at this time Error Message");
			LoggerHandler.error("Failed to verify Unable to signup at this time Error Message");
			test.log(Status.FAIL, "Failed to verify Unable to signup at this time Error Message");
		}
	}
	
	/*
     * a. Method Name: orderCancellationTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void orderCancellationTestcase() {
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnOrderCancellation();
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		scroll(0, 500);
		clickOnGoBtn();
		verifyForEmptyInput();
		clickFooterEmailInputField();
		enterInvalidEmail();
		clickOnGoBtn();
		verifyForInvalidEmail();
		clearEmailInputField();
		enterValidEmail();
		clickOnGoBtn();
		verifyForValidEmail();
	}
}
