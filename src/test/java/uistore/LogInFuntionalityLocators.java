package uistore;

import org.openqa.selenium.By;

public class LogInFuntionalityLocators {
	public static By loginBtn = By.xpath("//p[text() = 'Log In']");
	public static By homesignInBtn = By.xpath("//a[text() = 'Sign in']");
	public static By emailInputField = By.id("username");
	public static By continueBtn = By.id("sign-in-button");
	public static By passwordInputField = By.id("password-input-field");
	public static By signInBtn = By.xpath("//button[text() = 'Sign In']");
}
