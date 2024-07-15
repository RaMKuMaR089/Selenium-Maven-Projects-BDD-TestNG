package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTestingCreateExcel 
{
public static void main(String args[]) throws IOException
{
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\language.xlsx");
	
	XSSFWorkbook book = new XSSFWorkbook();
	
	XSSFSheet sheet = book.createSheet("Sheet1");
	
	XSSFRow row1 = sheet.createRow(0);
	 row1.createCell(1).setCellValue("java");
	 row1.createCell(2).setCellValue(22);
	 row1.createCell(3).setCellValue("oops");

		XSSFRow row2 = sheet.createRow(1);
		 row2.createCell(1).setCellValue("c#");
		 row2.createCell(2).setCellValue(15);
		 row2.createCell(3).setCellValue("script");
		 
			XSSFRow row3 = sheet.createRow(2);
			 row3.createCell(1).setCellValue("python");
			 row3.createCell(2).setCellValue(5);
			 row3.createCell(3).setCellValue("Automation");
			 
	book.write(file);
	book.close();
	file.close();
	
	System.out.println("Excel File Created....");
	
}
	
	
	
}
