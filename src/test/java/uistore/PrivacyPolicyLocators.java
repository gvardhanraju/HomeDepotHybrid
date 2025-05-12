package uistore;

import org.openqa.selenium.By;

public class PrivacyPolicyLocators {
	public static By myStoreBtn = By.cssSelector("div[class = 'sui-absolute sui-left-0 sui-right-0 sui-bottom-0 lg:sui-static lg:sui-w-auto print:sui-contents sui-hidden lg:sui-inline'] > div:nth-child(1) > button");
	public static By workshops = By.xpath("//p[text() = 'Workshops']");
	public static By learnMoreBtn = By.xpath("//div[@class = 'brand-hero__info-box sui-max-w-full sui-gap-2 sui-flex sui-flex-col sui-justify-center sui-p-8 xl:sui-p-6']/a[text() = 'Learn More']");
	public static By privacyPolicy = By.xpath("//a[contains(text(), 'ON24')]");
	public static By infoLabel = By.xpath("//h2[contains(text(), 'Can')]");
}
