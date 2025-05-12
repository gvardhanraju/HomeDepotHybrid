package uistore;

import org.openqa.selenium.By;

public class MyPreferenceCenterLocators {
	public static By preferenceCenterBtn = By.xpath("(//a[text() = 'My Preference Center'])[1]");
	public static By emailInputField = By.xpath("//input[@name = 'email-search']");
	public static By phoneNumberInputField = By.xpath("//input[@name = 'phone-search']");
	public static By searchBtn = By.xpath("//span[text() = 'Search']");
	public static By marketingEmails = By.xpath("//u[text() = 'Marketing Emails']");
	public static By emailErrorMessage = By.xpath("(//span[@class = 'form-input-error__message'])[1]");
}
