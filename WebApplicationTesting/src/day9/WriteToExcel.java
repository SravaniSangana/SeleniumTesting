package day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream f =new FileInputStream("C:\\Users\\Ajay\\Desktop\\Sravani.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=ws.createRow(0);
		Cell c=r.createCell(0);
	c.setCellValue("sravani");
	FileOutputStream f1=new FileOutputStream("C:\\Users\\Ajay\\Desktop\\Sravani.xlsx");
	wb.write(f1);
		
		

	}

}
