package uistore;

import org.openqa.selenium.By;

public class OrderCancellationLocators {
	public static By orderCancellationBtn = By.xpath("//a[text() = 'Order Cancellation']");
	public static By footerEmailInputField = By.id("footer-email-input");
	public static By goBtn = By.xpath("//button[text()]");
	public static By invalidEmailErrorMessage = By.xpath("//p[contains(text(), 'Invalid email')]");
	public static By unableToSignupErrorMessage = By.xpath("//p[contains(text(), 'Unable')]");
	public static By requiredErrorMessage = By.xpath("//p[contains(text(), 'Req')]");
}
