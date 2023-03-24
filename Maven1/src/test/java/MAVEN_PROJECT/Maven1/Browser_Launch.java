package MAVEN_PROJECT.Maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Launch extends Base_Class {
	@Test
	
private void launch() {
	//WebDriverManager.chromedriver().setup();
	//ChromeOptions opt = new ChromeOptions();
	//WebDriver driver = new ChromeDriver(opt);
		browser_Launch("chrome");
	driver.get("https://www.luluhypermarket.in/en-in");
}
	
	
}
