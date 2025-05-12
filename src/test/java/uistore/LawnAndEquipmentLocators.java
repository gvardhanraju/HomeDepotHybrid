package uistore;

import org.openqa.selenium.By;

public class LawnAndEquipmentLocators {
	public static By myStoreBtn = By.cssSelector("div[class = 'sui-absolute sui-left-0 sui-right-0 sui-bottom-0 lg:sui-static lg:sui-w-auto print:sui-contents sui-hidden lg:sui-inline'] > div:nth-child(1) > button");
	public static By curbside = By.xpath("//p[text() = 'Curbside']");
	public static By curbsidePickupLabel = By.xpath("//h1");
	public static By learnMore = By.xpath("//a[text() = 'Learn More']");
	public static By rentals = By.xpath("//h5[text() = 'Rentals']");
	public static By rentNowBtn = By.xpath("//a[text() = 'Rent Now']");
	public static By lawnEquipmentLabel = By.xpath("//h1");
}
