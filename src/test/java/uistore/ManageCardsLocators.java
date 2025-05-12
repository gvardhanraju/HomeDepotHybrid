package uistore;

import org.openqa.selenium.By;

public class ManageCardsLocators {
	public static By payandManageCardsBy = By.xpath("//a[text() = 'Pay & Manage Your Card']");
	public static By createNewAccountLabel = By.xpath("(//p[@class = 'sui-font-bold sui-text-lg sui-tracking-normal sui-normal-case sui-line-clamp-unset sui-font-normal sui-text-primary sui-text-center'])[1]");
	public static By emailAddressLabel = By.id("username-label");
	public static By usernameStatusMessage = By.xpath("//p[contains(text(), 'Please provide your email address')]");
	public static By cancelBtn = By.cssSelector("div[class = 'sui-grid sui-grid-cols-4'] button:nth-child(1)");
}
