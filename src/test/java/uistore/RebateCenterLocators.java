package uistore;

import org.openqa.selenium.By;

public class RebateCenterLocators {
	public static By ecoActionsBtn = By.xpath("//a[text() = 'Eco Actions']");
	public static By popUp = By.xpath("//button[@title = 'Close (Esc)']");
	public static By rebateCenter = By.xpath("//a[text() = 'Rebate Finder']");
	public static By homeBtn = By.cssSelector("div[class = 'sui-relative sui-z-1 sui-overflow-x-auto sui-whitespace-nowrap sui-pr-2 sui-pb-1'] > div:nth-child(1) a");
	public static By rebateCenterLabel = By.xpath("//h1[text() = 'Rebate Center']");
}
