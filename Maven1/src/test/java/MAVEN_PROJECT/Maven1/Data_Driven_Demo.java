package MAVEN_PROJECT.Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Demo {
	
	public static void to_Start_Browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
	}
	
		public static void to_Read_Data() throws Throwable {
		File source = new File("C:\\Users\\Vinod M\\eclipse-workspace\\Maven1\\data\\Vinod.xlsx");
		FileInputStream input = new FileInputStream(source);
		Workbook work = new XSSFWorkbook(input);
		Cell cell = work.getSheetAt(0).getRow(0).getCell(3);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int ss = (int) numericCellValue;
			System.out.println(ss);
		}
		
	}
	

public static void main(String[] args) throws Throwable {
	to_Read_Data();
	to_Start_Browser();
}
}
