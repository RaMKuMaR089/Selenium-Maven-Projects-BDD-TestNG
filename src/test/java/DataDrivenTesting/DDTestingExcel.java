package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTestingExcel {

	
	public static void main(String[] args) throws IOException {
	
		// Getting excel file from location
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/IndustrialVisit.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // or 
	//  XSSFSheet sheet = workbook.getSheetAt(0);
		
	     int totalrows = sheet.getLastRowNum();
	     int totalcells = sheet.getRow(1).getLastCellNum();
	     System.out.println(totalrows);
	     System.out.println(totalcells);
	     
	     //	Getting all data from each cells
	     
	     for  (int r =0; r<=totalrows; r++)
	     {
	    	XSSFRow currentrow= sheet.getRow(r);
	    	
	    	for (int c=0; c<totalcells; c++)
	    	{
	    		XSSFCell currentcell =currentrow.getCell(c);
	    		System.out.print(currentcell.toString() + "\t");
	    	}
	    	System.out.println("\n");
	     }
	     workbook.close();
	     file.close();
	     
	}

}
