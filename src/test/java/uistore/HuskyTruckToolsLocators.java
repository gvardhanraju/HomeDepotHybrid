package uistore;

import org.openqa.selenium.By;

public class HuskyTruckToolsLocators {
	public static By truckToolBoxes = By.xpath("(//a[text() = 'Truck Tool Boxes'])[1]");
	public static By vehicleSpecific = By.xpath("//p[text() = 'Vehicle Specific']");
	public static By finishColor = By.xpath("//p[text() = 'Finish/Color']");
	public static By matteBlack = By.xpath("//p[text() = 'Matte Black']");
	public static By applyNowBtn = By.xpath("(//button[text() = 'Apply'])[2]");
	public static By matteBlackHuskyTruckLabel = By.xpath("//h1");
}
