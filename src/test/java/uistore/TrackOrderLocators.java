package uistore;

import org.openqa.selenium.By;

public class TrackOrderLocators {
	public static By customerServiceCenter = By.cssSelector("div[class = 'sui-flex sui-whitespace-pre'] > a");
	public static By trackAnOrder = By.xpath("(//a[@href = 'https://www.homedepot.com/order/view/tracking'])[1]");
	public static By orderNumberInputField = By.id("orderNumber");
	public static By phoneNumberInputField = By.id("phoneNumber");
	public static By trackOrderBtn = By.cssSelector("div[class = 'sui-flex sui-flex-col sui-gap-8'] > div:nth-child(3) button");
	public static By trackOrderErrorMessage = By.cssSelector("div[class = 'sui-mt-2'] p");
}
