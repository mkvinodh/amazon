package MAVEN_PROJECT.Maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing {
	@Test
	private void chrome_Browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.youtube.com/");
	}
	@Test

	private void iexplorer_Browser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt = new EdgeOptions();
		WebDriver driver = new EdgeDriver(opt);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

	}
}
