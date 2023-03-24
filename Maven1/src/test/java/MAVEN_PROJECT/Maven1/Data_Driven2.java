package MAVEN_PROJECT.Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven2 {
	public static String to_Read_Data() throws Throwable {
		File source = new File("C:\\Users\\Vinod M\\eclipse-workspace\\Maven1\\data\\Vinod.xlsx");
		FileInputStream input = new FileInputStream(source);
		Workbook work = new XSSFWorkbook(input);
		Cell cell = work.getSheetAt(0).getRow(0).getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			return stringCellValue;
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int ss = (int) numericCellValue;
			System.out.println(ss);
		}
		return null;
	}

	public static void to_Write_Data() throws Throwable {
		File source = new File("C:\\Users\\Vinod M\\eclipse-workspace\\Maven1\\data\\Vinod.xlsx");
		FileInputStream input = new FileInputStream(source);
		Workbook book = new XSSFWorkbook(input);
		book.createSheet("SheetCustom").createRow(0).createCell(0).setCellValue("Data");;
		book.getSheet("SheetCustom").getRow(0).createCell(1).setCellValue("Greens@gmail.com"); 
		FileOutputStream out = new FileOutputStream(source);
		book.write(out);
		book.close();
	}
public static void main (String[] agrs) throws Throwable {
	to_Write_Data();
}
}