package uistore;

import org.openqa.selenium.By;

public class CarbonEmissionsLocators {
	public static By ecoActionsBtn = By.xpath("//a[text() = 'Eco Actions']");
	public static By popUp = By.xpath("//button[@title = 'Close (Esc)']");
	public static By ourPillars = By.xpath("//a[text() = 'Our Pillars ']");
	public static By carbonEmissions = By.xpath("//a[text() = 'Carbon Emissions']");
	public static By carbonEmissionsProducts = By.cssSelector("div[class = 'button-wrap'] > a:nth-child(2)");
	public static By productIndexLabel = By.xpath("//h2[contains(text(), 'Product')]");
}
