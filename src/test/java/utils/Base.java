package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public static WebDriver driver;
	public static FileInputStream file;
	public static Properties properties;
	
	public void openBrowser() {
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "/config/config.properties");
			properties = new Properties();
			properties.load(file);
			
			String browser = properties.getProperty("browser");
			
			switch(browser) {
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "edge":
					driver = new EdgeDriver();
					break;
				default:
					System.out.println("Error with browser specification");
					break;
			}
			
			driver.manage().window().maximize();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
