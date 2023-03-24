package MAVEN_PROJECT.Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphone_Task {
	@Test
public void task() throws Throwable {
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);*/
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt = new EdgeOptions();
		WebDriver driver = new EdgeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		File source = new File("C:\\Users\\Vinod M\\eclipse-workspace\\Maven1\\data\\iPhone_data.xlsx");
		FileInputStream input = new FileInputStream(source);
		Workbook book = new XSSFWorkbook(input);
		book.createSheet("iPhones");
		List<WebElement> title = driver.findElements(By.cssSelector("[class='a-size-medium a-color-base a-text-normal']"));
		for(int i=0; i<title.size();i++) {
			System.out.println(title.get(i).getText());
			String text = title.get(i).getText();
			book.getSheet("iPhones").createRow(i).createCell(1).setCellValue(text);
		}
		FileOutputStream output = new FileOutputStream(source);
		book.write(output);
		book.close();
			
		}
	}


