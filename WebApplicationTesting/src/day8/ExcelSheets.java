package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelSheets {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\Ajay\\Desktop\\Sravani.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f);
		XSSFSheet ws =wb.getSheet("Sheet1");
		int r= ws.getLastRowNum();
		for(int i=0;i<=r;i++)
		{
			
		
		Row r1=ws.getRow(i);
		int c1=r1.getLastCellNum();
		for(int j=0;j<c1;j++)
		{
		Cell c= r1.getCell(j);
		System.out.print(c.getStringCellValue()+" ");
		
		}
		System.out.println();
		}
		
	}

}
