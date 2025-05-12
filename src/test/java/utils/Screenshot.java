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

import com.google.common.io.Files;

public class Screenshot extends Base{
    public static TakesScreenshot ts;

    /*
     * a. Method Name: captureScreenShot
     * b. Author Name: Sri Ramya Paladi
     * c. Description: Captures a screenshot and saves it with a timestamp.
     * d. Return Type: void
     * e. Parameters: 
     *       - String filename: The name used to save the screenshot file
     */
    public static void captureScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + "_" + timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots");
        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
     * a. Method Name: errorScreenShot
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Highlights a web element and captures a screenshot.
     * d. Return Type: void
     * e. Parameters: 
     *      - String filename: The name used to save the screenshot file
     *      - By locator: locator to find the element on the page.
     */
    public static void errorScreenShot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + "_" + timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir")+"/screenshots/errorScreenshots");
        if(!screenshotsDir.exists()){
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
     * a. Method Name: captureHighlightScreenShot
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Highlights a web element and captures a screenshot.
     * d. Return Type: void
     * e. Parameters: 
     *      - String filename: The name used to save the screenshot file
     *      - By locator: locator to find the element on the page.
     */
    public static void captureHighlightScreenShot(String filename, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].style.backgroundColor='yellow';", element);
           
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name = filename + "_" + timestamp + ".png";

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
