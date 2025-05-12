package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LogInFuntionalityLocators;
import uistore.ManageCardsLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LogInFuntionality {
	WebDriverHelper helper;
	ExtentTest test;
	String excelPath = System.getProperty("user.dir") + "/testData/GladiatorExcelData.xlsx";
	String sheetName = "Sheet1";
	
	public LogInFuntionality(ExtentTest test) {
		helper = new WebDriverHelper(Base.driver);
		this.test = test;
	}
	
    /*
     * a. Method Name: clickOnLogIn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnLogIn() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.loginBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Log In Button", test, LogInFuntionalityLocators.loginBtn);
			helper.javascriptClick(LogInFuntionalityLocators.loginBtn);	
			LoggerHandler.info("Clicked on Log In button");
			test.log(Status.PASS, "Clicked on Log In button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Log In button");
			LoggerHandler.error("Failed to click on Log In button");
			test.log(Status.FAIL, "Failed to click on Log In button");
		}
	}
	
    /*
     * a. Method Name: clickOnSignInOnMenuBar
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSignInOnMenuBar() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.homesignInBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Sign In", test, LogInFuntionalityLocators.homesignInBtn);
			helper.javascriptClick(LogInFuntionalityLocators.homesignInBtn);
			LoggerHandler.info("Clicked on Sign In button");
			test.log(Status.PASS, "Clicked on Sign In button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to clicked on Sign In button");
			LoggerHandler.error("Failed to clicked on Sign In button");
			test.log(Status.FAIL, "Failed to clicked on Sign In button");
		}
	}
	
    /*
     * a. Method Name: clickOnEmailInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnEmailInputField() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Email Input Field", test, LogInFuntionalityLocators.emailInputField);
			helper.javascriptClick(LogInFuntionalityLocators.emailInputField);
			LoggerHandler.info("Clicked on Email input field");
			test.log(Status.PASS, "Clicked on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Email input field");
			LoggerHandler.error("Failed to click on Email input field");
			test.log(Status.FAIL, "Failed to click on Email input field");
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
			String testData = ExcelReader.readData(excelPath, sheetName, 4, 0);
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 10);
			helper.sendData(LogInFuntionalityLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
		}
	}
	
    /*
     * a. Method Name: clickOnContinueBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnContinueBtn() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.continueBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Continue Button", test, LogInFuntionalityLocators.continueBtn);
			helper.javascriptClick(LogInFuntionalityLocators.continueBtn);
			LoggerHandler.info("Clicked on Continue button");
			test.log(Status.PASS, "Clicked on Continue button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Continue button");
			LoggerHandler.error("Failed to click on Continue button");
			test.log(Status.FAIL, "Failed to click on Continue button");
		}
	}
	
    /*
     * a. Method Name: clickOnPasswordInputField
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnPasswordInputField() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.passwordInputField, 10);
			Reporter.attachHighlightedScreenshotToReport("Password Input Field", test, LogInFuntionalityLocators.passwordInputField);
			helper.javascriptClick(LogInFuntionalityLocators.passwordInputField);
			LoggerHandler.info("Clicked on Password input field");
			test.log(Status.PASS, "Clicked on Password input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Password input field");
			LoggerHandler.error("Failed to click on Password input field");
			test.log(Status.FAIL, "Failed to click on Password input field");
		}
	}
	
	/*
     * a. Method Name: enterPassword
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterPassword() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.passwordInputField, 10);
			helper.sendData(LogInFuntionalityLocators.passwordInputField, "@Cotigz.com");
			LoggerHandler.info("Entered data on Password input field");
			test.log(Status.PASS, "Entered data on Password input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Password input field");
			LoggerHandler.error("Failed to enter data on Password input field");
			test.log(Status.FAIL, "Failed to enter on Password input field");
		}
	}
	
    /*
     * a. Method Name: clickOnSignInBtn
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnSignInBtn() {
		try {
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.signInBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Sign In Button", test, LogInFuntionalityLocators.signInBtn);
			helper.javascriptClick(LogInFuntionalityLocators.signInBtn);
			LoggerHandler.info("Clicked on Sign In button");
			test.log(Status.PASS, "Clicked on Sign In button");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Sign In button");
			LoggerHandler.error("Failed to click on Sign In button");
			test.log(Status.FAIL, "Failed to click on Sign In button");
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
     * a. Method Name: enterInvalidEmail
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Enters the value on the input field
     * d. Return Type: void
     * e. Parameters: none
     */
	public void enterInvalidEmail() {
		try {
			String testData = ExcelReader.readData(excelPath, sheetName, 5, 0);
			helper.waitForElementToBeVisible(LogInFuntionalityLocators.emailInputField, 5);
			helper.sendData(LogInFuntionalityLocators.emailInputField, testData);
			LoggerHandler.info("Entered data on Email input field");
			test.log(Status.PASS, "Entered data on Email input field");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to enter data on Email input field");
			LoggerHandler.error("Failed to enter data on Email input field");
			test.log(Status.FAIL, "Failed to enter on Email input field");
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
			Reporter.attachHighlightedScreenshotToReport("Username Status Error Message", test, ManageCardsLocators.usernameStatusMessage);
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
     * a. Method Name: clickOnEmailLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
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
     * a. Method Name: logInFunctionalityTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void logInFunctionalityTestcase() {
		clickOnLogIn();
		clickOnSignInOnMenuBar();
		clickOnEmailInputField();
		enterInvalidEmail();
		clickOnEmailLabel();
		verifyUsernameStatusErrorMessage();
		clearEmailInputField();
		clickOnEmailInputField();
		enterValidEmail();
		clickOnContinueBtn();
		clickOnPasswordInputField();
		enterPassword();
		clickOnSignInBtn();
	}

}
