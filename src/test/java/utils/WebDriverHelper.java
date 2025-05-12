package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
	WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    /*
     * a. Method Name: waitForElementToBeVisible
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Waits until the element is visible
     * d. Return Type: void
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     *      - int time: Time to wait until the visibility of the element
     */
    public void waitForElementToBeVisible(By locator, int time) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
          LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: clickOnElement
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element
     * d. Return Type: void
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     */
    public void clickOnElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: sendData
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Sends data to an element
     * d. Return Type: String
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     *      - String value: Value to select the option from the dropdown
     */
    public void sendData(By locator, String value) {
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(value);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: enterAction
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Performs the Enter Action
     * d. Return Type: String
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     */
    public void enterAction(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: getText
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Returns the text of an element
     * d. Return Type: String
     * e. Parameters:
     *       - By locator: Locator to find the element on the page
     */
    public String getText(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.getText();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
        return null;
    }
    
    /*
     * a. Method Name: getTitle
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Returns the title of an element
     * d. Return Type: String
     * e. Parameters: none
     */
    public String getTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
        return null;
    }
    
    /*
     * a. Method Name: getUrl
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Retruns the URL of the current page
     * d. Return Type: String
     * e. Parameters: none
     */
    public String getUrl() {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
        return null;
    }
    
    /*
     * a. Method Name: navigateBack
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To navigate back to the previous page
     * d. Return Type: void
     * e. Parameters: none
     */
    public void navigateBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: selectFromDropdown
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Select an option from the dropdown
     * d. Return Type: void
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     *      - String value: Value to select the option from the dropdown
     */
    public void selectFromDropdown(By locator, String value) {
        try {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: windowHandler
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Switches to new window
     * d. Return Type: void
     * e. Parameters: 
     *     - By locator: Locator to find the element on the page that trigger window switch
     */
    public void windowHandler(By locator) {
        try {
            String parent = driver.getWindowHandle();
            clickOnElement(locator);
            Set<String> windows = driver.getWindowHandles();
            for(String child: windows) {
                if(!child.equals(parent)) {
                    driver.switchTo().window(child);
                    break;
                }
            }
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: scrollByValue
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scroll the page by the value
     * d. Return Type: void
     * e. Parameters: 
     *      - int x: Number of pixels to scroll Horizontally
     *      - int y: Number of pixels to scroll Veritically
     */
    public void scrollByValue(int x, int y) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: scrollToElement
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scrolls to a specific element
     * d. Return Type: void
     * e. Parameters: 
     *      - By locator: Locator to find the element on the page
     */
    public void scrollToElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: scrollToEnd
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Scrolls to the end of the page
     * d. Return Type: void
     * e. Parameters: none
     */
    public void scrollToEnd() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    /*
     * a. Method Name: getElements
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Returns a list of web elements
     * d. Return Type: List of web elements
     * e. Parameters:
     *      - String locator: Locator to find the elements on the page
     */
    public List<WebElement> getElements(String locator) {
        try {
            return driver.findElements(By.cssSelector(locator));
        } catch (Exception e) { 
            LoggerHandler.error(e.getMessage());
        }
        return null;
    }
    
    /*
     * a. Method Name: javascriptClick
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clicks on an element using JavascriptExecutor
     * d. Return Type: List of web elements
     * e. Parameters:
     *      - String locator: Locator to find the elements on the page
     */
    public void javascriptClick(By locator) {
        try {
        	WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
	}
    
    /*
     * a. Method Name: javascriptValueClear
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Clears the value in the of the element
     * d. Return Type: void
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     */
    public void javascriptValueClear(By locator) {
        try {
        	WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value = '';", element);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }
    
    
    /*
     * a. Method Name: hoverOverElement
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Hover over the element
     * d. Return Type: void
     * e. Parameters:
     *      - By locator: Locator to find the element on the page
     */
    public void hoverOverElement(By locator) {
    	try {
    		WebElement element = driver.findElement(locator);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		} catch (Exception e) {
			LoggerHandler.error(e.getMessage());
		}
    }    
}
