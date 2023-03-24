package MAVEN_PROJECT.Maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	static WebDriverManager abc;
	static WebDriver driver;

	public static void browser_Launch(String browser_Type) {
		
		if(browser_Type.equalsIgnoreCase("chrome"))
		{
			abc.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			driver = new ChromeDriver(opt);
		} else if(browser_Type.equalsIgnoreCase("edge"))
		{
			abc.edgedriver().setup();
			EdgeOptions opt = new EdgeOptions();
			driver = new EdgeDriver(opt);
		} else if(browser_Type.equalsIgnoreCase("firefox"))
				{
			abc.firefoxdriver().setup();
			FirefoxOptions opt = new FirefoxOptions();
			driver = new FirefoxDriver(opt);
		} else if(browser_Type.equalsIgnoreCase("explorer")) {
			abc.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}

	public static void close_driver() {
		driver.close();
	}

	public static void data_Passing(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void action_Methods(WebElement element, String function_name) {
		Actions act = new Actions(driver);
		if(function_name.equalsIgnoreCase("contextClick")) {
			act.contextClick(element).build().perform();
		}
	}
}
