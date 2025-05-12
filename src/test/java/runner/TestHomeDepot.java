package runner;

import java.awt.FlowLayout;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AffiliateProgram;
import pages.CarbonEmissions;
import pages.CorporateResponsibility;
import pages.GiftCards;
import pages.HeavyDutyTools;
import pages.HuskyTruckTools;
import pages.LawnAndEquipment;
import pages.LogInFuntionality;
import pages.ManageCards;
import pages.MobileWorkBenches;
import pages.MyPreferenceCenter;
import pages.OrderCancellation;
import pages.PrivacyPolicy;
import pages.RebateCenter;
import pages.RollingToolBoxes;
import pages.ShopOurBrands;
import pages.TrackOrder;
import utils.Base;
import utils.Reporter;
import utils.TriggerReport;

public class TestHomeDepot extends Base {
	private static JProgressBar progressBar;
    private static JFrame frame;
    private static int testCount = 0;
    private static final int totalTests = 17;
	ExtentReports reports;
	ExtentTest test;
	String timestamp; 
	
    /*
     * a. Method Name: openReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To generate the report
     * d. Return Type: void
     * e. Parameters: none
     */
	@BeforeClass
	public void openReport() {
		frame = new JFrame("Test Execution Progress");
        progressBar = new JProgressBar(0, totalTests);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
 
        frame.setLayout(new FlowLayout());
        frame.add(progressBar);
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		reports = Reporter.generateExtentReports("HOMEDEPOT_Report", timestamp);
	}
	
    /*
     * a. Method Name: open
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To open the browser
     * d. Return Type: void
     * e. Parameters: none
     */
	@BeforeMethod
	public void open() {
		openBrowser();
	}
	
    /*
     * a. Method Name: logInFuntionalityTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Log In Functionality TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 1)
	public void logInFuntionalityTestcase() {
		test = reports.createTest("LogIn Functinality Testcase");
		LogInFuntionality logInFuntionality = new LogInFuntionality(test);
		logInFuntionality.logInFunctionalityTestcase();
	}
	
    /*
     * a. Method Name: trackOrderTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Track Order TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 2)
	public void trackOrderTestcase() {
		test = reports.createTest("Track Order Testcase");
		TrackOrder trackOrder = new TrackOrder(test);
		trackOrder.trackOrderTestcase();
	}
	
    /*
     * a. Method Name: manageCardsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Manage Cards TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 3)
	public void manageCardsTestcase() {
		test = reports.createTest("Manage Cards Testcase");
		ManageCards manageCards = new ManageCards(test);
		manageCards.manageCardsTestcase();
	}
	
    /*
     * a. Method Name: shopOurBrandsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Shop Our Brands TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 4)
	public void shopOurBrandsTestcase() {
		test = reports.createTest("Shop Our Brands Testcase");
		ShopOurBrands shopOurBrands = new ShopOurBrands(test);
		shopOurBrands.shopOurBrandsTestcase();
	}
	
    /*
     * a. Method Name: orderCancellationTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Order Cancellation TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 5)
	public void orderCancellationTestcase() {
		test = reports.createTest("Order Cancellation Testcase");
		OrderCancellation orderCancellation = new OrderCancellation(test);
		orderCancellation.orderCancellationTestcase();
	}
	
    /*
     * a. Method Name: giftCardsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Gift Cards TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 6)
	public void giftCardsTestcase() {
		test = reports.createTest("Gift Cards Testcase");
		GiftCards giftCards = new GiftCards(test);
		giftCards.giftCardsTestcase();
	}
	
    /*
     * a. Method Name: affiliateProgramTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Affiliate Program TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 7)
	public void affiliateProgramTestcase() {
		test = reports.createTest("Affiliate Program Testcase");
		AffiliateProgram affiliateProgram = new AffiliateProgram(test);
		affiliateProgram.affiliateProgramTestcase();
	}
	
    /*
     * a. Method Name: corporateResponsibilityTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Corporate Responsibility TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 8)
	public void corporateResponsibilityTestcase() {
		test = reports.createTest("Corporate Responsibility Testcase");
		CorporateResponsibility corporateResponsibility = new CorporateResponsibility(test);
		corporateResponsibility.corporateResponsibiltyTestcase();
	}
	
    /*
     * a. Method Name: myPreferenceCenterTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: My Preference Center TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 9)
	public void myPreferenceCenterTestcase() {
		test = reports.createTest("My Preference Center Testcase");
		MyPreferenceCenter myPreferenceCenter = new MyPreferenceCenter(test);
		myPreferenceCenter.myPreferenceCenterTestcase();
	}
	
    /*
     * a. Method Name: carbonEmissionsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Carbon Emissions TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 10)
	public void carbonEmissionsTestcase() {
		test = reports.createTest("Carbon Emissions Testcase");
		CarbonEmissions carbonEmissions = new CarbonEmissions(test);
		carbonEmissions.carbonEmissionsTestcase();
	}
	
    /*
     * a. Method Name: rebateCenterTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Rebate Center TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 11)
	public void rebateCenterTestcase() {
		test = reports.createTest("Rebate Center Testcase");
		RebateCenter rebateCenter = new RebateCenter(test);
		rebateCenter.rebateCenterTestcase();
	}
	
    /*
     * a. Method Name: privacyPolicyTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Privacy Policy TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 12)
	public void privacyPolicyTestcase() {
		test = reports.createTest("Privacy Policy Testcase");
		PrivacyPolicy privacyPolicy = new PrivacyPolicy(test);
		privacyPolicy.privacyPolicyTestcase();
		
	}
	
    /*
     * a. Method Name: lawnAndEquipmentLocators
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Lawn And Equipment TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 13)
	public void lawnAndEquipmentLocators() {
		test = reports.createTest("Lawn And Equipment Testcase");
		LawnAndEquipment lawnAndEquipment = new LawnAndEquipment(test);
		lawnAndEquipment.lawnAndEquipmentTestcse();
	}
	
    /*
     * a. Method Name: heavyDutyTools
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Heavy Duty Tools TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 14)
	public void heavyDutyTools() {
		test = reports.createTest("Heavy Duty Tools Testcase");
		HeavyDutyTools heavyDutyTools = new HeavyDutyTools(test);
		heavyDutyTools.heavyDutyToolsTestcase();
	}
	
    /*
     * a. Method Name: mobileWorkBenches
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Mobile Work Benches TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 15)
	public void mobileWorkBenches() {
		test = reports.createTest("Mobile Work Benches Testcase");
		MobileWorkBenches mobileWorkBenches = new MobileWorkBenches(test);
		mobileWorkBenches.mobileWorkBenchesTestcase();
	}
	
    /*
     * a. Method Name: rollingToolBoxesTestcases
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Rolling TOol Boxes TestCase
     * d. Return Type: void
     * e. Parameters: none
     */
	@Test(enabled = true, priority = 16)
	public void rollingToolBoxesTestcases() {
		test = reports.createTest("Rolling Tool Boxes Testcase");
		RollingToolBoxes rollingToolBoxes = new RollingToolBoxes(test);
		rollingToolBoxes.rollingToolBoxesTestcase();
	}
	
    /*
     * a. Method Name: huskyTruckToolsTestcase
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Husky Truck Tools TestCase
     * d. Return Type: void
     * e. Parameters: none
     */ 
	@Test(enabled = true, priority = 17)
	public void huskyTruckToolsTestcase() {
		test = reports.createTest("Husky truck Tools Testcase");
		HuskyTruckTools huskyTruckTools = new HuskyTruckTools(test);
		huskyTruckTools.huskyTruckToolsTestcase();
	}
	
    /*
     * a. Method Name: close
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To close the browser
     * d. Return Type: void
     * e. Parameters: none
     */
	@AfterMethod
	public void close() {
		driver.quit();
		testCount++;
        progressBar.setValue(testCount);
        progressBar.setString("Executed: " + testCount + "/" + totalTests);
	}
	
    /*
     * a. Method Name: closeReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Finalizes and flushes the report data to the report file
     * d. Return Type: void
     * e. Parameters: none
     */
	@AfterClass
	public void closeReport() {
		reports.flush();
        try {
            TriggerReport.sendEmailWithAttachment(timestamp);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
