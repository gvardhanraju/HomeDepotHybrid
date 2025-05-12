package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.TrackOrderLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TrackOrder {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public TrackOrder(ExtentTest test) {
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
     * a. Method Name: clickOnCustomerServiceCenter
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnCustomerServiceCenter() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.customerServiceCenter, 10);
			helper.javascriptClick(TrackOrderLocators.customerServiceCenter);
			LoggerHandler.info("Clicked on Customer Service Center");
			test.log(Status.PASS, "Clicked on Customer Service Center");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Customer Service Center");
			LoggerHandler.error("Failed to click on Customer Service Center");
			test.log(Status.FAIL, "Failed to click on Customer Service Center");
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
     * a. Method Name: clickOnTrackAnOrder
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnTrackAnOrder() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.trackAnOrder, 10);
			Reporter.attachHighlightedScreenshotToReport("Track An Order", test, TrackOrderLocators.trackAnOrder);
			helper.javascriptClick(TrackOrderLocators.trackAnOrder);
			LoggerHandler.info("Clicked on Track An Order");
			test.log(Status.PASS, "Clicked on Track An Order");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Track An Order");
			LoggerHandler.error("Failed to click on Track An Order");
			test.log(Status.FAIL, "Failed to click on Track An Order");
		}
	}
	
	/*
     * a. Method Name: clickOnOrderNumberInputFieldBy
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnOrderNumberInputField() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.orderNumberInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Order Number Input Field", test, TrackOrderLocators.orderNumberInputField);
			helper.javascriptClick(TrackOrderLocators.orderNumberInputField);
			LoggerHandler.info("Clicked on Order Number Input Field");
			test.log(Status.PASS, "Clicked on Order Number Input Field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Order Number Input Field");
			LoggerHandler.error("Failed to click on Order Number Input Field");
			test.log(Status.FAIL, "Failed to click on Order Number Input Field");
		}
	}
	
	/*
     * a. Method Name: enterOrderNumber
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterOrderNumber() {
		try {
			String testData = ExcelReader.readData(excelPath, sheetName, 6, 0);
			helper.waitForElementToBeVisible(TrackOrderLocators.customerServiceCenter, 10);
			helper.sendData(TrackOrderLocators.orderNumberInputField, testData);
			LoggerHandler.info("Entered data on Order Number input field");
			test.log(Status.PASS, "Entered data on Ordcer Number input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Order Number field");
			LoggerHandler.error("Failed to enter data on Order Number field");
			test.log(Status.FAIL, "Failed to enter on Order Number input field");
		}
	}
	
	/*
     * a. Method Name: clickOnPhoneNumberInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnPhoneNumberInputField() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.phoneNumberInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Phone Number Input Field", test, TrackOrderLocators.phoneNumberInputField);
			helper.javascriptClick(TrackOrderLocators.phoneNumberInputField);
			LoggerHandler.info("Clicked on Phone Number input Field");
			test.log(Status.PASS, "Clicked on Phone Number input Field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Phone Number input Field");
			LoggerHandler.error("Failed to click on Phone Number input Field");
			test.log(Status.FAIL, "Failed to click on Phone Number input Field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 7, 0);
			helper.waitForElementToBeVisible(TrackOrderLocators.phoneNumberInputField, 10);
			helper.sendData(TrackOrderLocators.phoneNumberInputField, testData);
			LoggerHandler.info("Entered data on Phone Number input field");
			test.log(Status.PASS, "Entered data on Phone Number input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Phone Number field");
			LoggerHandler.error("Failed to enter data on Phone Number field");
			test.log(Status.FAIL, "Failed to enter on Phone Number input field");
		}
	}
	
	/*
     * a. Method Name: clickOnTrackOrderBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnTrackOrderBtn() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.trackOrderBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Track Order", test, TrackOrderLocators.trackOrderBtn);
			helper.javascriptClick(TrackOrderLocators.trackOrderBtn);
			LoggerHandler.info("Clicked on Track Order");
			test.log(Status.PASS, "Clicked on Track Order");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Track Order");
			LoggerHandler.error("Failed to click on Track Order");
			test.log(Status.FAIL, "Failed to click on Track Order");
		}
	}
	
	/*
     * a. Method Name: verifyTrackOrderErrorMessage
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyTrackOrderErrorMessage() {
		try {
			helper.waitForElementToBeVisible(TrackOrderLocators.trackOrderErrorMessage, 10);
			Reporter.attachHighlightedScreenshotToReport("Track Order Message", test, TrackOrderLocators.trackOrderErrorMessage);
			String actualValueString = helper.getText(TrackOrderLocators.trackOrderErrorMessage);
			String expectedValueString = "We're sorry. We couldn't find that order and phone number combination. Please try re-entering your order number and phone number";
			Assert.assertTrue(actualValueString.contains(expectedValueString));
			LoggerHandler.info("Verified We're sorry. We couldn't find that order and phone number combination. Please try re-entering your order number and phone number");
			test.log(Status.PASS, "Verified verify We're sorry. We couldn't find that order and phone number combination. Please try re-entering your order number and phone number");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify message");
			LoggerHandler.error("Failed to verify We're sorry. We couldn't find that order and phone number combination. Please try re-entering your order number and phone number");
			test.log(Status.FAIL, "Failed to verify We're sorry. We couldn't find that order and phone number combination. Please try re-entering your order number and phone number");
		}
	}
	
	/*
     * a. Method Name: trackOrderTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void trackOrderTestcase() {
		scrollToFooter();
		clickOnCustomerServiceCenter();
		scroll(0, 200);
		clickOnTrackAnOrder();
		clickOnOrderNumberInputField();
		enterOrderNumber();
		clickOnPhoneNumberInputField();
		enterPhoneNumber();
		clickOnTrackOrderBtn();
		verifyTrackOrderErrorMessage();
	}
}
