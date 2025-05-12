package uistore;

import org.openqa.selenium.By;

public class ShopOurBrandsLocators {
	public static By shopOurBrandsLabel = By.xpath("//a[text() = 'Shop Our Brands']");
	public static By anvilBrand = By.xpath("//h5[text() = 'Anvil']");
	public static By sortBy = By.xpath("//p[contains(text(), 'Sort by')]");
	public static By priceLowToHigh = By.xpath("//li[contains(text(), 'Low to High')]");
	public static By priceLowToHighLabel = By.xpath("//div[contains(text(), 'Low to High')]");		
}
