package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTExcellDynamic {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\random.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("randata");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows "  );
		
		int noofrows = sc.nextInt();
		
		System.out.println("Enter no of cells");
		
		int noofcells=(sc.nextInt());
		
		System.out.println("Enter cell values or data....");
		
		for (int r=0;r<= noofrows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<noofcells;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		book.write(file);
		book.close();
		file.close();
		System.out.println("Excel file created....");
		
		

	}

}
