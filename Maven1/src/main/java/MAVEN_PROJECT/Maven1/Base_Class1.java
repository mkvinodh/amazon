package MAVEN_PROJECT.Maven1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class1 {

	static WebDriverManager abc;
	static WebDriver driver;
	
		public static void browser_Launch(String browser_Type)
		{
			if(browser_Type.equalsIgnoreCase("chrome"))
			{
				abc.chromedriver().setup();
				ChromeOptions opt = new ChromeOptions();
				driver = new ChromeDriver(opt);				
			}else if(browser_Type.equalsIgnoreCase("Firefox"))
			{
				abc.firefoxdriver().setup();
				FirefoxOptions opt = new FirefoxOptions();
				driver = new FirefoxDriver(opt);	
			}else if(browser_Type.equalsIgnoreCase("edge"))
			{
				abc.edgedriver().setup();
				EdgeOptions opt = new EdgeOptions();
				driver = new EdgeDriver(opt);				
			
			}
			
	}
		
		
		public static void close_Driver() {
			driver.close();
		}
		
		public static void quit_Driver() {
			driver.quit();
		}
		
		public static void navigate_To(String url) {
			driver.navigate().to(url);
		}
		
		public static void get_Url(String url) {
			driver.get(url);
		}
		
		public static void navigate_Back() {
			driver.navigate().back();
		}
		
		public static void navigate_Forward() {
			driver.navigate().forward();
		}
		
		public static void navigate_Refresh() {
			driver.navigate().refresh();
		}
		
		public static void get_CurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current url is : " + currentUrl);
		}
		
		public static void click(WebElement element) {
			element.click();
		}
		
		public static void takes_Screenshot(String name) throws Throwable
		{
			
			TakesScreenshot screen = (TakesScreenshot)driver;
			File source = screen.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\MvnPractice\\screen_folder\\"+name+".png");
			FileUtils.copyFile(source, dest);
		}
		
		public static void sendKeys(WebElement element, String data) {
			element.sendKeys(data);
		}

		public static void maximize_Window()
		{
			driver.manage().window().maximize();
		}
		
		public static void get_Title() {
			String title = driver.getTitle();
			System.out.println("Url Title : " + title);
		}
		
		public static void get_Attribute(WebElement element, String data)
		{
			String attribute = element.getAttribute(data);
			System.out.println(attribute);
		}
		
		
		public static void robot_Functions() throws Throwable
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
		}
		
		public static void action_Methods(WebElement element, String function_name)
		{
			Actions act = new Actions(driver);
			if(function_name.equalsIgnoreCase("Right Click"))
			{
				act.contextClick(element).build().perform();;
			}
			else if(function_name.equalsIgnoreCase("Double Click"))
			{
				act.doubleClick().build().perform();
			}
			else if(function_name.equalsIgnoreCase("MoveToElement"))
			{
				act.moveToElement(element);
			}
			else if(function_name.equalsIgnoreCase("Click and Drag"))
			{
				act.clickAndHold().build().perform();
			}
		}
		
		public static void drag_Drop(WebElement element1, WebElement element2)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(element1, element2);
		}
		
		
		public static void windowHandling(String data)
		{

			if(data.equalsIgnoreCase("Window Handle"))
			{
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);	
			}
			else if(data.equalsIgnoreCase("Window Handles"))
			{
				Set<String> windowHandles = driver.getWindowHandles();
				for (String s : windowHandles) {
					System.out.println(s);
				}
			}		
		}
		
		
		public static void frame_Functions(WebElement element, String data)
		{
			if(data.equalsIgnoreCase("Frame"))
			{
				driver.switchTo().frame(element);
			}
			else if(data.equalsIgnoreCase("Default Content"))
			{
				driver.switchTo().defaultContent();
			}
		}
		
		@SuppressWarnings("deprecation")
		public static void implicit_wait()
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public static void alert()
		{
			driver.switchTo().alert().dismiss();
		}
		
		public static void single_drop_Down(WebElement single, String option, String value)
		{
			
			Select s = new Select(single);
			
			if(option.equalsIgnoreCase("value"))
			{
			s.selectByValue(value);	
			}else if(option.equalsIgnoreCase("index"))
			{
			s.selectByIndex(Integer.parseInt(value));	
			}else if(option.equalsIgnoreCase("Visible_Text"))
			{
			s.selectByVisibleText(value);	
			}
			
		}
		
		public static void multiple_drop_Down(WebElement single, String option, String value)
		{
			
			Select s = new Select(single);
			
			if(option.equalsIgnoreCase("value"))
			{
			s.selectByValue(value);	
			}else if(option.equalsIgnoreCase("index"))
			{
			s.selectByIndex(Integer.parseInt(value));	
			}else if(option.equalsIgnoreCase("Visible_Text"))
			{
			s.selectByVisibleText(value);	
			}
			
		}
		
			
		
}
