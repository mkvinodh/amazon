package com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Selenium {

	private static void example_Selenium() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinod M\\eclipse-workspace\\Example_Selenium\\chrome\\chromedriver.exe");
		// WEBdriver
		// parent class refname = new childclassname

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		// getURL

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public static void main(String[] args) {
		example_Selenium();
	}
}
