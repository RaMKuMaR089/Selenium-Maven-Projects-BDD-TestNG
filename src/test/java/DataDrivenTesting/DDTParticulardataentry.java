package DataDrivenTesting;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DDTParticulardataentry {

			public static void main(String[] args) throws IOException
			{
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\particular.xlsx");
				
				XSSFWorkbook book = new XSSFWorkbook();
				
				XSSFSheet sheet = book.createSheet("particulardata");
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Ente row no "  );
				
				XSSFRow row = sheet.createRow(sc.nextInt());
				
				System.out.println("Enter cell no");
				
				XSSFCell cell = row.createCell(sc.nextInt());
				
				System.out.println("Enter cell values or data....");
				
						cell.setCellValue(sc.next());
				
				
				book.write(file);
				book.close();
				file.close();
				System.out.println("Excel file created....");
				
			}}