package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;


public class Reporter extends Base{
    public static TakesScreenshot ts;
    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentSparkReporter spark;
    
    /* a. Method Name: generateExtentReports
     * b. Author Name: Kushal
     * c. Description: This method generates the report.
     * d. Return Type: ExtentReports.
     * e. Parameters:reportName.
     */
    public static ExtentReports generateExtentReports(String reportName, String timestamp){
        String path = System.getProperty("user.dir")+"/reports/"+reportName+ "_" +timestamp +".html";
        File file = new File(path);
        report = new ExtentReports();
        spark = new ExtentSparkReporter(file);
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
        return report;
    }

    /* a. Method Name: CaptureScreenShot
     * b. Author Name: Kushal
     * c. Description: This method captures the screenshot.
     * d. Return Type: String
     * e. Parameters: filename.
     */
    public static String captureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + "_" + timestamp + ".png";
        String destPath = System.getProperty("user.dir") + "/reports/reportScreenshots/" +name;
        ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/reports/reportScreenshots");
        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try{
            Files.copy(file, target);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return destPath;
    }
    
    /* a. Method Name: attachScreenshotToReport
     * b. Author Name: Kushal
     * c. Description: This method attaches the screenshot to the report.
     * d. Return Type: void
     * e. Parameters: filename, Extent test, description.
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description){
        try {
            String screenshotPath = captureScreenShot(filename);
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /*
     * a. Method Name: captureHighlightScreenShot
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Highlights a web element and captures a screenshot.
     * d. Return Type: void
     * e. Parameters: 
     *      - String filename: The name used to save the screenshot file
     *      - By locator: locator to find the element on the page.
     */
    public static String captureHighlightScreenShot(String filename, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].style.backgroundColor='yellow';", element);
           
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + "_" + timestamp + ".png";
            String destPath = System.getProperty("user.dir") + "/screenshots/highlightedScreenshots/" +name;
            ts = (TakesScreenshot) driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
            File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots/highlightedScreenshots");
            if(!screenshotsDir.exists()){
                screenshotsDir.mkdirs();
            }
            File target = new File(screenshotsDir, name);
            try {
                Files.copy(file, target);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            js.executeScript("arguments[0].style.backgroundColor='';", element);
            
            return destPath;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /* a. Method Name: attachHighlightedScreenshotToReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: This method attaches the screenshot to the report.
     * d. Return Type: void
     * e. Parameters: filename, Extent test, description.
     */
    public static void attachHighlightedScreenshotToReport(String filename, ExtentTest test, By locator){
        try {
            String screenshotPath = captureHighlightScreenShot(filename, locator);
            test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
