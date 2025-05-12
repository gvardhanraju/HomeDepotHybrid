package uistore;

import org.openqa.selenium.By;

public class AffiliateProgramLocators {
	public static By affiliateProgram = By.xpath("//a[text() = 'Affiliate Program']");
	public static By affiliateHomeProgram = By.xpath("(//a[text() = 'Get Started'])[1]");
	public static By signInBtn = By.xpath("//button[text() = 'Sign in']");
	public static By forgotPasswordBtn = By.xpath("//a[text() = 'Forgot Password']");
	public static By emailInputField = By.id("j_email");
	public static By submitBtn = By.id("loginButton");
	public static By invalidEmailAddress = By.xpath("//div[@class = 'error_container']//div");
	public static By sentEmailSuccessfull = By.className("forgot_password_success_msg");
}
