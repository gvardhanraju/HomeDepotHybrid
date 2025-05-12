package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HeavyDutyToolsLocators;
import uistore.HuskyTruckToolsLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HuskyTruckTools {
	WebDriverHelper helper;
	ExtentTest test;
	
	public HuskyTruckTools(ExtentTest test) {
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
     * a. Method Name: clickOnTruckToolBoxes
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnTruckToolBoxes() {
		try {
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.truckToolBoxes, 10);
			Reporter.attachHighlightedScreenshotToReport("Truck Tool Boxes", test, HuskyTruckToolsLocators.truckToolBoxes);
			helper.clickOnElement(HuskyTruckToolsLocators.truckToolBoxes);
			LoggerHandler.info("Clicked on Truck Tool Boxes");
			test.log(Status.PASS, "Clicked on Truck Tool Boxes");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Truck Tool Boxes");
			LoggerHandler.error("Failed to click on Truck Tool Boxes");
			test.log(Status.FAIL, "Failed to click on  Truck Tool Boxes");
		}
	}
	
    /*
     * a. Method Name: clickOnVehicleSpecific
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnVehicleSpecific() {
		try {
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.vehicleSpecific, 10);
			Reporter.attachHighlightedScreenshotToReport("Vehicle Specific", test, HuskyTruckToolsLocators.vehicleSpecific);
			helper.clickOnElement(HuskyTruckToolsLocators.vehicleSpecific);
			LoggerHandler.info("Clicked on Vehicle Specific");
			test.log(Status.PASS, "Clicked on Vehicle Specific");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Vehicle Specific");
			LoggerHandler.error("Failed to click on Vehicle Specific");
			test.log(Status.FAIL, "Failed to click on Vehicle Specific");
		}
	}
	
    /*
     * a. Method Name: clickOnFinishColor
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnFinishColor() {
		try {
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.finishColor, 10);
			Reporter.attachHighlightedScreenshotToReport("Finish Color", test, HuskyTruckToolsLocators.finishColor);
			helper.clickOnElement(HuskyTruckToolsLocators.finishColor);
			LoggerHandler.info("Clicked on Finish/Color");
			test.log(Status.PASS, "Clicked on Finish/Color");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Finish/Color");
			LoggerHandler.error("Failed to click on Finish/Color");
			test.log(Status.FAIL, "Failed to click on Finish/Color");
		}
	}
	
    /*
     * a. Method Name: clickOnMatteBlack
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on the element
     * d. Return Type: void
     * e. Parameters: none
     */
	public void clickOnMatteBlack() {
		try {
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.matteBlack, 10);
			Reporter.attachHighlightedScreenshotToReport("Matte Black", test, HuskyTruckToolsLocators.matteBlack);
			helper.clickOnElement(HuskyTruckToolsLocators.matteBlack);
			LoggerHandler.info("Clicked on Matte Black color");
			test.log(Status.PASS, "Clicked on Matte Black color");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Matte Black color");
			LoggerHandler.error("Failed to click on Matte Black color");
			test.log(Status.FAIL, "Failed to click on Matte Black color");
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
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.applyNowBtn, 10);
			Reporter.attachHighlightedScreenshotToReport("Apply Button", test, HuskyTruckToolsLocators.applyNowBtn);
			helper.clickOnElement(HuskyTruckToolsLocators.applyNowBtn);
			LoggerHandler.info("Clicked on Apply");
			test.log(Status.PASS, "Clicked on Apply");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to click on Apply");
			LoggerHandler.error("Failed to click on Apply");
			test.log(Status.FAIL, "Failed to click on Apply");
		}
	}
	
	/*
     * a. Method Name: verifyMatteBlackHuskyLabel
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Verify the actual value
     * d. Return Type: void
     * e. Parameters: none
     */
	public void verifyMatteBlackHuskyLabel() {
		try {
			helper.waitForElementToBeVisible(HuskyTruckToolsLocators.matteBlackHuskyTruckLabel, 10);			
			Reporter.attachHighlightedScreenshotToReport("Matte Black Husky Truck", test, HuskyTruckToolsLocators.matteBlackHuskyTruckLabel);
			String actualValueString = helper.getText(HuskyTruckToolsLocators.matteBlackHuskyTruckLabel);
			Assert.assertTrue(actualValueString.contains("MATTE BLACK"));
			LoggerHandler.info("Verified Matte Black Husky Truck Tool Boxes header label");
			test.log(Status.PASS, "Verified Matte Black Husky Truck Tool Boxes header label");
		} catch (Exception e) {
			Screenshot.errorScreenShot("Failed to verify Matte Black Husky Truck Tool Boxes header label");
			LoggerHandler.error("Failed to verify Matte Black Husky Truck Tool Boxes header label");
			test.log(Status.FAIL, "Failed to verify Matte Black Husky Truck Tool Boxes header label");
		}
	}
	
	/*
     * a. Method Name: huskyTruckToolsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Calls all the steps methods of the current page
     * d. Return Type: void
     * e. Parameters: none
     */
	public void huskyTruckToolsTestcase() {
		scrollToFooter();
		clickOnHuskyBrand();
		clickOnTruckToolBoxes();
		clickOnVehicleSpecific();
		clickOnFinishColor();
		clickOnMatteBlack();
		clickOnApplyBtn();
		verifyMatteBlackHuskyLabel();
	}
	
}
